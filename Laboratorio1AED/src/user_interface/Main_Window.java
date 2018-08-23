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
			int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
			if(size<1) {
				size = 1/0;
			}
			double maximum = Double.parseDouble(ToGenerate.getToGenerate().getTMaximum().getText());
			double minimum =  Double.parseDouble(ToGenerate.getToGenerate().getTMinimum().getText());
			if(maximum<minimum) {
				size = 1/0;
			}
			double error = Double.parseDouble(ToGenerate.getToGenerate().getLErrorRate().getText());
			boolean repeat = ToGenerate.getToFinishTheGeneration().getRepeat().isSelected();
			if(repeat) {
				JOptionPane.showMessageDialog(null, "repite");
			}
//			boolean decimal 
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "You have typed incorrect data");
		}
	}
	
	public static void main(String[] args) {
		Main_Window MyWindow = new Main_Window();
	}
}