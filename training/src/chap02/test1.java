package chap02;

import java.util.Scanner;

class test1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int a = stdIn.nextInt();

		System.out.println(a + "と入力しましたね。");
	}

}
