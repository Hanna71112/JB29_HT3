package by.htp.les05.main;
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		int a;
		double res;
		a = enterFromConsole();
		
		res = sq(a);
		System.out.println("s = " + res);
		}

	//////////////////////////////
	public static double sq (int a) {
		double s;
			
	s = (3 * Math.sqrt(3)*Math.pow(a, 2))/2;
	return s;
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