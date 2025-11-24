import javax.swing.*;  
import java.awt.*;
import java.util.Vector;     

public class Ex07 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("텍스트영역 JTextArea");
		frame.setSize(400, 200); 				
			   	   
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);		 
			 
		
		JTextArea  obj1 = new JTextArea ("사진"); 			    
		JTextArea  obj2 = new JTextArea ("정은주(공무원)", 5, 10);  		    
		JTextArea  obj3 = new JTextArea ("정은주(군인)", 5, 10); 
				    
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		   
		frame.setVisible(true);  
	}
}