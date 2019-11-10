
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N. 

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		int N = 2115;
		int [] mas  = mas(N);
		System.out.println(Arrays.toString(mas));

	}

	/////////
	public static int [] mas (int N) {
	
		{
			String m = Integer.toString(N);
			int [] mas = new int[m.length()];
			for (int i = 0; i<m.length(); i++)
			{
				mas[i] = N%10;
				N = N / 10;
				System.out.println("mas = " + mas[i]);
						}
			
		
	
		return mas;

		}
	}}
