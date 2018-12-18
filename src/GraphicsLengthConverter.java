import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GraphicsLengthConverter extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GraphicsLengthConverter() {

		FlowLayout bl = new FlowLayout();
		
		this.setLayout(bl);
		JPanel selector_from = new JPanel();
		selector_from.setLayout(new BoxLayout(selector_from, BoxLayout.Y_AXIS));
		
		JPanel selector_to = new JPanel();
		selector_to.setLayout(new BoxLayout(selector_to, BoxLayout.Y_AXIS));
		
		
//		
		cb_from = new JComboBox<String>();
		cb_from.addItem("Kilometer");
		cb_from.addItem("Meter");
		cb_from.addItem("Centimeter");
		cb_from.addItem("Millimeter");
		cb_from.addItem("Micrometer");		 
		cb_from.addItem("Nanometer");	
		cb_from.addItem("Mile");	
		cb_from.addItem("Yard");	
		cb_from.addItem("Foot");	
		cb_from.addItem("Inch");	
		
		
		cb_to = new JComboBox<String>();
		cb_to.addItem("Kilometer");
		cb_to.addItem("Meter");
		cb_to.addItem("Centimeter");
		cb_to.addItem("Millimeter");
		cb_to.addItem("Micrometer");		 
		cb_to.addItem("Nanometer");	
		cb_to.addItem("Mile");	
		cb_to.addItem("Yard");	
		cb_to.addItem("Foot");	
		cb_to.addItem("Inch");
//		 
//		
		selector_from.add(new JTextField(20));
		selector_from.add(cb_from);
		
		selector_to.add(new JTextField(10));
		selector_to.add(cb_to);
		add(selector_from);
		add(selector_to);
	}
	
	private  JComboBox<String> cb_from;
	private  JComboBox<String> cb_to;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
