package com.example.demo.controller;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class MouseMove {

	public static void main(String[] args) throws InterruptedException, AWTException {
		int xCoord = 400;
	    int yCoord = 400;
	    int sleep = 20000;
	    Robot robot = new Robot();
	    Random random = new Random();
	    
	    while(true) {
	    	Thread.sleep(sleep);
	    	robot.mouseMove(random.nextInt(xCoord), random.nextInt(yCoord));
	    }
	}
}
