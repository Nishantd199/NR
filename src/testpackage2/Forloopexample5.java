package testpackage2;

import java.util.Scanner;

public class Forloopexample5 {
	public static void main(String[] args) {
		int pass;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		pass=sc.nextInt();
		if(pass==4141)
		{
			System.out.println("my name=akash");
			System.out.println("my age =20");
			System.out.println("my contact=93221000210");
			System.out.println("my address=beed");
			System.out.println("my favourite colour=black");
			System.out.println("my favourite food=chicken ");
			System.out.println("my weakness=easy the trust on people");
			System.out.println("my hobbies=travling");
		}
		else
		{
			System.out.print("sorry! wrong password");
		}
	}
	}
