package selenium;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number: ");
		float a=s.nextFloat();
		
		System.out.println("enter secound nomber");
		int b = s.nextInt();
		float c= a/b;
		System.out.println(c);
	}

}
