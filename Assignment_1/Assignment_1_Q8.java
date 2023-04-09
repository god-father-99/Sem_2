package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_Q8
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		int sum=0;
		System.out.print("Enter elements of 2D-Array:");
		for (int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			arr[i][j]=sc.nextInt();
		System.out.println("The elements of 2D array are: ");
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of elements of the 2D-Array is "+sum);
	}

}
