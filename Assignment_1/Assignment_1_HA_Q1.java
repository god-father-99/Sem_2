package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_HA_Q1 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st integer : ");
		int a = sc.nextInt();
		System.out.print("enter 2nd integer : ");
		int b = sc.nextInt();
		System.out.print("enter 3rd integer : ");
		int c = sc.nextInt();
		if( a+b==c && b-c ==a && a*b==c )
		System.out.println("the numbers can be used in a correct arithmetic formula");
		else
		System.out.println("the numbers cannot be used in correct arithmetic formula ");

	}
}