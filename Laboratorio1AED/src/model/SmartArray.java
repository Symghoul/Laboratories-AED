package model;

public class SmartArray {
	
	private double[] FloatingPointInput;
	private int[] WholeNumberInput;
	private double[] FloatingPointOutput;
	private int[] WholeNumberOutput;
	
	
	public void GeneralGenerator(String kind, int size, double maximum, double minimum, double error, boolean repeat, boolean decimal ) {
		if(kind.equals("MANUAL")) {
			ManualGenerator(decimal,size);
		}
	}
	
	public void ManualGenerator(boolean decimal, int size) {
		if(decimal) {
			WholeNumberInput = new int[0];
			FloatingPointInput = new double[size];
		}else {
			WholeNumberInput = new int[size];
			FloatingPointInput = new double[0];
		}
	}
}
