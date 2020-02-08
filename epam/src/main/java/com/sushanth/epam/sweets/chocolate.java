package com.sushanth.epam.sweets;


public class chocolate extends Sweet{
	public chocolate() {
		setSweetness(0);
		setWeight(0);
	}
	public chocolate(double weight,double sweetness) {
		setSweetness(sweetness);
		setWeight(weight);
	}
}