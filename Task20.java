package by.htp.les05.main;
//. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 
public class Task20 {
	public static void main(String[] args) {
int sum =0;
	int x = 90;
	count(x, sum);
	

}


public static int sum(int x) {  //123
int sum = 0;
	int p;
	while (x!=0) {
		p = x%10; //3 //2
		sum = p+sum; //3 
		x = x/10; //2

	}
	
	
	return sum;
	
}
//////////////////
public static int count(int x, int sum) {  //123
int count=0;

	while (x!=0) 	 {
		if (x>=0)
		{
 x = x-sum(x); 
	count++;

	//System.out.println("c = " + count);
	}
		
	//return count;
	
}System.out.println("c = " + count);
	return count;
}}