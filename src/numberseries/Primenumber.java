package numberseries;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {
		int num=153;
		int add=0;
		int rem;
		for(int i=1;num>0;)
		{
			rem=num%10;
			add=add+rem;
			System.out.print(rem);
		}
		
		}
	}

