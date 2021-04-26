package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		PrintService ps = new PrintService();
		
		System.out.println("How many values? ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			int number = input.nextInt();
			ps.addValue(number);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		input.close();
	}

}
