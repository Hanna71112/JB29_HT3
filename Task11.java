
package by.htp.les05.main;

import java.util.Random;
// Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m. 
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		int k = 0;
		int m = 0;
		int sum =0;
		int[] D = new int [] { 1, 7, 3, 4, 5, 6, 7, 8, 9, 10 };
	for (int i=0; i<D.length; i++ )
	{   k = 1;
		m = k+2;
		}
	
	sum = sum(D, k);
	System.out.println("sum1 = " + sum);
	sum = sum(D, m);
	System.out.println("sum2 = " + sum);

		
	}
	public static int sum (int[] D, int k)
	{
		int sum = D[k] +D[k+1] + D[k+2];
		
		return sum;
		
	}
	
}