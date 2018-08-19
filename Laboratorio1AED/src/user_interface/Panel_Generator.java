package user_interface;

import java.awt.*;

import javax.swing.*;

public class Panel_Generator extends JPanel {
	
	private Auxiliary_Panel_Generator ToFinishTheGeneration;
	private JComboBox<String> ToSelectGenerador;
	private Auxiliary_Panel_Parameters ToGenerate;
	
	public Panel_Generator() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("GENERATOR"));
		setLayout(new FlowLayout());
		
		String[] TheTypes = new String[] {"MANUAL", "ORDENADO", "ORDENADO INVERSAMENTE", "ALEATORIO", "CON PORCENTAJE DE ERROR"};
		ToSelectGenerador = new JComboBox<String>();
		ToSelectGenerador.setModel(new DefaultComboBoxModel<>(TheTypes));
		add(ToSelectGenerador);
		ToGenerate = new Auxiliary_Panel_Parameters();
		add(ToGenerate);
		ToFinishTheGeneration = new Auxiliary_Panel_Generator();
		add(ToFinishTheGeneration);
		
	}
}
