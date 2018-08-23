package user_interface;

import java.awt.GridLayout;

import javax.swing.*;

public class Auxiliary_Panel_Array extends JPanel {
	
	private JTextField[] TheNumbers;
	
	private void ToUpdate(int size, int[] WholeNumber, double[] FloatingPoint) {
		setLayout(null);
		removeAll();
		if(WholeNumber.length!=0) {
			setLayout(new GridLayout(0, size));
			for(int i=0; i<WholeNumber.length;i++) {
				TheNumbers[i] = new JTextField(WholeNumber[i]+"");
			}
		}else if(FloatingPoint.length!=0){
			setLayout(new GridLayout(0, size));
			for(int i=0; i<FloatingPoint.length;i++) {
				TheNumbers[i] = new JTextField(FloatingPoint[i]+"");
			}
		}
	}
}
