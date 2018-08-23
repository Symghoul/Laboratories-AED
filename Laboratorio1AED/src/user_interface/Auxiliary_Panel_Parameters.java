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

	public JLabel getLSize() {
		return LSize;
	}

	public JTextField getTSize() {
		return TSize;
	}

	public JLabel getLMaximun() {
		return LMaximun;
	}

	public JTextField getTMaximum() {
		return TMaximum;
	}

	public JLabel getLMinimum() {
		return LMinimum;
	}

	public JTextField getTMinimum() {
		return TMinimum;
	}

	public JLabel getLErrorRate() {
		return LErrorRate;
	}

	public JTextField getTErrorRate() {
		return TErrorRate;
	}

	public void setLSize(JLabel lSize) {
		LSize = lSize;
	}

	public void setTSize(JTextField tSize) {
		TSize = tSize;
	}

	public void setLMaximun(JLabel lMaximun) {
		LMaximun = lMaximun;
	}

	public void setTMaximum(JTextField tMaximum) {
		TMaximum = tMaximum;
	}

	public void setLMinimum(JLabel lMinimum) {
		LMinimum = lMinimum;
	}

	public void setTMinimum(JTextField tMinimum) {
		TMinimum = tMinimum;
	}

	public void setLErrorRate(JLabel lErrorRate) {
		LErrorRate = lErrorRate;
	}

	public void setTErrorRate(JTextField tErrorRate) {
		TErrorRate = tErrorRate;
	}
	
}
