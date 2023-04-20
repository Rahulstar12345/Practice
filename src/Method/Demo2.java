package Method;

import java.util.Scanner;

public class Demo2 {
	public void add() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition of a and b:"+c);
	}
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		d.add();
		
		System.out.println("Prasad Rupawte.");
		System.out.println("Prasad Rupawte.");
		System.out.println("Prasad Rupawte.");
		System.out.println("Prasad Rupawte.");
		System.out.println("Prasad Rupawte.");
		Demo2 d2=new Demo2();
		d2.add();
		
	}

}
