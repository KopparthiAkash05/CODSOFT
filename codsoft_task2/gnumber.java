import java.util.*;
class gnumber
{
public static void main(String args[])
{
try
{
int g;
int a;
Scanner s=new Scanner(System.in);
Random rand=new Random();
System.out.println("*****Welcome to guessing game*****");
String p="yes";
while(p.equals("yes"))
{
a=0;
int ans=rand.nextInt(100)+1;
System.out.println("Guess the number in between 1 to 100");
while(true)
{
System.out.print("Guess a number:");
g=s.nextInt();
s.nextLine();
if(g<ans)
{
System.out.println("Too high.....");//Try a higher number
a++;
}
else if(g>ans)
{
System.out.println("Too low.....");//Try a lower number
a++;
}
else
{
System.out.println("Congratulations you won after "+a+" attempts");
break;
}
if(a==7)
{
System.out.println("Maximum attempts are executed.So that better luck next time!");
break;
}
}
System.out.print("Do you want to play again?(Yes/No):");
p=s.nextLine().toLowerCase();
}
}
catch(Exception e)
{
System.out.print("Please enter a valid number");
e.printStackTrace();//used to print detailed information about the exception
}
}
}