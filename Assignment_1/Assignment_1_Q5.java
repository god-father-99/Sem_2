package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_Q5 {
	public static int sum_Of_Digits(int n) {
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum+=r;
			n/=10;
		}
		if(sum>=10)
			return sum_Of_Digits(sum);
		else
			return sum;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x=sc.nextInt();
		System.out.print(  "Sum of digits of "+x
						 + " until the number is a"
				         + " single digit is "+sum_Of_Digits(x));
	}


}
