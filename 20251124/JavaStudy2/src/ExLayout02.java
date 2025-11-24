import javax.swing.*; 
import java.awt.*;

public class ExLayout02 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 	  	 	
		frame.setTitle("레이아웃 BorderLayout");  
		frame.setSize(400, 200);   
		   
		JButton obj1 = new JButton("버튼1");  
		JButton obj2 = new JButton("버튼2"); 
		JButton obj3 = new JButton("버튼3"); 	
		JButton obj4 = new JButton("버튼4"); 	 		  
		JButton obj5 = new JButton("버튼5"); 	  
			
		JPanel panel = new JPanel();	 
		panel.setLayout(new BorderLayout());
		panel.add(obj1, BorderLayout.NORTH);          
		panel.add(obj2, BorderLayout.WEST);           
		panel.add(obj3, BorderLayout.CENTER);   
		panel.add(obj4, BorderLayout.EAST);  
		panel.add(obj5, BorderLayout.SOUTH); 	   	
		
		frame.add(panel); 		    
		frame.setVisible(true);  
	}
}