package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_HA_Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines for input : ");
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        System.out.println("Enter lines : ");
        for(int i=0;i<n;i++)
            s[i]=sc.nextLine();
        System.out.println("Lines in reverse ordered are : ");
        for(int j=n-1;j>=0;j--)
            System.out.println(s[j]);
    }
}
