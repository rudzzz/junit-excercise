package app;

import entities.Financing;

public class Program {

	public static void main(String[] args) {

		try {
			Financing f1 = new Financing(100000.0, 2000.0, 20);
			System.out.println("Financial data 1:");
			System.out.printf("Income: %.2f%n", f1.entry());
			System.out.printf("Quota: %.2f%n", f1.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error in financial 1: " + e.getMessage());
		}
		
		try {
			Financing f2 = new Financing(100000.0, 2000.0, 80);
			System.out.println("Financial data 2:");
			System.out.printf("Income: %.2f%n", f2.entry());
			System.out.printf("Quota: %.2f%n", f2.quota());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error in financial 2: " + e.getMessage());
		}
	}
}
