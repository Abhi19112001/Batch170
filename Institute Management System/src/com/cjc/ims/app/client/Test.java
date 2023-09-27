package com.cjc.ims.app.client;
import com.cjc.ims.app.model.*;

import com.cjc.ims.app.servicei.*;
import com.cjc.ims.app.serviceimpl.Karvenagar;
import java.util.Scanner;

public class Test {
public static void main(String[] args)  {
	Scanner sc1=new Scanner(System.in);
		Karvenagar k1=new Karvenagar();
		Karvenagar k2=new Karvenagar();
		
		
	while(true) {
		System.out.println("----Choose----\n"
				+"1.addCourse--\n"
				+"2.viewCourse--\n"
				+"3.addFaculty--\n"
				+"4.viewFaculty--\n"
				+"5.addBatch--\n"
				+"6.viewBatch--\n"
				+"7.addStudent--\n"
				+"8.viewStudent\n"
				+"9.Exit---");

		int num=sc1.nextInt();

		if(num==1) {
			
			k1.addCource();
		}
		else if(num==2) {
			 k1.viewCourse();
		}
		else if(num==3) {
			k1.addFaculty();
		}
		else if(num==4) {
			k1.viewFaculty();
		}
		else if(num==5) {
			k1.addBatch();
		}
		else if(num==6) {
			k1.viewBatch();
		}
		else if(num==7) {
			k1.addStudent();
		}
		else if(num==8) {
			k1.viewStudent();
		}
		else if(num==9){
			
			System.out.println("exit the application--");
			System.exit(0);
			
		}
		else {
			System.out.println("Wrong Choice");
		}
	}
}
}
