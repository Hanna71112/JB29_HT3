
package by.htp.les05.main;

import java.util.Random;
//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		int a = 9;
		int p = 1;
int sum1 = 0;
		for (int i = 1; i <= a; i++) {

			if (i % 2 != 0) {
				p = f(i);
				System.out.print("i = " + i + "      ");
				System.out.print("f = " + p + "      ");
				sum1 = sum1 + p;
				
			}
	
		}
		System.out.println("sum = " + sum1);
	}

	public static int f(int i) {
		int f = 1;
		for (int a = 1; a <= i; a++) {

			f = f * a;

		}
		return f;
	}
}