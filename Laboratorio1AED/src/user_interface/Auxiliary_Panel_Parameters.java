package user_interface;

import java.awt.*;

import javax.swing.*;

public class Auxiliary_Panel_Parameters extends JPanel {
	
	private JLabel LSize;
	private JTextField TSize;
	private JLabel LMaximun;
	private JTextField TMaximum;
	private JLabel LMinimum;
	private JTextField TMinimum;
	private JLabel LErrorRate;
	private JTextField TErrorRate;
	
	public Auxiliary_Panel_Parameters() {
		setLayout(new GridLayout(4, 2));
		
		LSize = new JLabel("TAMA�O");
		add(LSize);
		TSize = new JTextField();
		add(TSize);
		LMaximun = new JLabel("M�XIMO");
		add(LMaximun);
		LMinimum = new JLabel("M�NIMO");
		add(LMinimum);
		TMaximum = new JTextField();
		add(TMaximum);
		TMinimum = new JTextField();
		add(TMinimum);
		LErrorRate = new JLabel("PORCENTAJE DE ERROR");
		add(LErrorRate);
		TErrorRate = new JTextField();
		add(TErrorRate);
	}

}
