package assignment4;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		savingsaccount account=new savingsaccount(0, 0);
		account.deposit(2000);
		
		try {
			account.withdraw(500);
			System.out.println("withdraw successfully");
			System.out.println("your remaining account balance is "+account.getBalance());
			account.withdraw(-500);
			System.out.println("withdraw successfully");
			System.out.println("your remaining account balance is "+account.getBalance());
		}catch(Illegalbanktransactionexception a){
			System.out.println(a.getMessage());
		}finally {
			try {
				account.withdraw(1000);
				System.out.println("withdraw successfully");
				System.out.println("your remaining account balance is "+account.getBalance());
			}catch(Exception a){
				System.out.println(a.getMessage());
			}
		}
	}
}
