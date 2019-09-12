package by.htp.les05.main;
//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.

import java.util.Scanner;

public class Task01 {
	
public static void main(String[] args) {
	double res = Square();
 	 System.out.println("S = " +res);

}
//////////////////////////////////////////////////////
public static double Square() {
	double S;
	double x1 = -4;
 	double y1 = 3;
 	double x2 = -2;
 	double y2 = 1;
 	double x3 = 2;
 	double y3 = 0;
	S = (((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1))/2);
		return S;
}}