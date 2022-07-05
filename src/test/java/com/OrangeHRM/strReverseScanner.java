//string reverse
package com.OrangeHRM;

import java.util.Scanner;

public class strReverseScanner {
	public static void main(String args[]) {
		String str;
		Scanner in = new Scanner(System.in);
		System.out.println("String:");
		str = in.nextLine();
		String[] token = str.split("");
		for(int i = token.length-1; i>=0; i --){
			System.out.print(token[i]+"");
		}
	}

}
