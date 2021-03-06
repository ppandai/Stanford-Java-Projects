/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		int xpos = 100;
		int ypos = 460;
		for (int i = BRICKS_IN_BASE; i > 0; i --) {
			for (int j = 0; j < i; j ++) {
				GRect rectangle = new GRect (xpos, ypos, BRICK_WIDTH, BRICK_HEIGHT);
				add(rectangle);
				xpos += BRICK_WIDTH;
			}
			ypos = ypos - BRICK_HEIGHT;
			xpos = xpos - (BRICK_WIDTH * i - 15);
			
		}
	}
}

