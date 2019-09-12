package by.htp.les05.main;

import java.util.Scanner;

//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
public class Task {
    public static void main(String[] args) {
        double sq;
        sq = square();
        System.out.println("triangle square = " + sq);

    }
    ////////////////////////////////
    public static double square(){
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        double p;
        double sq;
        double l1;
        double l2;
        double l3;
        x1 = enterFromConsole();
        System.out.println("x1 = " + x1);
        y1 = enterFromConsole();
        System.out.println("y1 =" + y1);
        x2 = enterFromConsole();
        System.out.println("x2 = " + x2);
        y2 = enterFromConsole();
        System.out.println("y2 =" + y2);
        x3 = enterFromConsole();
        System.out.println("x3 =" + x3);
        y3 = enterFromConsole();
        System.out.println("y3 =" + y3);
        l1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        l2 = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));
        l3 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));
        p  = 1/(l1 + l2 + l3);
        sq = Math.sqrt((p * (p - l1) * (p - l2) * (p - l3)));
        return sq;

    }
    /////////////////////////////
    public static int enterFromConsole(){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        while (!sc.hasNextInt()){
            System.out.print(">");
            sc.next();
        } number = sc.nextInt();
        return  number;
    }
}
