package model;

public class SmartArray {
	
	private double[] FloatingPointInput;
	private int[] WholeNumberInput;
	private double[] FloatingPointOutput;
	private int[] WholeNumberOutput;
	
	public SmartArray() {
		FloatingPointInput = new double[0];
		WholeNumberInput = new int[0];
		FloatingPointOutput = new double[0];
		WholeNumberOutput = new int [0];
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
	
	public void OrganizedGenerator(boolean decimal, boolean repeated, int size, int maximum, int minimum) {
		
	}

	public double[] getFloatingPointInput() {
		return FloatingPointInput;
	}

	public void setFloatingPointInput(double[] floatingPointInput) {
		FloatingPointInput = floatingPointInput;
	}

	public int[] getWholeNumberInput() {
		return WholeNumberInput;
	}

	public void setWholeNumberInput(int[] wholeNumberInput) {
		WholeNumberInput = wholeNumberInput;
	}

	public double[] getFloatingPointOutput() {
		return FloatingPointOutput;
	}

	public void setFloatingPointOutput(double[] floatingPointOutput) {
		FloatingPointOutput = floatingPointOutput;
	}

	public int[] getWholeNumberOutput() {
		return WholeNumberOutput;
	}

	public void setWholeNumberOutput(int[] wholeNumberOutput) {
		WholeNumberOutput = wholeNumberOutput;
	}
}
