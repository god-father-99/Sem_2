package ITER.Sem2;
import java.util.Scanner;
/*
  Created by Aditya Sahu
  Regd. no.-2241019168
  sec-22441012
*/
public class Assignment_1_Q2{
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.print("Enter the Weight in kg : ");
double w=sc.nextDouble();
System.out.print("Enter the Height in meters : ");
double h=sc.nextDouble();
double bmi=w/(Math.pow(h,2));
String a="";
     if(bmi<18.5)
	a="Underweight";
     else if(bmi<24.9)
	a="Normal Weight";
     else if(bmi<29.9)
	a="Overweight";
     else
	a="Obese";
	System.out.println("The person is "+a);
     }
}
