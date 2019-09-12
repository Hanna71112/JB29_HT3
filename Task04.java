package by.htp.les05.main;
//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		int x, y, p1, p2, p3;
		int c;
		x = enterFromConsole();
		y = enterFromConsole();
		c = enterFromConsole();
	
		p1 = nod(x, y);
		System.out.println("nod =  " + p1);
		
		p2 = nod(p1, c);
		System.out.println("nod =  " + p2);
		
		int nok = (x * y * c) / (p2+p1);

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