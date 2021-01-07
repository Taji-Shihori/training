package chap14;

import chap13.Shape1;

public abstract class Rectangle extends Shape1 implements Plane2D {
	private int width;
	private int height;

	public int getAree() { return width * height; }

}
