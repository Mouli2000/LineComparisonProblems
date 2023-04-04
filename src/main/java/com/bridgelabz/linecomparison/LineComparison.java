package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter X1 : ");
		int x1 = scan.nextInt();
		System.out.print("Enter Y1 : ");
		int y1 = scan.nextInt();
		System.out.print("Enter X2 : ");
		int x2 = scan.nextInt();
		System.out.print("Enter Y2 : ");
		int y2 = scan.nextInt();
		
		double length = Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
		System.out.println("Length of the Line : "+length);
	}
}
