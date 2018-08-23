package user_interface;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AuxiliaryPanelGenerator extends JPanel implements ActionListener {
	
	private MainWindow ToGenerateTheArray;
	private JButton ActionToGenerate;
	private JCheckBox Repeat;
	private JCheckBox Decimal;
	
	public AuxiliaryPanelGenerator(MainWindow TheAction) {
		ToGenerateTheArray = TheAction;
		setLayout(new GridLayout(3, 0));
		
		ActionToGenerate = new JButton("GENERATE");
		ActionToGenerate.addActionListener(this);
		add(ActionToGenerate);
		
		Repeat = new JCheckBox("REPEATED");
		add(Repeat);
		
		Decimal = new JCheckBox("DECIMAL");
		add(Decimal);
	}

	public MainWindow getToGenerateTheArray() {
		return ToGenerateTheArray;
	}

	public JButton getActionToGenerate() {
		return ActionToGenerate;
	}

	public JCheckBox getRepeat() {
		return Repeat;
	}

	public JCheckBox getDecimal() {
		return Decimal;
	}

	public void setToGenerateTheArray(MainWindow toGenerateTheArray) {
		ToGenerateTheArray = toGenerateTheArray;
	}

	public void setActionToGenerate(JButton actionToGenerate) {
		ActionToGenerate = actionToGenerate;
	}

	public void setRepeat(JCheckBox repeat) {
		Repeat = repeat;
	}

	public void setDecimal(JCheckBox decimal) {
		Decimal = decimal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ToGenerateTheArray.Generator();
	}
	
	
}
