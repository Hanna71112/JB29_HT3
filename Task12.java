
package by.htp.les05.main;

import java.util.Random;
// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.  
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		double X = 3;
		double Y = 4;
		double Z = 5;
		double T = 7;
	
		double square = square1(X, Y) + square2(X,Y,Z,T);
		System.out.println("square = " + square);

	}

	public static double square1(double x, double y) {
		double S1 = (x * y) / 2;
		System.out.println("square = " + S1);
		return  S1;

	}

	/////
	public static double square2(double x, double y, double z, double t) {
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double p = (d + z + t) / 2;
		double S2 = Math.sqrt(p * (p - d) * (p - z) * (p - t));
		System.out.println("square = " + S2);
		return S2;

	}

}