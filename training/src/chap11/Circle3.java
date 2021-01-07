package chap11;

import static java.lang.Math.*;
import static java.lang.System.*;

import java.util.Scanner;

class Circle3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(in);
		out.println("円の面積を求めます。");
		out.print("半径：");
		double r = stdIn.nextDouble();
		out.println("面積は" + (PI * r * r) + "です。");
	}

}
