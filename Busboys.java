import java.io.*;
import java.util.Scanner;
public class Busboys
{ 
String str1="mineral";
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("would you like to have mineral water or normal water");
String str=sc.nextLine();
if(str.equals(str1))
{
System.out.println("here is your mineral water");
}
else
{
System.out.println("here is your Normal water");
}
System.out.println("THANKYOU");
}
}

