import java.io.*;
import java.util.Scanner;
public class Host
{
	public void gethost()
	{
System.out.println("WELCOME TO THE RESTAURANT");
System.out.println(" please tell the membersize");
Scanner sc=new Scanner(System.in);
int members=sc.nextInt();
if(members==1||members==2||members==3)
{
System.out.println("please go to the section A");
}
else if(members==4||members==5||members==6)
{
System.out.println("please go to the section B");
}
else
{
System.out.println("please go to section C");
}
}
}

/*
public static void main(String[] args)
{
Host a=new Host();
a.gethost();
}
}
*/
