package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_Q3
{
		public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		int sum=0,product=1,t=n;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			product*=r;
			n/=10;
		}
		if(sum==product)
			System.out.print(t+" is a spy number");
		else
			System.out.print(t+" is not a spy number");
	}

}
