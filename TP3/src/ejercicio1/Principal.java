package ejercicio1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
//		frame.setSize(500, 500);
//		frame.setLocation(350, 350);
		frame.setBounds(350, 350, 500, 500);
		
		frame.setTitle("AppTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JButton button = new JButton();
		button.setText("No te da para apretarme");
		button.setBounds(10, 10, 120, 40);
		
		frame.getContentPane().add(button);
	}

}
