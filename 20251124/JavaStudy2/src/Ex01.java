import javax.swing.*;
import java.awt.*;

public class Ex01 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("버튼 JButton");
		frame.setSize(800, 800);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.add(panel);

		JButton obj1 = new JButton("정은주"); // 텍스트 버튼 생성
		JButton obj2 = new JButton(new ImageIcon("정은주1.JPG")); // 아이콘 버튼 생성
		JButton obj3 = new JButton("연구원", new ImageIcon("정은주A.JPG")); //  텍스트 및 아이콘 버튼 생성

		panel.add(obj1); // 패널에 obj1 버튼 추가
		panel.add(obj2); // 패널에 obj2 버튼 추가
		panel.add(obj3); // 패널에 obj3 버튼 추가

		frame.setVisible(true);
	}
}