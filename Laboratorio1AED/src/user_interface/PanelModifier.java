package user_interface;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class PanelModifier extends JPanel implements ActionListener {

	private MainWindow ToSortTheArray;
	private AuxiliaryPanelArray TheArray;
	private JButton Order;
	private JScrollPane ScrollBar;
	
	public PanelModifier(MainWindow TheAction) {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBorder(BorderFactory.createTitledBorder("MODIFIABLE ZONE"));
		setLayout(new BorderLayout());
		
		
		TheArray = new AuxiliaryPanelArray();
		ScrollBar = new JScrollPane(TheArray);
		ScrollBar.setBounds(ScrollBar.getX(), ScrollBar.getY(), ScrollBar.getWidth(), ScrollBar.getHeight()+10);
		add(ScrollBar, BorderLayout.CENTER);
		
		Order = new JButton("ORDER");
		add(Order, BorderLayout.EAST);
	}
	
	public MainWindow getToSortTheArray() {
		return ToSortTheArray;
	}

	public void setToSortTheArray(MainWindow toSortTheArray) {
		ToSortTheArray = toSortTheArray;
	}

	public AuxiliaryPanelArray getTheArray() {
		return TheArray;
	}

	public void setTheArray(AuxiliaryPanelArray theArray) {
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
