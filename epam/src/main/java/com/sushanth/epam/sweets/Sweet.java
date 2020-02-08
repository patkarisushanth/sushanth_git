package com.sushanth.epam.sweets;

public abstract class Sweet implements Cloneable {
	private double weight,sweetness;
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public double getSweetness() {
		return sweetness;
	}
	public double getWeight() {
		return weight;
	}
	public void setSweetness(double sweetness) {
		this.sweetness=sweetness;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
}