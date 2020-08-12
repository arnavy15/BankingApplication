package com.arnav.banking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BankingApplication
{
    Scanner kb = new Scanner(System.in);
    ArrayList<HashMap<String, String>> members = null;
    HashMap<String, String> member = null;

    public void startBankingApplication()
    {
        System.out.println("Welcome to my Banking Application");

        BankingData bankingData = new BankingData();
        members = bankingData.getData();

        login();
    }

    public void login()
    {
        do
        {
            System.out.println("\nPlease Enter Username: ");
            String enteredUsername = kb.next();
            String username = "";
            System.out.println("Please Enter Password: ");
            String enteredPassword = kb.next();
            String password = "";

            for (int i = 0; i < members.size(); i++)
            {
                member = members.get(i);
                username = member.get("Username");
                password = member.get("Password");
                String name = member.get("Name");

                if(enteredUsername.equals(username) && enteredPassword.equals(password))
                {
                    BankingGreeting bankingGreeting = new BankingGreeting();
                    System.out.println(bankingGreeting.greeting() + " " + name + ", you have been successfully logged in");
                    activities();
                    break;
                }
            }
            if(!enteredUsername.equals(username) || !enteredPassword.equals(password))
            {
                System.out.println("\nTry again");
            }
        } while(true);
    }

    public void activities()
    {
        int activity = 0;
        do
        {
            do
            {
                System.out.println("\nPlease Enter Action");
                System.out.println("1 = Check Balance");
                System.out.println("2 = Money Transfer");
                System.out.println("3 = Exit");
                activity = kb.nextInt();
                if(1 > activity || activity > 3)
                {
                    System.out.println("\nTry Again");
                }
            } while (1 > activity || activity > 3);

            if(activity == 1)
            {
                String money = member.get("Money");
                System.out.println("\nYou have $" + money);
            }
            else if(activity == 2)
            {
                System.out.println("\nEnter Transferee Name");
                String transfereeName = kb.nextLine();
                transfereeName = kb.nextLine();
                String name = "";
                for(int i = 0; i < members.size(); i++)
                {
                    HashMap<String, String> transfereeMember = members.get(i);
                    name = transfereeMember.get("Name");
                    if(transfereeName.equals(name))
                    {
                        System.out.println("\nTransferee Found");
                        System.out.println("\nEnter Transfer Amount");
                        int transferAmount = kb.nextInt();

                        String moneyString = transfereeMember.get("Money");
                        int money = Integer.parseInt(moneyString);
                        money = money+transferAmount;
                        moneyString = String.valueOf(money);
                        transfereeMember.replace("Money", moneyString);

                        String moneyString2 = member.get("Money");
                        int money2 = Integer.parseInt(moneyString2);
                        money2 = money2-transferAmount;
                        moneyString2 = String.valueOf(money2);
                        member.replace("Money", moneyString2);

                        System.out.println("\nTransfer Successful");
                        break;
                    }
                }
                if(!name.equals(transfereeName))
                {
                    System.out.println("\nTransferee not found");
                }
            }
            else if(activity == 3)
            {
                System.out.println("\nBYE");
                break;
            }
        } while(true);
    }
}
