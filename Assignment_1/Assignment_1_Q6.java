package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_Q6 {
	public static boolean isOdd(int n) {
		int b=n&1;
		if(b==0)
			return false;
		else
			return true;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x=sc.nextInt();
		System.out.println(x+" is odd : "+isOdd(x));
		sc.close();
	}

}
