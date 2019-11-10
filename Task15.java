
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются числа,
//сумма цифр которых равна К и которые не большее N. 

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		int K = 5;
		int N = 10;
		int [] mas  = mas(K, N);
		
	
	}

	/////////
	public static int[] mas(int K, int N) {
		
		int a = 1;
		
		
		int[] mas = new int [6];
		for (int i = 0; a > 0; i++) {
			a = K - i;
			if (a < N && i<N) {

				String p = Integer.toString(a);
				String p1 = Integer.toString(i);
				String P = p+p1;
				//System.out.println("a = " + P);
				mas[i] = Integer.parseInt(P);
			//System.out.println("mas = " + mas[i]);
			
		
			} else {
				a = a - 1;
                i = i+1;
			}
			
		}
		System.out.println(Arrays.toString(mas));
		return mas;
	}

}
