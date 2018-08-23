package user_interface;

import java.awt.*;

import javax.swing.*;

public class Panel_Organized extends JPanel {

	private Auxiliary_Panel_Array TheArray;
	private JLabel Time;
	private JScrollPane ScrollBar;
	public Panel_Organized() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("RESULT ZONE"));
		setLayout(new BorderLayout());
		
		TheArray = new Auxiliary_Panel_Array();
		ScrollBar = new JScrollPane(TheArray);
		ScrollBar.setBounds(ScrollBar.getX(), ScrollBar.getY(), ScrollBar.getWidth(), ScrollBar.getHeight()+10);
		add(ScrollBar, BorderLayout.CENTER);

		Time = new JLabel("00:00");
		add(Time, BorderLayout.EAST);
	}
}