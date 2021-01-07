package chap09;

public class Car {

	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	private Day2 purchaseDay;

	public Car(String name, int width, int height, int length, double fuel,
				Day2 purchaseDay) {
		this.name = name;		this.width = width;		this.height = height;
		this.length = length;	this.fuel = fuel;		x = y = 0.0;
		this.purchaseDay = new Day2(purchaseDay);
	}

	public double getX() { return x; }
	public double getY() { return y; }
	public double getFuel() { return fuel; }
	public Day2 getPurchaseDay() { return new Day2(purchaseDay); }

	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "㎜");
		System.out.println("車高：" + height + "㎜");
		System.out.println("車長：" + length + "mm");
	}

	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if(dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}

}
