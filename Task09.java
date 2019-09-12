
package by.htp.les05.main;

import java.util.Random;
//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.  
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

int a = 15;
int b = 5;
int c = 7;

 int p = nod(a, b, c);

 if (p ==1) {
	 System.out.println("3 числа взаимно простые");
 }
 else {
 System.out.println("числа не взаимно простые");
	}}
///////////////////////////////////
	public static int nod(int a, int b, int c) {
		int x;
		int p = 1;
		x = 1;
		while (x <= a && x <= b && x<=c) {

			if (a % x == 0 && b % x == 0 && c % x == 0) {
				p = x;
			}
			 x++;
		}
		return p;
	}}