package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.servicei.Cjc;
import java.io.*;
import com.cjc.ims.app.client.*;
import com.cjc.ims.app.model.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;

public class Karvenagar  implements Cjc {
static int count;
Scanner sc=null;
Scanner s=null;
List<Course> clist=new ArrayList<>();
List<Faculty> flist=new ArrayList<>();
List<Batch> blist=new ArrayList<>();
List<Student> slist=new ArrayList<>();

@Override
public void addCource() {
	Course c=new Course();
	sc=new Scanner(System.in);
	s=new Scanner(System.in);
	System.out.println("Enter Your Course Id");
try {
	int cid=sc.nextInt();
	c.setCid(cid);
	}
catch(InputMismatchException e)
{
	System.out.println("enter integer value only");
	int d=s.nextInt();
	c.setCid(d);
}

System.out.println("Enter Your Course Name");
	String n=s.next();
	c.setCname(n);
	clist.add(c);
	
	
}
@Override
public void viewCourse() {
	if(clist.isEmpty()==false) {
		Iterator<Course> itr=clist.iterator();
	
	System.out.println("These Course Available");
	int count=0;
		while (itr.hasNext()) {
			
			count=count+1;
			System.out.println("Course No:-"+count);
			Course course=(Course)itr.next();
			System.out.println("Course Id :"+(course.getCid()));
			System.out.println("Course Name :"+(course.getCname()));
			System.out.println("---------");
			this.count=count;
		}
	}
	else if(clist.isEmpty()) {
		System.out.println("Please add Course First and then view Course");
	}
}
@Override
public void addFaculty()throws OverCountException {
	if(clist.isEmpty()==false) {
			Faculty f=new Faculty();
	sc=new Scanner(System.in);
	s=new Scanner(System.in);
	System.out.println("Enter Your Faculty id");
	int r;
	try{
		r=sc.nextInt();
		}
	catch(InputMismatchException e) {
		System.out.println("Enter only Integer value");
		r=s.nextInt();
	}
	f.setFid(r);
	System.out.println("Enter Your Faculty name");
	f.setFname(s.next()+s.nextLine());
	System.out.println("Choose Your Course No");
	viewCourse();
	System.out.println("Enter Your Course no you choose");
	int x=0;
	try{
		x=s.nextInt();
		if(x>count) {
			throw new OverCountException("Value Should Not more Than to count no");
		}
	}catch(OverCountException o) {
		System.out.println(o.getMessage());
		System.out.println("Enter Value betn count of course");
		x=s.nextInt();
	}
	
	
	Iterator<Course> citr=clist.iterator();
	while (citr.hasNext()) {
		Course course = (Course) citr.next();
		for(int i=1;i<=x;i++) {
			if(x==i) {
				try{
					
					f.setCourse(clist.get(i-1));
				}
				catch (IndexOutOfBoundsException e) {
					System.out.println("Enter Choice only from Course no");
					int i1=s.nextInt();
					f.setCourse(clist.get(i1-1));
				}
}
}
}
	flist.add(f);
	}
	else if(clist.isEmpty()) {
		System.out.println("please add First course then add faculty");
	}
}
@Override
public void viewFaculty() {
	if(flist.isEmpty()==false) {
		Iterator<Faculty> itr1=flist.iterator();
	
	System.out.println("This Faculty Available");
	int count=0;
		while (itr1.hasNext()) {
			count=count+1;
			System.out.println("Faculty No:-"+count);
			Faculty faculty = (Faculty) itr1.next();
			System.out.println("Faculty Id :"+(faculty.getFid()));
			System.out.println("Faculty Name :"+(faculty.getFname()));
			System.out.println("Course Name :"+(faculty.getCourse().getCname()));
			System.out.println("Your Course id :"+(faculty.getCourse().getCid()));
			System.out.println("-------");
			this.count=count;
		}
	}
		else if(flist.isEmpty()) {
			System.out.println("please add First faculty then view faculty");
		}
}
@Override
public void addBatch() {
	if(flist.isEmpty()==false) {
		Batch b=new Batch();
	sc=new Scanner(System.in);
	s=new Scanner(System.in);
	System.out.println("Enter Your Batch Id");
	int v;
	try {
	 v=sc.nextInt();
	
	}
	catch (InputMismatchException e) {
		System.out.println("Enter Only Integer value");
		v=s.nextInt();
		
	}
	b.setBid(v);
	System.out.println("Enter Your Batch Name");
	b.setBname(s.next()+s.nextLine());
	System.out.println("Choose your Faculty No");
	viewFaculty();
	System.out.println("Enter Your Faculty No");
	int x=0;
	try{
		x=s.nextInt();
		if(x>count) {
			throw new OverCountException("Value Should Not more Than to count no");
		}
	}
	catch(OverCountException o) {
		System.out.println(o.getMessage());
		System.out.println("Enter Value bet of the faculty no");
		x=s.nextInt();
	}
	Iterator<Faculty> fitr=flist.iterator();
	while (fitr.hasNext()) {
		Faculty faculty = (Faculty) fitr.next();
		for(int i=1;i<=x;i++) {
		if(x==i) {
			try
			{
				b.setFaculty(flist.get(i-1));
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Enter value from Faculty no");
				int x4=s.nextInt();
				b.setFaculty(flist.get(x4-1));
			}
	
		}
		}
	}
	blist.add(b);
}
	else if(flist.isEmpty()) {
		System.out.println("please add First faculty then add batch");
	}
	
}
@Override
public void viewBatch() {
	if(blist.isEmpty()==false) {
	Iterator<Batch> itr2=blist.iterator();
	System.out.println("This Batch Available");
	int count=0;
		while (itr2.hasNext()) {
			count=count+1;
			System.out.println("Batch No:-"+count);
			Batch batch = (Batch) itr2.next();
			System.out.println("Batch Id :"+(batch.getBid()));
			System.out.println("Batch Name :"+(batch.getBname()));
			System.out.println("Your Faculty Name:- "+(batch.getFaculty().getFname()));
			System.out.println("Your Faculty Id:-"+(batch.getFaculty().getFid()));
			System.out.println("Your Course Name:-"+batch.getFaculty().getCourse().getCname());
			System.out.println("Your Course Id:-"+batch.getFaculty().getCourse().getCid());
			System.out.println("-----------");
			this.count=count;
		}
}
		else if(blist.isEmpty()) {
			System.out.println("please add First batch then view batch");
		}
	}
	
	
	

@Override
public void addStudent() {
	if(blist.isEmpty()==false) {
		Student stu=new Student();
	sc=new Scanner(System.in);
	this.s=new Scanner(System.in);
	System.out.println("Enter Your Student Id");
	int t;
	try {
		t=sc.nextInt();
	}
	catch (InputMismatchException e) {
		System.out.println("Enter Only Integer value");
		t=this.s.nextInt();
	}
	stu.setSid(t);
	System.out.println("Enter Your Student Name");
	stu.setSname(sc.next()+sc.nextLine());
	System.out.println("Chose your Batch No");
	viewBatch();
	System.out.println("Enter Your Batch No");
	int x=0;
	try{
		x=this.s.nextInt();
		if(x>count) {
			throw new OverCountException("Value Should Not more Than to count no");
		}
	}
	catch(OverCountException o) {
		System.out.println(o.getMessage());
		System.out.println("Enter Value bet of the Batch no");
		x=this.s.nextInt();
	}
	Iterator<Batch> sitr=blist.iterator();
	while (sitr.hasNext()) {
		Batch batch = (Batch) sitr.next();
		for(int i=1;i<=x;i++) {
		if(x==i) {
			try{
				stu.setBatch(blist.get(i-1));
			}catch(IndexOutOfBoundsException ie){
				System.out.println("Enter No only from choice");
				int x5=this.s.nextInt();
				stu.setBatch(blist.get(x5-1));
				}
		}
	}
	}
	slist.add(stu);
	}
	else if(blist.isEmpty()) {
		System.out.println("First add batch then add Student");
	}
	
}
@Override
public void viewStudent() {
	if(slist.isEmpty()==false) {
		Iterator<Student> sitr2=slist.iterator();
	System.out.println("Student detail");
	while (sitr2.hasNext()) {
		Student student = (Student) sitr2.next();
		System.out.println("Student name :"+(student.getSname()));
		System.out.println("Student ID :"+(student.getSid()));
		System.out.println("Your Batch Name:-"+student.getBatch().getBname());
		System.out.println("Your Batch Id:-"+student.getBatch().getBid());
		System.out.println("Your Faculty Name:- "+(student.getBatch().getFaculty().getFname()));
		System.out.println("Your Faculty Id:-"+(student.getBatch().getFaculty().getFid()));
		System.out.println("Your Course Name:-"+student.getBatch().getFaculty().getCourse().getCname());
		System.out.println("Your Course Id:-"+student.getBatch().getFaculty().getCourse().getCid());
		System.out.println("--------");
		}
	}
	else if(slist.isEmpty()) {
		System.out.println("First add Student then view Student");
	}
}
}
