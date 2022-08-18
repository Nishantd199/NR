package testpackage3;

import java.util.Scanner;

public class factorialexample1 {
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("factorial of"+n+"is"+fact);
		
	}
}
