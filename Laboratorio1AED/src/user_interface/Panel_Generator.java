package user_interface;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Panel_Generator extends JPanel implements ActionListener {
	
	private Auxiliary_Panel_Generator ToFinishTheGeneration;
	private JComboBox<String> ToSelectGenerador;
	private Auxiliary_Panel_Parameters ToGenerate;
	
	public Panel_Generator(Main_Window InformationFlow) {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("GENERATOR"));
		setLayout(new FlowLayout());
		
		String[] TheTypes = new String[] {"MANUAL", "ORGANIZED", "ORDER INVERSELY", "RANDOM", "WITH ERROR PERCENTAGE"};
		ToSelectGenerador = new JComboBox<String>();
		ToSelectGenerador.setModel(new DefaultComboBoxModel<>(TheTypes));
		add(ToSelectGenerador);
		ToGenerate = new Auxiliary_Panel_Parameters();
		add(ToGenerate);
		ToFinishTheGeneration = new Auxiliary_Panel_Generator(InformationFlow);
		add(ToFinishTheGeneration);	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
