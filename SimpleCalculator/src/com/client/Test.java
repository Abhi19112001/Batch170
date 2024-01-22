package com.client;

import java.util.Scanner;

import com.model.Calculator;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Calculator c=new Calculator();
	char ch;
	do{System.out.println("------Simple Calculator-----\n"
						+"1.Addition of Number\n"
						+"2.Subtraction of Number\n"
						+"3.Multiplication of number\n"
						+"4.Division of number\n"
						+"5.Exit");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:{
		c.Addition();
	}
	break;
	case 2:{
		c.Subtraction();
	}
	break;
	case 3:{
		c.Multiplication();
	}
	break;
	case 4:{
		c.Division();
	}
	break;
	case 5:{
		System.out.println("Exit from calculator");
		System.exit(0);
	}
	break;
	default:{
		System.out.println("Wrong choice");
	}
	break;
		
	}
	System.out.println("Do you want to continue");
	ch=sc.next().charAt(0);
}while(ch=='y'||ch=='Y');
}
}
