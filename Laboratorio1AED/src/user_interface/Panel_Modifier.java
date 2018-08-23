package user_interface;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class Panel_Modifier extends JPanel implements ActionListener {

	private Main_Window ToSortTheArray;
	private Auxiliary_Panel_Array TheArray;
	private JButton Order;
	private JScrollPane ScrollBar;
	
	public Panel_Modifier(Main_Window TheAction) {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("MODIFIABLE ZONE"));
		setLayout(new BorderLayout());
		
		
		TheArray = new Auxiliary_Panel_Array();
		ScrollBar = new JScrollPane(TheArray);
		ScrollBar.setBounds(ScrollBar.getX(), ScrollBar.getY(), ScrollBar.getWidth(), ScrollBar.getHeight()+10);
		add(ScrollBar, BorderLayout.CENTER);
		
		Order = new JButton("ORDER");
		add(Order, BorderLayout.EAST);
	}
	
	public Main_Window getToSortTheArray() {
		return ToSortTheArray;
	}

	public void setToSortTheArray(Main_Window toSortTheArray) {
		ToSortTheArray = toSortTheArray;
	}

	public Auxiliary_Panel_Array getTheArray() {
		return TheArray;
	}

	public void setTheArray(Auxiliary_Panel_Array theArray) {
		TheArray = theArray;
	}

	public JButton getOrder() {
		return Order;
	}

	public void setOrder(JButton order) {
		Order = order;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
