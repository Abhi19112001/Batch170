package com.model;

import java.util.Scanner;

public class Calculator {
Scanner sc=new Scanner(System.in);
int first;
int second;
//Addition
public void Addition() {
	System.out.println("Enter first number");
    first=sc.nextInt();
    System.out.println("Enter second number");
    second=sc.nextInt();
    int sum=first+second;
    System.out.println("Addition of number is:- " + sum);
}
//Subtraction
public void Subtraction() {
System.out.println("Enter first number");
first=sc.nextInt();
System.out.println("Enter second number");
second=sc.nextInt();
int sum=first-second;
if(first>=second) {

System.out.println("Subtraction of number is:- " + sum);
}else {
	System.out.println("first number is less than second number");
	System.out.println("Subtraction of number is:- " + sum);
}
}
//Multiplication
public void Multiplication() {
	System.out.println("Enter first number");
	first=sc.nextInt();
	System.out.println("Enter second number");
	second=sc.nextInt();
	int mul=first*second;
	System.out.println("Multiplication of two number is:- "+mul);
}
//Division
public void Division() {
	System.out.println("Enter first number");
	first=sc.nextInt();
	System.out.println("Enter second number");
	second=sc.nextInt();
	float div=first/second;
	if(first>=second) {
	System.out.println("Division of number is:- "+div);
	}else {
		System.out.println("first number is less than second number");
		System.out.println("\"Division of number is:- "+div);
		
	}
	
}
}
