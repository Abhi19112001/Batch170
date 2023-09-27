package client;
import service.RBI;
import serviceImpl.Paytm;
import java.util.Scanner;
import model.Account;
public class Test {
public static void main(String[] args) {
	RBI bank=new Paytm();
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("-----Select Service---\n"
				+"1.Account Creation\n"
				+"2.Account Details\n"
				+"3.Deposit Money\n"
				+"4.Withral money\n"
				+"5.Check Balance\n"
				+"6.For Exit Service");
		
		int x=sc.nextInt();
		if(x==1) {
			System.out.println("Enter Your detail");
			bank.createAccount();
			bank.displayAllDetails();
			System.out.println("  ");
		}
		else if(x==2) {
			System.out.println("Account Detail");
			bank.displayAllDetails();
			System.out.println("  ");
		}
		else if(x==3) {
			System.out.println("Enter your money for Deposit");
			double money=sc.nextDouble();
			bank.depositeMoney(money);
			System.out.println("  ");
		}
		else if(x==4) {
			System.out.println("Enter Your money for Withdrawal");
			double money=sc.nextDouble();
			bank.withdrawal(money);
			System.out.println("   ");
			
		}
		else if(x==5){
			System.out.println("Your Account balance");
			bank.balanceCheck();
			
		}
		else if(x==6) {
			System.out.println("Service Exit");
			break;
		}
		else {
			System.out.println("worng Chioce");
		}
	}
}
}
