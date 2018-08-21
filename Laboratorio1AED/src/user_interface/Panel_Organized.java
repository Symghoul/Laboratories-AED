package user_interface;

import java.awt.*;

import javax.swing.*;

public class Panel_Organized extends JPanel {

	private Auxiliary_Panel_Array TheArray;
	private JLabel Time;
	
	public Panel_Organized() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("RESULT ZONE"));
		setLayout(new BorderLayout());
		
		TheArray = new Auxiliary_Panel_Array();
		add(TheArray, BorderLayout.CENTER);
		
		Time = new JLabel("00:00");
		add(Time, BorderLayout.EAST);
	}
}