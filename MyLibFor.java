package ua.univer.abramyanFor;

public class MyLibFor {
	
	
	public static int numbK (int x, int y) {
		int z = 0;
		for (int i=0; i<x; i++) {
		z = y;	
		System.out.println(y);
		}
		return z;
	}	
	
	public static int hightUp(int x, int y) {
		int res = 0;
		for(int i=x; i<=y; i++) {
			res ++; 
			System.out.println(i);	
		}
		return res;
	}
	
	public static int hightDown(int x, int y) {
		int res = 0;
		for(int i=y; i>x; i--) {
			res ++; 
			System.out.println(i);
		}
		return res;
	}
	
	public static int candyPriceKg( int x) {
		int y=1;
		for (int i=1; i<=10; i++) {
			y =x*i;
			System.out.println("price = "+y+"UAH");
		}
		return y;
	}
	
	public static double candyPriceGram( int x) {
		double y=1;
		for (double i=0.1; i<=1; i+=0.1) {
			y =x*i;
			System.out.println("price = "+ Math.round(y)+"UAH");
		}
		return y;
	}
	
	
	
}
