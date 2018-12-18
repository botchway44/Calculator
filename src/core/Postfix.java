package core;
import java.util.ArrayList;
import java.util.Stack;

public class Postfix {

	private  ArrayList<String> expression_array;
	private ArrayList<String> post_fix_array;

	public Postfix() {
		post_fix_array = new ArrayList<String>();
	}
	
	public Postfix( ArrayList<String> expression) {
		this.expression_array = expression;
		post_fix_array = new ArrayList<String>();
	}
	
	public void setExpression( ArrayList<String> expression) {
		this.expression_array = expression;
	}
	
	public void parse() {
	 Stack<String> operator_stack = new Stack<String>();

		int len = expression_array.size();
		for(int i=0; i<len; i++) {
			String op = expression_array.get(i);
			
			//check if is operator
			if(isOperator(op)) {
				//check if operator stack is empty
				if(operator_stack.isEmpty()) {
					operator_stack.add(op);
				}else {
					//get the operator in the stack
					String op_in_stack = operator_stack.pop();
					
					//check for precedence
					if(isHigher(op,op_in_stack)) {
						//if is higher push
						operator_stack.push(op_in_stack);
						operator_stack.push(op);
					}else {
						operator_stack.push(op);
						post_fix_array.add(op_in_stack);
					}
				}
				
				//is an operand
			}else {	
				post_fix_array.add(op);
			}
		}
		
		//push all other operators to the array
		while(!operator_stack.isEmpty()) {
			post_fix_array.add(operator_stack.pop());
		}
	}
	
	public Double calculateExp() {
		 Stack<Double> eval = new Stack<Double>();

		int size = post_fix_array.size();
		for(int i=0; i<size; i++) {
			String temp = post_fix_array.get(i);
			
			if(isOperator(temp)) {
				double op2 = eval.pop();
				double op1 = eval.pop();
				
				eval.add(math(op1,temp,op2));
			}else {
				eval.add(Double.parseDouble(temp));
				
			}
		}
		
		return eval.pop();
	}
	
	public static Boolean isOperator(String ch) {
		if(ch.equals("+")) return true;
		if(ch.equals("-")) return true;
		if(ch.equals("/")) return true;
		if(ch.equals("*")) return true;
		
		return false;
	}
	
	//check if precedence of operator1 is higher than operator2
	private Boolean isHigher(String operator1, String operator2) {
		if(operator1.equals("/") && operator1.equals("+")) return true;
		if(operator1.equals("/") && operator1.equals("-")) return true;
		if(operator1.equals("/") && operator1.equals("*")) return true;
		if(operator1.equals("/") && operator1.equals("/")) return true;
		if(operator1.equals("*") && operator1.equals("*")) return true;
		if(operator1.equals("*") && operator1.equals("+")) return true;
		if(operator1.equals("*") && operator1.equals("-")) return true;
		if(operator1.equals("+") && operator1.equals("-")) return true;
		if(operator1.equals("+") && operator1.equals("+")) return true;
		if(operator1.equals("-") && operator1.equals("-")) return true;
		
		return false;
	}
	
	private double math(double operand1, String operator, double operator2) {
		
		if(operator.equals("+")) return operand1 + operator2;
		if(operator.equals("-")) return operand1 - operator2;
		if(operator.equals("*")) return operand1 * operator2;
		if(operator.equals("/")) return operand1 / operator2;
		
		return 0;
	}
	
	
	public String toString() {
		return post_fix_array.toString();
	}
}
