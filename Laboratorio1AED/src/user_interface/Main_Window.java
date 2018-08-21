package user_interface;

import java.awt.*;

import javax.swing.*;

public class Main_Window extends JFrame{
	

	private Panel_Generator ToGenerate;
	private Panel_Modifier ToModify;
	private Panel_Organized ToSeeTheResult;
	
	public Main_Window() {
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		
		ToGenerate = new Panel_Generator(this);
		add(ToGenerate, BorderLayout.NORTH);
		
		ToModify = new Panel_Modifier(this);
		add(ToModify, BorderLayout.CENTER);
		
		ToSeeTheResult = new Panel_Organized();
		add(ToSeeTheResult, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		Main_Window MyWindow = new Main_Window();
	}
}