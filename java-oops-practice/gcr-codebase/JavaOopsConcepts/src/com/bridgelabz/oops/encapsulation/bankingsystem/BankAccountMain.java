package com.bridgelabz.oops.encapsulation.bankingsystem;

	import java.util.ArrayList;
	import java.util.List;

	public class BankAccountMain {

	    public static void main(String[] args) {

	        List<BankAccount> accounts = new ArrayList<>();

	        accounts.add(new SavingsAccount("SA101", "Alice", 8000));
	        accounts.add(new CurrentAccount("CA202", "Bob", 15000));

	        BankService.processAccounts(accounts);
	    }
	}
