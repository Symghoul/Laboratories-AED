package user_interface;

import java.awt.*;

import javax.swing.*;

import model.SmartArray;

public class Main_Window extends JFrame{
	
	private SmartArray ToThink;
	private Panel_Generator ToGenerate;
	private Panel_Modifier ToModify;
	private Panel_Organized ToSeeTheResult;
	
	public Main_Window() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		
		
		ToThink = new SmartArray();
		
		ToGenerate = new Panel_Generator(this);
		add(ToGenerate, BorderLayout.NORTH);
		
		ToModify = new Panel_Modifier(this);
		add(ToModify, BorderLayout.CENTER);
		
		ToSeeTheResult = new Panel_Organized();
		ToSeeTheResult.setPreferredSize(new Dimension(500, 60));
		add(ToSeeTheResult, BorderLayout.SOUTH);
		
		setSize(new Dimension(500,270));
		
		setLocationRelativeTo(null);
		setVisible(true);	
	}
	
	public void Generator() {
		try {
			String kind = ToGenerate.getToSelectGenerador().getSelectedItem()+"";
			if(kind.equals("MANUAL")) {
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().getAutoscrolls();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				ToThink.ManualGenerator(decimal, size);
				ToModify.getTheArray().ToUpdate(size, ToThink.getWholeNumberInput(),ToThink.getFloatingPointInput());
			}
			setLocationRelativeTo(null);
			repaint();
			setVisible(false);
			setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You have typed incorrect data");
		}
	}
	
	public static void main(String[] args) {
		Main_Window MyWindow = new Main_Window();
	}
}