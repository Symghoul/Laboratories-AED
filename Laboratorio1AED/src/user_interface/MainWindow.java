package user_interface;

import java.awt.*;

import javax.swing.*;

import model.SmartArray;

public class MainWindow extends JFrame{
	
	private SmartArray ToThink;
	private PanelGenerator ToGenerate;
	private PanelModifier ToModify;
	private PanelOrganized ToSeeTheResult;
	
	public MainWindow() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		
		
		ToThink = new SmartArray();
		
		ToGenerate = new PanelGenerator(this);
		add(ToGenerate, BorderLayout.NORTH);
		
		ToModify = new PanelModifier(this);
		add(ToModify, BorderLayout.CENTER);
		
		ToSeeTheResult = new PanelOrganized();
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
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().isSelected();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				ToThink.ManualGenerator(decimal, size);
				ToModify.getTheArray().ToUpdate(size, ToThink.getWholeNumberInput(),ToThink.getFloatingPointInput());
			}else if(kind.equalsIgnoreCase("ORGANIZED")) {
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().isSelected();
				boolean repeated = ToGenerate.getToFinishTheGeneration().getRepeat().isSelected();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				int maximum = Integer.parseInt(ToGenerate.getToGenerate().getTMaximum().getText());
				int minimum = Integer.parseInt(ToGenerate.getToGenerate().getTMinimum().getText());
				if(maximum<minimum) {
					size = 1/0;
				}
				ToThink.OrganizedGenerator(decimal, repeated, size, maximum, minimum);
				ToModify.getTheArray().ToUpdate(size, ToThink.getWholeNumberInput(),ToThink.getFloatingPointInput());
			}else if(kind.equalsIgnoreCase("ORDER INVERSELY")) {
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().isSelected();
				boolean repeated = ToGenerate.getToFinishTheGeneration().getRepeat().isSelected();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				int maximum = Integer.parseInt(ToGenerate.getToGenerate().getTMaximum().getText());
				int minimum = Integer.parseInt(ToGenerate.getToGenerate().getTMinimum().getText());
				if(maximum<minimum) {
					size = 1/0;
				}
				ToThink.OrganizedInversely(decimal, repeated, size, maximum, minimum);
				ToModify.getTheArray().ToUpdate(size, ToThink.getWholeNumberInput(),ToThink.getFloatingPointInput());
			}else if(kind.equalsIgnoreCase("RANDOM")) {
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().isSelected();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				int maximum = Integer.parseInt(ToGenerate.getToGenerate().getTMaximum().getText());
				int minimum = Integer.parseInt(ToGenerate.getToGenerate().getTMinimum().getText());
				if(maximum<minimum) {
					size = 1/0;
				}
				ToThink.RandomGenerator(decimal, size, maximum, minimum);
				ToModify.getTheArray().ToUpdate(size, ToThink.getWholeNumberInput(),ToThink.getFloatingPointInput());
			}else if(kind.equalsIgnoreCase("WITH ERROR PERCENTAGE")) {
				boolean decimal = ToGenerate.getToFinishTheGeneration().getDecimal().isSelected();
				boolean repeated = ToGenerate.getToFinishTheGeneration().getRepeat().isSelected();
				int size = Integer.parseInt(ToGenerate.getToGenerate().getTSize().getText());
				int error = Integer.parseInt(ToGenerate.getToGenerate().getTErrorRate().getText());
				int maximum = Integer.parseInt(ToGenerate.getToGenerate().getTMaximum().getText());
				int minimum = Integer.parseInt(ToGenerate.getToGenerate().getTMinimum().getText());
				if(maximum<minimum) {
					size = 1/0;
				}
				ToThink.GeneratorWithErrorPercentages(decimal, repeated, size, maximum, minimum, error);
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
		MainWindow MyWindow = new MainWindow();
	}
}