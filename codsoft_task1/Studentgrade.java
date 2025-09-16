import java.util.*;
class Studentgrade
{
public static void main(String args[])
{
int tm=0;
int m;
int n;
char g;
System.out.println("Enter the number of subjects:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Enter the marks of subject "+i+":");
m=s.nextInt();
while(m<0 || m>100)
{
System.out.println("Invalid input");
m=s.nextInt();
}
tm=tm+m;
}
float ap=tm/n;
if(ap>90)
   g='A';
else if(ap>=75 && ap<90)
   g='B';
else if(ap>=50 && ap<75)
   g='C';
else if(ap>=40 && ap<50)
   g='D';
else if(ap>=20 && ap<40)
   g='E';
else
   g='F';

System.out.println("Student Report Card");
System.out.println("Total marks of a student:"+tm);
System.out.printf("Average Percentage of a student:%.2f\n",ap);
System.out.print("Grade of a student:"+g);
}
}