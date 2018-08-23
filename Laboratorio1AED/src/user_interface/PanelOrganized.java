package user_interface;

import java.awt.*;

import javax.swing.*;

public class PanelOrganized extends JPanel {

	private AuxiliaryPanelArray TheArray;
	private JLabel Time;
	private JScrollPane ScrollBar;
	public PanelOrganized() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("RESULT ZONE"));
		setLayout(new BorderLayout());
		
		TheArray = new AuxiliaryPanelArray();
		ScrollBar = new JScrollPane(TheArray);
		ScrollBar.setBounds(ScrollBar.getX(), ScrollBar.getY(), ScrollBar.getWidth(), ScrollBar.getHeight()+10);
		add(ScrollBar, BorderLayout.CENTER);

		Time = new JLabel("00:00");
		add(Time, BorderLayout.EAST);
	}
}