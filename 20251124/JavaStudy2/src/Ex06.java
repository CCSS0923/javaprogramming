import javax.swing.*;  
import java.awt.*;
import java.util.Vector;     

public class Ex06 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("레이블 JLabel");
		frame.setSize(800, 800);
		    
		    
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);
		
		JLabel  obj1 = new JLabel ("정은주A.JPG"); 			    
		JLabel  obj2 = new JLabel (new ImageIcon("정은주A.JPG"));  		    
		JLabel  obj3 = new JLabel ("정은주1.JPG", new ImageIcon("정은주1.JPG"), JLabel.RIGHT);
		    
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		    		   
		frame.setVisible(true);  
	}
}