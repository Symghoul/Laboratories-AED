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
	
	public void OrganizedInversely(boolean decimal, boolean repeated, int size, int maximum, int minimum) {
		Random number = new Random();
		if(decimal) {
			WholeNumberInput = new int[0];
			FloatingPointInput = new double[size];
			double limit = maximum;
			double saveNumber = 0;
			for(int i=0;i<FloatingPointInput.length;i++) {
				saveNumber = minimum + (limit-minimum)*number.nextDouble();
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
					saveNumber = maximum-(number.nextInt(interval) + number.nextInt(2));
					WholeNumberInput[i] = saveNumber;
					maximum = saveNumber;
				}
			}else {
				for(int i=0; i<WholeNumberInput.length;i++) {
					saveNumber = maximum-1 -number.nextInt(interval);
					WholeNumberInput[i] = saveNumber;
					maximum = saveNumber;
				}
			}
		}
	}

	public void RandomGenerator(boolean decimal, int size, int maximum, int minimum) {
		Random number = new Random();
		if(decimal) {
			WholeNumberInput = new int[0];
			FloatingPointInput = new double[size];
			for(int i=0; i<FloatingPointInput.length;i++) {
				FloatingPointInput[i] = minimum + (maximum-minimum)*number.nextDouble();
			}
		}else {
			WholeNumberInput = new int[size];
			FloatingPointInput = new double[0];
			for(int i=0; i<WholeNumberInput.length;i++) {
				WholeNumberInput[i] = number.nextInt(maximum-minimum)+minimum;
			}
		}
	}
	
	public void GeneratorWithErrorPercentages(boolean decimal, boolean repeated, int size, int maximum, int minimum, int error) {
		OrganizedGenerator(decimal, repeated, size, maximum, minimum);
		if(decimal) {
			double position =0;
			int changes = ((error/100)*size)/2;
			for(int i=0;i<changes;i+=2) {
				position = FloatingPointInput[i];
				FloatingPointInput[i] = FloatingPointInput[i+1];
				FloatingPointInput[i+1] = position;
			}
		}else {
			int position =0;
			int changes = (error*size/100);
			for(int i=0;i<changes;i+=2) {
				position = WholeNumberInput[i];
				WholeNumberInput[i] = WholeNumberInput[i+1];
				WholeNumberInput[i+1] = position;
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
