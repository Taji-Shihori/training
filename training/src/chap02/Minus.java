package chap02;

import java.util.Scanner;

class Minus {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		int b = -a;
		System.out.println(a + "の符号を反転した値は" + b + "です。");
	}

}
