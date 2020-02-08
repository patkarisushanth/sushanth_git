package com.sushanth.epam.sweets;

public class milkChocolate extends Sweet{
	public milkChocolate() {
		setSweetness(0);
		setWeight(0);
	}
	public milkChocolate(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}