
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n,
//равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию. 
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		int count = 0;
		int K = 380;
		arm(n, count, K);

	}

	public static int count(int n) {
		int count = 0;
		while (n > 0) {

			n = n / 10;
			count = count + 1;

		}
	
		return count;
	}
	
	

	public static int sum(int n, int count) {
		int c = count(n);
		int sum = 0;
		int p1 = 0;
		while (n > 0) {

			int p = n % 10;
			n = n / 10;
			p1 = (int) Math.pow(p, c);
			sum = sum + p1;

		}
			return sum;
	}

	public static void arm(int n, int count, int K) {
	int sum1 = sum(n, count);
	int arm = 0;
	for (int i = 0; n<K ; i++) {
			
	if (n==sum1 )
	{
		System.out.println("n = " + +n + " = sum = " + sum1);
		arm = sum1;
		}

	n=n+1;
	sum1 = sum(n, count);
	}
	
	}}
	