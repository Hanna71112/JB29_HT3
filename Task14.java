
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
// . Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр 

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		int n1 = 2115;
		int n2 = 12344;
		int count1 = count(n1);
		System.out.println("count1 = " + count(n1));
		int count2 = count(n2);
		System.out.println("count2 = " + count(n2));
		if (count(n1)>count(n2))
		{
			System.out.println("n1 больше чем n2");
		}
		else System.out.println("n2 больше чем n1");
	}

	/////////
	public static int count(int n) {

		int i = 0;
			while (n>0)
			{
				
				n = n/10;
				i = i+1;
				
			}
			
		
		
		return i;

	}
}
