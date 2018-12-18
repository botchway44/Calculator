import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import acm.program.Program;
import core.Calculate;
import core.Striper;

public class Scientific extends Program{


	public void init() {
	this.setSize(250,400);	
	this.setTitle("Calculator 1.0");
	this.setVisible(true);
	this.setLayout(new BorderLayout());
	
	screen = new JPanel();
	screen.setBackground(Color.gray);
	//screen.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	

	buttons = new JPanel(new GridLayout(8,4));
	centerPanel = new JPanel();
	centerPanel.setLayout(new BoxLayout (centerPanel, BoxLayout.Y_AXIS));
	setButtons();
	setScreen();
	
	centerPanel.add(screen);
	centerPanel.add(buttons);
	
	add(centerPanel,BorderLayout.CENTER);
	
	addActionListeners();
	}
	
	public void run() {
		
			
	}
	
	public void setButtons(){
		
		buttons.add(new JButton("sin"));
		buttons.add(new JButton("cos"));
		buttons.add(new JButton("tan"));
		buttons.add(new JButton("log"));
		
		buttons.add(new JButton("sin"));
		buttons.add(new JButton("cos"));
		buttons.add(new JButton("tan"));
		buttons.add(new JButton("log"));
		
		buttons.add(new JButton(CE));
		buttons.add(new JButton(C));
		buttons.add(new JButton(DEL));
		buttons.add(new JButton("/"));
		buttons.add(new JButton("7"));
		buttons.add(new JButton("8"));
		buttons.add(new JButton("9"));
		buttons.add(new JButton("*"));
		buttons.add(new JButton("4"));
		buttons.add(new JButton("5"));
		buttons.add(new JButton("6"));
		buttons.add(new JButton("-"));
		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));
		buttons.add(new JButton("+"));
		
		buttons.add(new JButton("("));
		buttons.add(new JButton(")"));
		buttons.add(new JButton("tan"));
		buttons.add(new JButton("log"));
		
		buttons.add(new JButton("("));
		buttons.add(new JButton("0"));
		buttons.add(new JButton("."));
		buttons.add(new JButton(EQUAL));
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals(EQUAL)) {
			println("calculating answer");
			if(Striper.checkParenthesis(typed_expression)) {
				if(Calculate.calc(typed_expression)) {
					consoleview.setText(Calculate.getAnswer());
					showing_answer = true;
					typed_expression = "";
				}
			}else {
				//set error
			}
		}else if(e.getActionCommand().equals(CE)) {
			
		}else if(e.getActionCommand().equals(C)) {
			typed_expression ="";		
		}else if(e.getActionCommand().equals(PLUS_OR_MINUS)) {
			
		
		}else if(e.getActionCommand().equals(DEL)) {
			typed_expression = typed_expression.substring(0,typed_expression.length()-1);
		}else {
			typed_expression += e.getActionCommand();
			showing_answer = false;
		}
		
		if(!showing_answer) {
			consoleview.setText(typed_expression);
		}
		}

	public void setScreen() {
		consoleview = new JLabel("2 + 3");
		Font myFont = new Font("Serif", Font.PLAIN, 22);		
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
	private String typed_expression="";
	private JPanel screen;
	private JPanel buttons;
	private JPanel centerPanel; //has the buttons and screen
	private JLabel consoleview; //has the manipulated string
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
