package chap09;

import java.util.Scanner;

class DayTester1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("day1を入力せよ。");
		System.out.print("年："); int y = stdIn.nextInt();
		System.out.print("月："); int m = stdIn.nextInt();
		System.out.print("日："); int d = stdIn.nextInt();

		Day1 day1 = new Day1(y, m, d);
		System.out.println("day1 = " + day1);

		Day1 day2 = new Day1(day1);
		System.out.println("day2をday1と同じ日付として作りました。");
		System.out.println("day2 = " + day2);

		if(day1.equalTo(day2))
			System.out.println("day1とday2は等しいです。");
		else
			System.out.println("day1とday2は等しくありません。");

		Day1 d1 = new Day1();
		Day1 d2 = new Day1(2010);
		Day1 d3 = new Day1(2010, 10);
		Day1 d4 = new Day1(2010, 10, 15);

		System.out.println("d1   = " + d1);
		System.out.println("d2   = " + d2);
		System.out.println("d3   = " + d3);
		System.out.println("d4   = " + d4);

		Day1[] a = new Day1[3];
		for(int i = 0; i < a.length; i++)
			a[i] = new Day1();

		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
