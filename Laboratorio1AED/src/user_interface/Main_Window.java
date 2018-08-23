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
		setLayout(new BorderLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		
		ToThink = new SmartArray();
		
		ToGenerate = new Panel_Generator(this);
		add(ToGenerate, BorderLayout.NORTH);
		
		ToModify = new Panel_Modifier(this);
		add(ToModify, BorderLayout.CENTER);
		
		ToSeeTheResult = new Panel_Organized();
		add(ToSeeTheResult, BorderLayout.SOUTH);
		
		pack();
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
			pack();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You have typed incorrect data");
		}
	}
	
	public static void main(String[] args) {
		Main_Window MyWindow = new Main_Window();
	}
}