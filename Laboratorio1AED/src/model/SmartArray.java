package model;

import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

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
		Random number = new Random();
		if(decimal) {
			WholeNumberInput = new int[0];
			FloatingPointInput = new double[size];
			double limit = minimum;
			double saveNumber = 0;
			for(int i=0;i<FloatingPointInput.length;i++) {
				saveNumber = limit + (maximum-limit)*number.nextDouble();
				FloatingPointInput[i] = saveNumber;
				limit = saveNumber;
			}
		}else {
			WholeNumberInput = new int[size];
			FloatingPointInput = new double[0];
			if(!repeated && (maximum-minimum)/size<1) {
				size = 1/0;
			}
			int interval = (maximum-minimum)/size;
			int saveNumber = 0;
			if(repeated) {
				for(int i=0; i<WholeNumberInput.length;i++) {
					saveNumber = number.nextInt(interval) + number.nextInt(2)+minimum;
					WholeNumberInput[i] = saveNumber;
					minimum = saveNumber;
				}
			}else {
				for(int i=0; i<WholeNumberInput.length;i++) {
					saveNumber = number.nextInt(interval)+minimum+1;
					WholeNumberInput[i] = saveNumber;
					minimum = saveNumber;
				}
			}
		}
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
