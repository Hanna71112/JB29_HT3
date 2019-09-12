
package by.htp.les05.main;

import java.util.Random;
//. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов). 
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {


		int[] N = new int [] { 1, 2, 5, 4, 3 };
		int max = max(N);
		int max1 = max1(N, max);
		System.out.println("max = " + max1);
	}

				

///////////////////////////////////
public static int max (int[] N) {

	int max = 0;
	for (int i = 0; i < N.length; i++) {
		System.out.println("i = " + N[i]);
	if (max<N[i])
	 {
		 max=N[i];
	 }

	
	
	}
	System.out.println("max = " + max);
	return max;
}
////////////////////////////////////


public static int max1 (int[] N, int max) {

	for (int i = 0; i < N.length; i++) {
		System.out.println("i = " + N[i]);

   
   		 	 if (i == max){
         continue;
         }
     	max = N[i];

	}
	return max;}}

	