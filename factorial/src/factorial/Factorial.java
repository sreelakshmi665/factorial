package factorial;

import java.util.Scanner;

public class Factorial {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		int fact=1;
		System.out.println("Enter size");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given number "+n+" is: "+fact);
}
}
