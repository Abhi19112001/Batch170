package com.client;

import java.util.Scanner;

import com.model.TempConverter;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	TempConverter tc=new TempConverter();
	char ch;
	do {
	System.out.println("Temp converter\n"
						+"1.farhenhite to celcius\n"
						+"2.celcius to farhenhite\n"
						+"3.Exit");
	int choice=sc.nextInt();
	
	if(choice==1) {
		System.out.println("Enter Temprature value to convert");
		int temp=sc.nextInt();
		tc.tempcon(temp);
	}
	else if(choice==2) {
		System.out.println("Enter Temprature value to convert");
		int temp=sc.nextInt();
		tc.tempco(temp);
	}
	else if(choice==3) {
		System.out.println("exit from program");
		System.exit(0);
	}else {
		System.out.println("Wrong choice");
	}
	System.out.println("Do you want to continue");
	 ch=sc.next().charAt(0);
	}while(ch=='y'|| ch=='Y');
}
}
