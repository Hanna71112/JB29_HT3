
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		boolean flag;
		int n = 4;
		int count;
		int sum = 0;

		for (int x = (int) Math.pow(10, n - 1); x < (int) Math.pow(10, n); x++) {
			flag = nech(x);
			if (flag==true) {
				sum = sum+x;
			}
			
		}
		 count = chet(sum);
		System.out.println(sum);
		System.out.println(count);
	}

	
	public static boolean nech(int x) {  //123
		boolean f =true;
		int p=1;
		while (x!=0) {
			p = x%10;
		if (p%2!=0)
		{
			x = x/10;
		}
		else {f = true;
		break;
		}}
		return f;
		
	}
	
	public static int chet(int sum) {  //123
		int count =0;
int p;
		while (sum!=0) {
			p = sum%10;  //5 //0 //9
		if (p%2==0)
		{
			count = count+1; //1
				}
		sum = sum/10;
		}
		return count;
		
	}

}