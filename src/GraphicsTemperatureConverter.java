import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import conversions.Temperature;


public class GraphicsTemperatureConverter extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public GraphicsTemperatureConverter() {
		
		BorderLayout bl = new BorderLayout();
		
		this.setLayout(bl);
		
		
		JPanel front_panel = new JPanel();
		front_panel.setLayout(new BoxLayout (front_panel, BoxLayout.Y_AXIS));
		
		
		screen = new JLabel("Screen");
		front_panel.add(screen);
		
		input = new JTextField(12);
		front_panel.add(input);
		
		JPanel buttons_panel = new JPanel(new GridLayout(2,3));
		
		JButton fel_to_cel = new JButton("F -> C");
		fel_to_cel.addActionListener(this);
		buttons_panel.add(fel_to_cel);
		
		JButton cel_to_fel = new JButton("C -> F");
		cel_to_fel.addActionListener(this);
		buttons_panel.add(cel_to_fel);
		
		JButton cel_to_kel = new JButton("C -> K");
		cel_to_kel.addActionListener(this);
		buttons_panel.add(cel_to_kel);
		
		JButton kel_to_cel = new JButton("K -> C");
		kel_to_cel.addActionListener(this);
		buttons_panel.add(kel_to_cel);
		
		add(buttons_panel,  BorderLayout.SOUTH);
		
		add(front_panel, BorderLayout.CENTER);
		
		
	}
	
	
	private JLabel screen;
	private JTextField  input;
//	private JTextField c_to_f;
//	private JTextField c_to_f;


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(input.getText().equals("")) input.setText("0");//set input to zero
		
		if(e.getActionCommand().equals("F -> C")) {
			screen.setText(Temperature.FahrenhiteToCelcius(Double.parseDouble(input.getText())) + " C");
			//System.out.print("12");
		}else if(e.getActionCommand().equals("C -> F")) {
			screen.setText(Temperature.CelciusToFahrenheite(Double.parseDouble(input.getText())) + " F");
			//System.out.print("12");
		}else if(e.getActionCommand().equals("K -> C")) {
			screen.setText(Temperature.KelvinToCelcius(Double.parseDouble(input.getText())) + " C");
			//System.out.print("12");
		}else if(e.getActionCommand().equals("C -> K")) {
			screen.setText(Temperature.CelciusToKelvin(Double.parseDouble(input.getText())) + " K");
			//System.out.print("12");
		}else if(e.getActionCommand().equals("K -> F")) {
			screen.setText(Temperature.KelvinToFahrenheite(Double.parseDouble(input.getText())) + " F");
			//System.out.print("12");
		}else if(e.getActionCommand().equals("F -> K")) {
			screen.setText(Temperature.FahrenhiteToKelvin(Double.parseDouble(input.getText())) + " K");
			//System.out.print("12");
		}
	}
}
