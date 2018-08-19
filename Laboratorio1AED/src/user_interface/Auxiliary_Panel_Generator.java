package user_interface;

import java.awt.*;

import javax.swing.*;

public class Auxiliary_Panel_Generator extends JPanel {
	
	private JButton ActionToGenerate;
	private JCheckBox Repeat;
	private JCheckBox Decimal;
	
	public Auxiliary_Panel_Generator() {
		setLayout(new GridLayout(3, 0));
		
		ActionToGenerate = new JButton("GENERAR");
		add(ActionToGenerate);
		
		Repeat = new JCheckBox("REPETIDO");
		add(Repeat);
		
		Decimal = new JCheckBox("DECIMAL");
		add(Decimal);
	}
}
