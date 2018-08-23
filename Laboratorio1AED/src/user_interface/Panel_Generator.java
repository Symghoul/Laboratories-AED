package user_interface;

import java.awt.*;

import javax.swing.*;

public class Panel_Generator extends JPanel{
	
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
		
	setBackground(new Color(102,204,255));
		
	}

	public Auxiliary_Panel_Generator getToFinishTheGeneration() {
		return ToFinishTheGeneration;
	}

	public JComboBox<String> getToSelectGenerador() {
		return ToSelectGenerador;
	}

	public Auxiliary_Panel_Parameters getToGenerate() {
		return ToGenerate;
	}

	public void setToFinishTheGeneration(Auxiliary_Panel_Generator toFinishTheGeneration) {
		ToFinishTheGeneration = toFinishTheGeneration;
	}

	public void setToSelectGenerador(JComboBox<String> toSelectGenerador) {
		ToSelectGenerador = toSelectGenerador;
	}

	public void setToGenerate(Auxiliary_Panel_Parameters toGenerate) {
		ToGenerate = toGenerate;
	}
	
	
}
