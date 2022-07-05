package com.OrangeHRM;

import java.util.Scanner;

public class numbersSwap {
	public static void main(String[] args) {
		int x, y, temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x and y");
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before swapping x =" +x +"y=" +y);
		temp =x;
		x=y;
		y=temp;
		System.out.println("After swapping x =" +x +"y=" +y);
	}

}
