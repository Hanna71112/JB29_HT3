
package by.htp.les05.main;

import java.util.Arrays;
import java.util.Random;
//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
//Для решения задачи использовать декомпозицию.  
import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		boolean flag;
		int n =3;

		for (int x = (int) Math.pow(10, n - 1); x < (int) Math.pow(10, n); x++) {
			flag = posled(x);
			if (flag==false) {
				System.out.println(x);
			}
		}
	}

	public static boolean posled(int x) {  //123
		boolean flag = true;
		int k = x;  //123 
		int buf = k; //123  
		int dig;
		
		
		while (x != 0) {
			dig = x % 10;  //3  //2  //1
			if (buf != k) {
				if (dig + 1 == buf) {  //2+1=3
					buf = dig; //2
					x /= 10; //1
				} else {
					flag = false;
					break;
				}
			} else {
				buf = dig;  //3  
				x /= 10; //12 
			}
		}
		return flag;
	}
}