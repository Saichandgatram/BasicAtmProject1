package com.basicAtmProject;



import java.util.*;

public class Account {

	Scanner input = new Scanner(System.in);

	private int customerNumber;
	private int pinNumber;
	private double currentBalance = 0;
	private double savingsBalance = 0;

	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int setPinNumber(int pinNumber)
	{
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getCustomerNumber()
	{
		return customerNumber;
	}
	public int getPinNumber()
	{
		return pinNumber;
	}
	public double getCurrentBalance()
	{
		return currentBalance;
	}
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
	public void calcCurrentWithdraw(double amount)
	{
		currentBalance = (currentBalance-amount);
		//return currentBalance;
	}
	public void calcSavingsWithdraw(double amount)
	{
		savingsBalance = (savingsBalance-amount);
		//return savingsBalance;
	}
	public void  calcCurrentDeposit(double amount)
	{
		currentBalance = (currentBalance+amount);
	}
	public void  calcSavingsDeposit(double amount)
	{
		savingsBalance = (savingsBalance+amount);
	}

	//Withdrawl from current Account
	public void getCurrentWithdrawlInput()
	{
		System.out.println("Current Account Balance : " + Double.toString(currentBalance));
		System.out.println("Enter the Amount you wnat to Withdraw : ");
		double amount = input.nextDouble();
		if((currentBalance-amount)>=0)
		{
			calcCurrentWithdraw(amount);
			System.out.println("Withdrawl Successful" + "Current Account Balance : " + Double.toString(currentBalance));
		}
		else
		{
			System.out.println("Insufficient Amount in your Accout to withdraw");
		}
	}

	//Withdrawl From Savings Account
	public void getSavingsWithdrawlInput()
	{
		System.out.println("Savings Account Balance : " + Double.toString(savingsBalance));
		System.out.println("Enter the Amount to withdraw : ");
		double amount = input.nextDouble();
		if((savingsBalance-amount)>=0)
		{
			calcSavingsWithdraw(amount);
			System.out.println("Withdrawl Successful" + "Savings Account Balance : " + Double.toString(savingsBalance));
		}
		else
		{
			System.out.println("Insufficient Amount in your Account to withdraw");
		}
	}

	//Deposit in Current Account
	public void getCurrentDepositInput()
	{
		System.out.println("Current Account Balance : " + Double.toString(currentBalance));
		System.out.println("Enter the amount you want to add : ");
		double amount = input.nextDouble();
		if(amount > 0)
		{
			calcCurrentDeposit(amount);
			System.out.println("New Current Balance is : " + Double.toString(currentBalance));
		}
		else
		{
			System.out.println("Amount cannot be negative");
		}
	}

	// Deposit in Savings account
	public void getSavingsDepositInput()
	{
		System.out.println("Savings Account Balance : " + Double.toString(savingsBalance));
		System.out.println("Enter the amount you want to add : ");
		double amount = input.nextDouble();
		if(amount > 0)
		{
			calcSavingsDeposit(amount);
			System.out.println("New Current Balance is : " + Double.toString(savingsBalance));
		}
		else
		{
			System.out.println("Amount cannot be negative");
		}
	}


}
