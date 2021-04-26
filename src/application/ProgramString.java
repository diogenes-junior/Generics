package application;

import java.util.Scanner;

import model.services.PrintServiceString;

public class ProgramString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		PrintServiceString ps = new PrintServiceString();
		
		System.out.println("How many values? ");
		int n = input.nextInt();
		input.nextLine();
		
		for(int i=1; i<=n; i++) {
			String str = input.nextLine();
			ps.addValue(str);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		input.close();
	}

}
