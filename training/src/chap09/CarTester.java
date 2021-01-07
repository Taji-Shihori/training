package chap09;

class CarTester {

	public static void main(String[] args) {
		Day2 d = new Day2(2010, 10, 15);
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, d);

		Day2 p = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + p);

		p.set(1999, 12, 31);

		Day2 q = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + q);
	}

}
