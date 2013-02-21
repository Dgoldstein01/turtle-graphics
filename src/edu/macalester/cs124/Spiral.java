package edu.macalester.cs124;

import java.awt.Color;
import java.util.Random;

import edu.macalester.generator.Fibboonachi;
import edu.macalester.generator.PrimeGenerator;
import edu.macalester.turtle.Turtle;
import edu.macalester.turtle.TurtleProgram;

public class Spiral extends TurtleProgram {
    public void run() {
    	
    	spiral(Color.MAGENTA, 0.00001);
        
        println("Done!");
    }

    private boolean turtleIsNearScreen(Turtle turtle) {
        double margin = Math.max(getWidth(), getHeight()) / 2;
        return turtle.getX() > -margin
            && turtle.getY() > -margin
            && turtle.getX() < getWidth()  + margin
            && turtle.getY() < getHeight() + margin;
    }
    
	private void spiral(Color color, double angle){
	    setTurtleSpeedFactor(0);
	    
	    PrimeGenerator primeStep = new PrimeGenerator(1);
	    
	    Turtle turtle = new Turtle(getWidth() / 2, getHeight() / 2);
	    add(turtle);
	    turtle.setColor(color);
	    turtle.setStepSize(0.89);
	    Random rand = new Random();
	    while(turtleIsNearScreen(turtle)) {
	    	Color newColor = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
	    	turtle.setColor(newColor);
	    	
	    	int step = 2;
	        turtle.forward(step);
	    	turtle.left(angle);
	    	angle += 0.001;
	    	}
	    remove(turtle);
	    }
	private Color randColor() {
		Random rand = new Random();
		int randNum = rand.nextInt(8);
		switch(randNum) {
		
		}
	}
}
