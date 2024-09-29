package com.busyqa.coursework1;
import java.util.Scanner;
public class ReadValues {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1=sc.nextInt();
		System.out.println("Enter the Second value:");
		int num2=sc.nextInt();
		int sum= num1+num2;
		sc.close();
		System.out.println("sum:"+sum);
		
		
		
	}

}
