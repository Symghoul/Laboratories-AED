package user_interface;

import java.awt.*;

import javax.swing.*;

public class PanelGenerator extends JPanel{
	
	private AuxiliaryPanelGenerator ToFinishTheGeneration;
	private JComboBox<String> ToSelectGenerador;
	private AuxiliaryPanelParameters ToGenerate;
	
	public PanelGenerator(MainWindow InformationFlow) {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("GENERATOR"));
		setLayout(new FlowLayout());
		
		String[] TheTypes = new String[] {"MANUAL", "ORGANIZED", "ORDER INVERSELY", "RANDOM", "WITH ERROR PERCENTAGE"};
		ToSelectGenerador = new JComboBox<String>();
		ToSelectGenerador.setModel(new DefaultComboBoxModel<>(TheTypes));
		add(ToSelectGenerador);
		ToGenerate = new AuxiliaryPanelParameters();
		add(ToGenerate);
		ToFinishTheGeneration = new AuxiliaryPanelGenerator(InformationFlow);
		add(ToFinishTheGeneration);	
		
	setBackground(new Color(102,204,255));
		
	}

	public AuxiliaryPanelGenerator getToFinishTheGeneration() {
		return ToFinishTheGeneration;
	}

	public JComboBox<String> getToSelectGenerador() {
		return ToSelectGenerador;
	}

	public AuxiliaryPanelParameters getToGenerate() {
		return ToGenerate;
	}

	public void setToFinishTheGeneration(AuxiliaryPanelGenerator toFinishTheGeneration) {
		ToFinishTheGeneration = toFinishTheGeneration;
	}

	public void setToSelectGenerador(JComboBox<String> toSelectGenerador) {
		ToSelectGenerador = toSelectGenerador;
	}

	public void setToGenerate(AuxiliaryPanelParameters toGenerate) {
		ToGenerate = toGenerate;
	}
	
	
}
