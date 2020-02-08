package com.sushanth.epam;

import java.util.ArrayList;

import com.sushanth.epam.sweets.*;

public class Application {


	private giftController giftController;

    ArrayList<Sweet> sweets;

    public Application() {
        giftController = new giftController();
    }

    private void process() {
    	int noOfTimes = (int) (Math.random() * 10);
        giftController.generateGift(noOfTimes);
    }
    public void start() {
        process();
     }

}
