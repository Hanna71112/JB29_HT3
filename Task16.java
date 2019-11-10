
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		int n = 10;
		int n2 = n * 2;

		bl(n, n2);
	}

	public static void bl(int n, int n2) {
		

	for (int i=0; n<=n2; n++)
	{
		int bl =n;
		int p = n+2;
		if (bl>=n && p<=n2) {
		
		System.out.println("bl = " + bl+"," +p);	
		}
	
}

	}
}
