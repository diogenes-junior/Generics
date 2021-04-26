package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		PrintService<String> ps2 = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			int value = input.nextInt();
			ps.addValue(value);
		}
		
		System.out.println("How many values string? ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			String value = input.next();
			ps2.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		System.out.println();
		ps2.print();
		System.out.println("First: " + ps2.first());
		
		input.close();
	}

}
