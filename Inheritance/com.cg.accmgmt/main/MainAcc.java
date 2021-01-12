package com.cg.bankaccount.main;
import java.util.*;

import com.cg.bankaccount.serviceImpl.Account;
import com.cg.bankaccount.serviceImpl.SavingsAccount;

import Optional.Person;
public class MainAcc {
	public static void main(String[] args) {
			Account acc1=new Account();
			Account acc2= new SavingsAccount();
			Account acc3= new Account();
			Person p1=new Person();
			Person p2=new Person();
			p1.setName("Smith");
			p2.setName("Kathy");
			System.out.println("Account Holder is: "+p1.getName());
			acc1.setBalance(2000.0);
			System.out.println(p1.getName()+" Current Balance is: "+acc1.getBalance());
			acc1.deposit(2000.0);
			System.out.println(p1.getName()+" Updated Balance is: "+acc1.getBalance());
			System.out.println("Account Holder is:"+p2.getName());
			acc3.setBalance(3000.0);
			System.out.println(p2.getName()+" Current Balance is: "+acc3.getBalance());
			acc3.withdraw(2000.0);
			System.out.println(p2.getName()+" Updated Balance is: "+acc3.getBalance());
		}
			

		}