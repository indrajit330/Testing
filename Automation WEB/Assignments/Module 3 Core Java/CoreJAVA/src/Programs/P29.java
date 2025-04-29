package Assignment;

import java.util.Scanner;

public class P29 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks = ");
		int marks = sc.nextInt();
		
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 50) {
			System.out.println("pass class");
		} else if (marks >= 51 && marks <= 70) {
			System.out.println("C class");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B class");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A class");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}
}		
}		