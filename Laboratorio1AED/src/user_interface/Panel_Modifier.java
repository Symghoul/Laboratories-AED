package user_interface;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Panel_Modifier extends JPanel implements ActionListener {

	private Main_Window ToSortTheArray;
	private Auxiliary_Panel_Array TheArray;
	private JButton Order;
	
	public Panel_Modifier(Main_Window TheAction) {
		ToSortTheArray = TheAction;
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("MODIFIABLE ZONE"));
		setLayout(new BorderLayout());
		
		TheArray = new Auxiliary_Panel_Array();
		add(TheArray, BorderLayout.CENTER);
		
		Order = new JButton("ORDER");
		add(Order, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
