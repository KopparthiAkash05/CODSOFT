import java.util.*;
class bankaccount
{
public double balance;
public bankaccount(double initialbalance)
{
this.balance=initialbalance;
}
public void deposit(double amount)
{
if(amount>0)
{
balance=balance+amount;
System.out.println("Deposit is successful: "+amount);
}
else
{
System.out.println("Deposit amount must be greater than zero.");
}
}
public void withdraw(double amount)
{
if(amount>0 && amount<=balance)
{
balance=balance-amount;
System.out.println("Successfully withdrawn: "+amount);
}
else if(amount>balance)
{
System.out.println("Insufficient balance! Your balance is "+balance);
}
else
{
System.out.println("Withdrawal amount must be greater than zero.");
}
}
public void checkbalance()
{
System.out.println("Current balance is "+balance);
}
}
class ATM
{
public bankaccount account;
public ATM(bankaccount account)
{
this.account=account;
}
public void start()
{
Scanner s=new Scanner(System.in);
int ch;
do
{
System.out.println("\n***ATM Machine***");
System.out.println("1.check balance");
System.out.println("2.deposit");
System.out.println("3.withdraw");
System.out.println("4.exit");
System.out.println("Enter the choice: ");
ch=s.nextInt();
switch(ch)
{
case 1:
   account.checkbalance();
   break;
case 2:
   System.out.print("Enter deposit amount: ");
   double depositamount=s.nextDouble();
   account.deposit(depositamount);
   break;
case 3:
   System.out.print("Enter withdrawal amount: ");
   double withdrawamount=s.nextDouble();
   account.withdraw(withdrawamount);
   break;
case 4:
   System.out.println("Thank you for using ATM Machine");
   break;
default:
   System.out.println("Invalid choice!");
}
}while(ch!=4);
}
}
public class ATMMachine
{
public static void main(String args[])
{
bankaccount ua=new bankaccount(5000.0);
ATM obj=new ATM(ua);
obj.start();
}
}