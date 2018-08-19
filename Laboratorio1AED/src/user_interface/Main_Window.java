package user_interface;

import java.awt.*;

import javax.swing.*;

public class Main_Window extends JFrame{
	

	private Panel_Generator ToGenerate;
	
	public Main_Window() {
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		
		ToGenerate = new Panel_Generator();
		add(ToGenerate, BorderLayout.NORTH);
		
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		Main_Window MyWindow = new Main_Window();
	}
}