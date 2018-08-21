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
		
		LSize = new JLabel("SIZE");
		add(LSize);
		TSize = new JTextField();
		add(TSize);
		LMaximun = new JLabel("MAXIMUM");
		add(LMaximun);
		LMinimum = new JLabel("MINIMUM");
		add(LMinimum);
		TMaximum = new JTextField();
		add(TMaximum);
		TMinimum = new JTextField();
		add(TMinimum);
		LErrorRate = new JLabel("ERROR RATE");
		add(LErrorRate);
		TErrorRate = new JTextField();
		add(TErrorRate);
	}	
}
