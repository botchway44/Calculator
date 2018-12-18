import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GraphicsDigitalStorageConverter extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public GraphicsDigitalStorageConverter() {

		FlowLayout bl = new FlowLayout();
		
		this.setLayout(bl);
		JPanel selector_from = new JPanel();
		selector_from.setLayout(new BoxLayout(selector_from, BoxLayout.Y_AXIS));
		
		JPanel selector_to = new JPanel();
		selector_to.setLayout(new BoxLayout(selector_to, BoxLayout.Y_AXIS));
		
		
//		
		cb_from = new JComboBox<String>();
		cb_from.addItem("Bit");
		cb_from.addItem("Kilobit");
		cb_from.addItem("Kibibit");
		cb_from.addItem("Megabit");
		cb_from.addItem("Mebibit");		 
		cb_from.addItem("Gigabit");	
		cb_from.addItem("Gibibit");	
		cb_from.addItem("Terabit");	
		cb_from.addItem("Tebibit");	
		cb_from.addItem("Petabit");	
		cb_from.addItem("Pebibit");	
		cb_from.addItem("Byte");	
		cb_from.addItem("Kilobyte");	
		cb_from.addItem("Kibibyte");	
		cb_from.addItem("Megabyte");	
		cb_from.addItem("Mebibyte");	
		cb_from.addItem("Gigabyte");	
		cb_from.addItem("Gibibyte");	
		cb_from.addItem("Terabyte");	
		cb_from.addItem("Tebibyte");	
		cb_from.addItem("Petabyte");	
		cb_from.addItem("Pebibyte");	
		
		
		cb_to = new JComboBox<String>();
		cb_to.addItem("Bit");
		cb_to.addItem("Kilobit");
		cb_to.addItem("Kibibit");
		cb_to.addItem("Megabit");
		cb_to.addItem("Mebibit");		 
		cb_to.addItem("Gigabit");	
		cb_to.addItem("Gibibit");	
		cb_to.addItem("Terabit");	
		cb_to.addItem("Tebibit");	
		cb_to.addItem("Petabit");	
		cb_to.addItem("Pebibit");	
		cb_to.addItem("Byte");	
		cb_to.addItem("Kilobyte");	
		cb_to.addItem("Kibibyte");	
		cb_to.addItem("Megabyte");	
		cb_to.addItem("Mebibyte");	
		cb_to.addItem("Gigabyte");	
		cb_to.addItem("Gibibyte");	
		cb_to.addItem("Terabyte");	
		cb_to.addItem("Tebibyte");	
		cb_to.addItem("Petabyte");	
		cb_to.addItem("Pebibyte");	
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
