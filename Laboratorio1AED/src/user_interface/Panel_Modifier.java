package user_interface;

import java.awt.*;

import javax.swing.*;

public class Panel_Modifier extends JPanel {

	
	private Auxiliary_Panel_Array TheArray;
	private JButton Order;
	
	public Panel_Modifier() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("ZONA MODIFICABLE"));
		setLayout(new BorderLayout());
		
		TheArray = new Auxiliary_Panel_Array();
		add(TheArray, BorderLayout.CENTER);
		
		Order = new JButton("ORDENAR");
		add(Order, BorderLayout.EAST);
	}
}
