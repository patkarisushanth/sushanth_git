package com.sushanth.epam;

import java.util.ArrayList;
import java.util.Comparator;

import com.sushanth.epam.sweets.Sweet;
import com.sushanth.epam.sweets.SweetsGenerator;
public class gift {
	private SweetsGenerator sweetsgenerator;
	private ArrayList<Sweet> newList;
	private static SugarLevelComparator sugarComparator = new SugarLevelComparator();
    private static WeightComparator weightComparator = new WeightComparator();
    public SugarLevelComparator getSugarLevelComparator() {
        return sugarComparator;
    }

    public WeightComparator getWeightComparator() {
        return weightComparator;
    }
    public gift() {
        sweetsgenerator = new SweetsGenerator();
        newList = new ArrayList<Sweet>();
    }
    public ArrayList<Sweet> generate(int times) {

        for (int i = 0; i < times; i++) {
        	System.out.printf("\nEntering sugar and weight : ");
            newList.add(sweetsgenerator.next());
        }
        return newList;
    }
    private static class SugarLevelComparator implements Comparator<Sweet> {

        public int compare(Sweet sweetsOne, Sweet sweetsTwo) {
            return (sweetsOne.getSweetness() < sweetsTwo.getSweetness() ? -1
                    : (sweetsOne.getSweetness() == sweetsTwo.getSweetness() ? 0 : 1));
        }

    }

    private static class WeightComparator implements Comparator<Sweet> {

        public int compare(Sweet sweetsOne, Sweet sweetsTwo) {
            return (sweetsOne.getWeight() < sweetsTwo.getWeight() ? -1
                    : (sweetsOne.getWeight() == sweetsTwo.getWeight() ? 0 : 1));
        }

    }
}
