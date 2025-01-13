package logicalprogramsscannerdemo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Integer Number:");
		
		int variable = scanner.nextInt();
		System.out.println(variable);
		//scanner.nextLine();
		//String add=scanner.nextLine();
		//System.out.println(add);
		System.out.println("Enter a Character");
		char charVariable=scanner.next().charAt(2);
		System.out.println(charVariable);
		scanner.close();
	}

}
