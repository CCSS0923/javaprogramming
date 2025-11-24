import javax.swing.*;  
import java.awt.*;     

public class Ex04 {

	public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("라디오버튼 JRadioButton");    
		frame.setSize(800, 800); 
		    
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);
		
		JRadioButton  obj1 = new JRadioButton ();
		JRadioButton  obj2 = new JRadioButton ("공무원"); 		      
		JRadioButton  obj3 = new JRadioButton ("군인", true);  	
		        
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		  		   
		frame.setVisible(true);  
	}	
}