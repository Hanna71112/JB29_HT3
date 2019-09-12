package by.htp.les05.main;
// Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		int x, y, c, max1, max, min1, min, sum;
		x = enterFromConsole();
		y = enterFromConsole();
		c = enterFromConsole();
	
		max1 = max(x, y);
			
		max = max(max1, c);
		System.out.println("max =  " + max);
		
		
		min1 = min(x, y);
		
		min = min(min1, c);
		System.out.println("min = " + min);
		
		sum  = max+min;
		System.out.println("sum = " + sum);
		}

	//////////////////////////////
	public static int max (int x, int y) {
		int max;
			
		if (x<y)
		{
			max =y;
		}
		else {
			max = x;
		}
	
		return max;
	}
	
	///////////////////////////////
	public static int min (int x, int y) {
		int min;
			
		if (y<x)
		{
			min =y;
		}
		else {
			min = x;
		}
	
		return min;
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