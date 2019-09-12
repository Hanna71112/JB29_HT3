package by.htp.les05.main;
//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		int x, y, p1, p2, p3;
		int c, d;
		x = enterFromConsole();
		y = enterFromConsole();
		c = enterFromConsole();
		d = enterFromConsole();
		p1 = nod(x, y);
				
		p2 = nod(c, d);
			
		p3 = nod (p1, p2);
		System.out.println("nod =  " + p3);

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
			a = a + 1;
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