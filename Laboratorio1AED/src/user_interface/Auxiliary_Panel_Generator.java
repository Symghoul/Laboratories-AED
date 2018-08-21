package user_interface;

import java.awt.*;

import javax.swing.*;

public class Auxiliary_Panel_Generator extends JPanel {
	
	private Main_Window ToGenerateTheArray;
	private JButton ActionToGenerate;
	private JCheckBox Repeat;
	private JCheckBox Decimal;
	
	public Auxiliary_Panel_Generator(Main_Window TheAction) {
		ToGenerateTheArray = TheAction;
		setLayout(new GridLayout(3, 0));
		
		ActionToGenerate = new JButton("GENERATE");
		add(ActionToGenerate);
		
		Repeat = new JCheckBox("REPEATED");
		add(Repeat);
		
		Decimal = new JCheckBox("DECIMAL");
		add(Decimal);
	}
}
