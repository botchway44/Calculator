import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsCalculator extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel top;
	private JPanel center;
	private Object panel;

	private JComboBox<String> cb;
	
	public  GraphicsCalculator() {
		this.setTitle("Calculator 1.0");
		this.setLayout(new BorderLayout());
		this.setSize(250,300);	
		setIcon("res/logo.png");
		this.setResizable(true);
		top = new JPanel();		
		top.setLayout(new BoxLayout (top, BoxLayout.Y_AXIS));
		center = new JPanel();
		
		setTop();
		add(top,BorderLayout.NORTH);
		add(center,BorderLayout.CENTER);
		
		panel = new Scientific2();
		center.add((Component) panel);
	}
	
	public void setIcon(String directory) {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(directory));
		} catch (IOException e) {
		}
		
		this.setIconImage(img);
	}
	public void setTop() {
		 cb = new JComboBox<String>();
		 cb.addItem("scientific");
		 cb.addItem("volume");
		 cb.addItem("temperature");
		 cb.addItem("Digital Storage");
		 cb.addItem("Lenght");		 
		 cb.addItem("Time");		 
		
		 top.add(cb);
		 cb.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		@SuppressWarnings("unchecked")
		JComboBox<String> cb = (JComboBox<String>)e.getSource();
        String name = (String)cb.getSelectedItem();
        
		if(name.equals("scientific")) {
			panel =new Scientific2(); 
		}
		if(name.equals("volume")) {
			panel =new GraphicsVolumeConverter(); 
		}
		
		if(name.equals("temperature")) {
			panel =new GraphicsTemperatureConverter(); 
			
		}
		
		if(name.equals("Digital Storage")) {
			panel =new GraphicsDigitalStorageConverter(); 
			
		}
		
		if(name.equals("Lenght")) {
			panel =new GraphicsLengthConverter(); 
			
		}
		
		if(name.equals("Time")) {
			panel =new GraphicsTimeConverter(); 
			
		}
		
		center.removeAll();
		center.add((Component) panel, BorderLayout.CENTER);
		this.revalidate();
		this.repaint();
		
		
		System.out.println(name);
	}
}
