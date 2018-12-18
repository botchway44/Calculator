import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import core.Calculate;
import core.Striper;

public class Scientific2 extends JPanel{

	public Scientific2() {
		this.setLayout(new BorderLayout());
		init();
	}

	public void init() {
	
	screen = new JPanel();
	screen.setBackground(Color.gray);
	//screen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	

	buttons = new JPanel(new GridLayout(7,4));
	centerPanel = new JPanel();
	centerPanel.setLayout(new BoxLayout (centerPanel, BoxLayout.Y_AXIS));
	setButtons();
	setScreen();
	
	centerPanel.add(screen);
	centerPanel.add(buttons);
	
	add(centerPanel,BorderLayout.CENTER);
	
	}

	public void setButtons(){
		JButton sine = new JButton("sin");
		sine.addActionListener(new BtnActionListeners());
		buttons.add(sine);
		
		JButton cos = new JButton("cos");
		cos.addActionListener(new BtnActionListeners());
		buttons.add(cos);
		
		JButton tan = new JButton("tan");
		tan.addActionListener(new BtnActionListeners());
		buttons.add(tan);
		
		JButton log = new JButton("log");
		log.addActionListener(new BtnActionListeners());
		buttons.add(log);
		
	
		
		JButton op_dot = new JButton(".");
		op_dot.addActionListener(new BtnActionListeners());
		buttons.add(op_dot);
		
		JButton clearAll = new JButton(C);
		clearAll.addActionListener(new BtnActionListeners());
		buttons.add(clearAll);
		
		JButton delete = new JButton(DEL);
		delete.addActionListener(new BtnActionListeners());
		buttons.add(delete);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new BtnActionListeners());
		buttons.add(divide);
		
		
		JButton num_7 = new JButton("7");
		num_7.addActionListener(new BtnActionListeners());
		buttons.add(num_7);
		
		
		JButton num_8 = new JButton("8");
		num_8.addActionListener(new BtnActionListeners());
		buttons.add(num_8);
		
		
		JButton num_9 = new JButton("9");
		num_9.addActionListener(new BtnActionListeners());
		buttons.add(num_9);
		
		
		JButton op_multiply = new JButton("*");
		op_multiply.addActionListener(new BtnActionListeners());
		buttons.add(op_multiply);
		
		
		JButton num_4 = new JButton("4");
		num_4.addActionListener(new BtnActionListeners());
		buttons.add(num_4);
		
		
		JButton num_5 = new JButton("5");
		num_5.addActionListener(new BtnActionListeners());
		buttons.add(num_5);
		
		
		JButton num_6 = new JButton("6");
		num_6.addActionListener(new BtnActionListeners());
		buttons.add(num_6);
		
		
		JButton op_minus = new JButton("-");
		op_minus.addActionListener(new BtnActionListeners());
		buttons.add(op_minus);
		
		
		JButton num_1 = new JButton("1");
		num_1.addActionListener(new BtnActionListeners());
		buttons.add(num_1);
		
		
		JButton num_2 = new JButton("2");
		num_2.addActionListener(new BtnActionListeners());
		buttons.add(num_2);
		
		
		JButton num_3 = new JButton("3");
		num_3.addActionListener(new BtnActionListeners());
		buttons.add(num_3);
		
		JButton op_plus = new JButton("+");
		op_plus.addActionListener(new BtnActionListeners());
		buttons.add(op_plus);
		
		JButton op_open = new JButton("(");
		op_open.addActionListener(new BtnActionListeners());
		buttons.add(op_open);
		

		JButton num_0 = new JButton("0");
		num_0.addActionListener(new BtnActionListeners());
		buttons.add(num_0);
		
		JButton op_close = new JButton(")");
		op_close.addActionListener(new BtnActionListeners());
		buttons.add(op_close);
		
		
		
		
		
		JButton op_equal = new JButton(EQUAL);
		op_equal.addActionListener(new BtnActionListeners());
		buttons.add(op_equal);
		
	}
	
	public void setScreen() {
		consoleview = new JLabel("2+3");
		Font myFont = new Font("Serif", Font.PLAIN, 30);		
		consoleview.setForeground(Color.white);
		consoleview.setFont(myFont);
		//screen.setLayout(null);
		screen.add(consoleview);
	}
	

	/*String Action Commands*/
	private static final String CE = "CE";
	private static final String C = "C";
	private static final String DEL = "del";
	private static final String EQUAL = "=";
	private static final String PLUS_OR_MINUS = "+/-";
	
	private boolean showing_answer =false;
	private boolean lock_mode =false;
	
	private String typed_expression="";
	private JPanel screen;
	private JPanel buttons;
	private JPanel centerPanel; //has the buttons and screen
	private JLabel consoleview; //has the manipulated string
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private class BtnActionListeners implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getActionCommand().equals(EQUAL)) {
				
				if(Striper.checkParenthesis(typed_expression)) {
					if(Calculate.calc(typed_expression)) {
						consoleview.setText(Calculate.getAnswer());
						showing_answer = true;
						typed_expression = "";
					}
				}else {
					//set error
					showing_answer = true;
					consoleview.setText("Math Error");
				}
			}else if(e.getActionCommand().equals(CE)) {
				
			}else if(e.getActionCommand().equals(C)) {
				typed_expression =" ";		
			}else if(e.getActionCommand().equals(PLUS_OR_MINUS)) {
				
				
			}else if(e.getActionCommand().equals("log")) {
				//lock_mode  = true;
				//grab next number and find log of num
				//add to expression
				
			}else if(e.getActionCommand().equals(PLUS_OR_MINUS)) {
				
			
			}else if(e.getActionCommand().equals(DEL)) {
				typed_expression = typed_expression.substring(0,typed_expression.length()-1);
			}else {
				typed_expression += e.getActionCommand();
				showing_answer = false;
			}
			
			if(!showing_answer && !lock_mode) {
				consoleview.setText(typed_expression);
			}
					}
		
	}
}
