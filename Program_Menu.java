package ua.univer.abramyanFor;


import java.util.Scanner;

public class Program_Menu {
	
	
public static Scanner in = new Scanner(System.in);
	

	
public static void main(String[] args)  {
	int n = 5; int k = 8;
	int a = 3;
	int b = 9;
	int price = 99;
	System.out.println("1.numbK");
	System.out.println("2.hightUp");
	System.out.println("3.hightDown");
	System.out.println("4.candyPriceKg");
	System.out.println("5.candyPriceGram");
	System.out.println("0.Other numbers = Error");
	int c = 0;
	c = in.nextInt();
	
	
	
		switch (c) {
		case 1:
			MyLibFor.numbK(n, k);
			break;
		case 2:
			System.out.println("length = "+MyLibFor.hightUp(a,b));
			break;
		case 3:
			System.out.println("length = "+MyLibFor.hightDown(a,b));
			break;
		case 4:
			MyLibFor.candyPriceKg(price);
			break;
		case 5:
			MyLibFor.candyPriceGram(price);
			break;
		
			default: 
				System.out.println("Error");
				break;
		} 
	
	
}
}	
