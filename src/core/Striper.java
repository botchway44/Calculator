package core;
import java.util.ArrayList;
import java.util.Stack;

public class Striper {
	private String expression;
	private Postfix postfix;
	 
	public Striper(String exp) {
		this.expression = exp;
		postfix = new Postfix();
	}
	
	public static boolean checkParenthesis(String expression) {
	 Stack<String> p_stack = new Stack<String>();;
	 if(expression.contains("(")) {
		 int len = expression.length();
		 for(int i=0; i<len; i++) {
			 String temp = expression.charAt(i) +"";
			 if(temp.equals("(")) {
				 p_stack.push("(");
			 }else if(temp.equals(")")) {
				try { p_stack.pop(); } catch(Exception e) { return false;}
			 }
		 }
		 
		 if(!p_stack.isEmpty()) return false;
	 }
	 
	 
	 return true;
	}
	
	//Strip the expression of the form A+B*C into array
	public String stripExpression() {
		String exp = expression;
		int openIndex = 0; 
		int closeIndex = 0; 
		
		//TODO STRIP PARENTHESISs
		 while(exp.contains("(") || exp.contains(")")) {
			 for(int i=0; i<exp.length(); i++) {
				 if(exp.charAt(i) == '(') {
					 openIndex = i;
				 }
				 if(exp.charAt(i) == ')') {
					 closeIndex = i;
					  break;
				 }
			 }
			
			 System.out.println(openIndex+" "+closeIndex);
			 String newExp = exp.substring(openIndex, closeIndex+1);
			 System.out.println("Extracted "+newExp);
			 ArrayList<String> postexp = removeAllSpacesFromArray(extractArrray(removeAllSpaces(newExp.substring(1,newExp.length()-1))));
			 postfix.setExpression(postexp);
			 postfix.parse();
			 Double ans = postfix.calculateExp();
			 
//			System.out.println(openIndex+" "+closeIndex);
//			System.out.println("Extracted "+newExp);
//			System.out.println("remove all spaces "+removeAllSpaces(newExp.substring(1,newExp.length()-1)));
//			System.out.println(extractArrray(removeAllSpaces(newExp.substring(1,newExp.length()-1))));
//			System.out.println(removeAllSpacesFromArray(extractArrray(removeAllSpaces(newExp.substring(1,newExp.length()-1)))));
//			System.out.println(removeAllSpacesFromArray(extractArrray(removeAllSpaces(newExp.substring(1,newExp.length()-1)))));
			
			exp =  exp.substring(0,openIndex) + ans  +exp.substring(closeIndex+1) ;
			System.out.println(exp);
		 }	
		
		 ArrayList<String> postexp = extractArrray(exp);
		 postfix.setExpression(postexp);
		 postfix.parse();
	
		 
		return  ""+postfix.calculateExp();
	}
	
	public String removeAllSpaces(String exp) {
		 int len = exp.length();
		 String temp = "";
		for(int i=0; i<len; i++) {
			System.out.println(exp.charAt(i));
			if(!(exp.charAt(i)+"").equals(" ")) temp+=exp.charAt(i);
		}
		
		return temp;
	}
	
	public ArrayList<String> removeAllSpacesFromArray(ArrayList<String> exp) {
		ArrayList<String> temp = new  ArrayList<String>();
		 int len = exp.size();
	
		for(int i=0; i<len; i++) {
			if(!exp.get(i).equals("")) {
				temp.add(exp.get(i));
			}
		}
		
		return temp;
	}
	
	public static ArrayList<String> extractArrray(String exp){
		 ArrayList<String> postfix = new  ArrayList<String>();
		 
		 boolean statusFlag = false;
		 int len = exp.length();
		 String op = "";
		 
		 for(int i=0; i<len; i++) {
			
			 if(Postfix.isOperator(exp.charAt(i)+"")) {
				 statusFlag = true;
			 }
			 
			 if(i==0 && exp.charAt(i) == '-'){
				 statusFlag = false;
			 }
			 
			 if(statusFlag == true) {
				 postfix.add(op);
				 op = "";
				 postfix.add(exp.charAt(i)+"");
				 statusFlag = false;
			 }else {
				 op+=exp.charAt(i);
			 }
			 
		 }
		 
		 postfix.add(op);
		
		return postfix;
	}
		
}
