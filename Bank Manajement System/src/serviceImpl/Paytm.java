package serviceImpl;
import service.RBI;

import java.util.Scanner;

import model.Account;
public class Paytm extends Account implements RBI {
//Account a=new Account();
double balance=0;

Scanner sc=new Scanner(System.in);
public void createAccount() {
// account Create detail
//Account no
System.out.println("Enter Account No as Mo no");
setAccNo(91+sc.nextLong());
//User name
System.out.println("Enter Your fullname");
setName(sc.next()+sc.nextLine());
//Mo no
System.out.println("Enter Mo no");
setMobNo(sc.next());
//addhar No
System.out.println("Enter Addhar No");
setAddharNo(sc.next());
//gender Male or Fimale
System.out.println("Enter Your Gender");
setGender(sc.next());
//Age
System.out.println("Enter your age");
setAge(sc.nextByte());
//balance
System.out.println("Enter money for backup account");
//double balance=0;
//
double s=(sc.nextDouble());
setBalance(s);
System.out.println("Your Account Create Succesfully");

}
public void displayAllDetails() {
	System.out.println("Account No    :-"+getAccNo());
	System.out.println("Full Name     :-"+getName());
	System.out.println("Mobile No     :-"+getMobNo());
	System.out.println("Addhar No     :-"+getAddharNo());
	System.out.println("Gender        :-"+getGender());
	System.out.println("Age           :-"+getAge());
	System.out.println("Balance       :-"+getBalance());
}
public void depositeMoney(double money) {
	//System.out.println("Enter Amount of Deposit");
	balance=getBalance()+money;
	setBalance(balance);
	System.out.println("Your Deposit Succesful");
	System.out.println("Your Account Balance:-"+getBalance());

	
}
public void withdrawal(double money) {
	//System.out.println("Enter Amount of Withdral");
	if(money<=balance) {
	balance=getBalance()-money;
	setBalance(balance);
	System.out.println("Your Withdrawal Succesful");
	System.out.println("Your Remaining Balance:-"+getBalance());
	
	}
	else if(money>balance) {
		System.out.println("Insuffisient Balance");
		System.out.println("You cant Withdrawal money");
	}
	
}
public void balanceCheck() {
	System.out.println("Your Balnce is :- "+getBalance());
	
	
}



}
