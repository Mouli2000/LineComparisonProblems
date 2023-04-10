package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
	
	static void comparison(double length1, double length2) {
		
		Double value1 = new Double(length1);
		Double value2 = new Double(length2);
		
		int compare = value1.compareTo(value2);
		boolean equals = value1.equals(value2);
		if(equals == true)
			System.out.println("Two Lines are Equal !!!");
		else if(compare > 0)
			System.out.println("Line1 is Greater Than Line2...");
		else
			System.out.println("Line1 is Lesser Than Line2...");
	}

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
		
		System.out.print("Enter P1 : ");
		int p1 = scan.nextInt();
		System.out.print("Enter Q1 : ");
		int q1 = scan.nextInt();
		System.out.print("Enter P2 : ");
		int p2 = scan.nextInt();
		System.out.print("Enter Q2 : ");
		int q2 = scan.nextInt();
		
		double length1 = Math.sqrt((Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2))));
		double length2 = Math.sqrt((Math.pow((p2-p1), 2)+(Math.pow((q2-q1), 2))));
		
		comparison(length1, length2);
	}
}
