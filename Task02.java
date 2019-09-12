package by.htp.les05.main;
//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел: 

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		int x, y, p;
		x = enterFromConsole();
		y = enterFromConsole();
		p = nod(x, y);

		int nok = (x * y) / p;
		System.out.println("nod =  " + p);
		System.out.println("nok =  " + nok);

	}

	//////////////////////////////
	public static int nod(int x, int y) {
		int a;
		int p = 1;
		a = 1;
		while (a <= y && a <= x) {

			if (x % a == 0 && y % a == 0) {
				p = a;
			}
			a++;
		}
		return p;
	}

	public static int enterFromConsole() {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers:");
		while (!sc.hasNextInt()) {
			System.out.print(">");
			sc.next();
		}
		number = sc.nextInt();
		return number;
	}

}