package eventhandling;
import java.awt.event.*;

import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;  

import java.awt.*;

public class SampleForm extends Frame implements ActionListener,WindowListener{
	
	TextField tf1,tf2;
	Label l1,l2;
	SampleForm()
	{
		//creating components
		l1 = new Label("Enter username ");
		tf1 = new TextField();
		l2 = new Label("Enter password  ");
		tf2 = new TextField();
		
		Button b = new Button("Submit");
		//l = new Label();
		
		//registering the components
		b.addActionListener(this);
		
		//set bounds
		l1.setBounds(20,80,100,20);
		tf1.setBounds(120,80,120,20);
		l2.setBounds(20,110,100,20);
		tf2.setBounds(120,110,120,20);
		
		b.setBounds(120,170,80,30);
		
		
		//adding components to frame
		add(l1);add(tf1);
		add(l2);add(tf2);		
		
		add(b);
		
		addWindowListener(this);
		setTitle("Sample Registration Form");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
	}
	public void windowClosing(WindowEvent e) {
		dispose();
	}
	public void windowActivated(WindowEvent e) {} 
	public void windowOpened(WindowEvent e) {} 
	public void windowClosed(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}    
	public void windowDeiconified(WindowEvent e) {}    
	public void windowIconified(WindowEvent e) {} 
	
	public void actionPerformed(ActionEvent ae) //button press event
	{
		tf1.setText("Your name is "+tf1.getText());	
		//l.setText("Your name is "+tf1.getText());
		
	}

    
	 
	
	public static void main(String args[]){
		new SampleForm();
		
	}
	
}
