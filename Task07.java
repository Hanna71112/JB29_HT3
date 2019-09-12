package by.htp.les05.main;
import java.util.Random;
//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		int size = 10;
		
		double [] coord = new double [size];
		
		//////
		Random rand = new Random();
		 for (int i = 0; i<coord.length; i++)
		 {
			 coord[i] = rand.nextDouble();
			 System.out.println("i = " + coord[i]);
		 }
	
		 double max = 0;
		 int xP1 = 0;
		 int xP2 = 0;

		 for(int i=0; i<coord.length-1; i=i+2)
		 {
		 	 for (int j = i+2; j<coord.length-1; j=j+2)
		 	 {
		 		double cdis;
		 		 cdis = dis(coord[i],coord[i+1],coord[j],coord[j+1] );
		 		 
		 		 if (max<cdis)
		 			 {
		 			 max = cdis;
		 			 xP1 = i;
		 			 xP2 = j;
		 			 }
		 		
		 			 }
		 	//System.out.println("max = " + max);
		 	 }
		 System.out.println("max = " + max);
		 System.out.println("max = " + xP1);
		 System.out.println("max = " + xP2);
		 }
		 ///////////////////////////////////////////////////////////////////////
			public static double dis (double x1, double y1, double x2, double y2) {
				double r1 = x2-x1;
				double r2 = y2-y1;
				double c = Math.sqrt(r1 *r1 + r2*r2);
				return c;
						}
		 
	
}
/////////////////
	


	
	

