import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GraphicsTimeConverter extends JPanel implements ActionListener, PropertyChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GraphicsTimeConverter() {
		
		FlowLayout bl = new FlowLayout();
		
		this.setLayout(bl);
		JPanel selector_from = new JPanel();
		selector_from.setLayout(new BoxLayout(selector_from, BoxLayout.Y_AXIS));
		
		JPanel selector_to = new JPanel();
		selector_to.setLayout(new BoxLayout(selector_to, BoxLayout.Y_AXIS));
		
		
//		
		cb_from = new JComboBox<String>();
		cb_from.addItem("second");
		cb_from.addItem("minute");
		cb_from.addItem("hour");
		cb_from.addItem("day");
		cb_from.addItem("week");		 
		cb_from.addItem("month");	
		cb_from.addItem("year");	
		cb_from.addItem("decade");	
		cb_from.addItem("century");	
		
		
		cb_to = new JComboBox<String>();
		cb_to.addItem("second");
		cb_to.addItem("minute");
		cb_to.addItem("hour");
		cb_to.addItem("day");
		cb_to.addItem("week");		 
		cb_to.addItem("month");	
		cb_to.addItem("year");	
		cb_to.addItem("decade");	
		cb_to.addItem("century");
//		 
//		
		JTextField first = new JTextField(10);
		first.addPropertyChangeListener(this);
		selector_from.add(first);
		selector_from.add(cb_from);
		
		JTextField second = new JTextField(10);
		second.addPropertyChangeListener(new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println("asa"+e.getNewValue());
			}
			
		});
		selector_to.add(second);
		selector_to.add(cb_to);
		
		add(selector_from);
		add(selector_to);
	}
	
	private  JComboBox<String> cb_from;
	private  JComboBox<String> cb_to;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		System.out.println(""+e.getNewValue());
	}

}
