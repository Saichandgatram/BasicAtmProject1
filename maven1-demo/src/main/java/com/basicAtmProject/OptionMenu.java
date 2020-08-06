package com.basicAtmProject;

import java.io.IOException;
import java.util.*;

public class OptionMenu extends Account{

	Scanner menuInput = new Scanner(System.in);

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getlogin() throws IOException
	{
		int notDone = 1;
		do
		{
			try
			{
				data.put(123456, 1234);
				data.put(456789, 4567);
				System.out.println("Welcome");
				System.out.println("Enter Your Customer ID : ");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter Your Pin : ");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("\n" + "Invalid input" + "\n");
				notDone = 0;
			}
			for(Map.Entry<Integer, Integer> mapElement : data.entrySet())
			{
				if(mapElement.getKey()== getCustomerNumber() && mapElement.getValue().intValue() == getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("Wrong Credentials. Please Try Again");
		}while(notDone == 1);
	}

	public void getAccountType()
	{
		System.out.println("Select the Account you want to Access : ");
		System.out.println("Enter 1 - Current Account");
		System.out.println("Enter 2 - Savings Account");
		System.out.println("Enter 3 - For Exit");
		System.out.println("Enter Your Choice : ");

		int choice = menuInput.nextInt();
		switch(choice)
		{
		case 1:
			getCurrent();
			break;
		case 2:
			getSavings();
		case 3:
			System.out.println("Thank you for Using ATM, Bye.");
			break;
		default:
			System.out.println("\n" + "Invalid choice. Try Again" + "\n");
			getAccountType();

		}
	}

	public void getCurrent()
	{
		System.out.println("Current Account : ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice : ");
		int choice = menuInput.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Current Balance : " + Double.toString(getCurrentBalance()));
			getAccountType();
			break;
		case 2:
			getCurrentWithdrawlInput();
			getAccountType();
			break;
		case 3:
			getCurrentDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thanking for Visiting. Bye.");
			break;
		default:
			getCurrent();
		}
	}

	public void getSavings()
	{
		System.out.println("Savings Account : ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice : ");
		int choice = menuInput.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Savings Balance : " + Double.toString(getSavingsBalance()));
			getAccountType();
			break;
		case 2:
			getSavingsWithdrawlInput();
			getAccountType();
			break;
		case 3:
			getSavingsDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thanking for Visiting. Bye.");
			break;
		default:
			getSavings();
		}
	}
}
