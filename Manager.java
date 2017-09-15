import java.io.*;
import java.util.Scanner;
public class Manager extends Menu
{
void display()
{
	Scanner sc=new Scanner(System.in);
System.out.println("WE SERVE A VARIETY OF DISHES OF");
System.out.println("Chinese,Indian,Asian");
System.out.println();
System.out.println("Would you like to view the full menu or just a section? [FULL][SEC]");
//get the answer from the customer
String answer=sc.next();
//check the answer
while(!(answer.equalsIgnoreCase("full")||answer.equalsIgnoreCase("sec")))
{
	System.out.println("Invalid input.please enter again:");
	answer=sc.next();
}
if(answer.equalsIgnoreCase("full"))
	System.out.println(toString());//to get full menu
else
{
System.out.println("Which section? [Staters] [Deserts] [Maincourse] [Drinks]");
String sec=sc.next().toLowerCase();
//check for answer
while(!(sec.equalsIgnoreCase("staters")|| sec.equalsIgnoreCase("deserts")|| sec.equalsIgnoreCase("maincourse")))
{
	System.out.println("Invalid input.Please enter again:");
	sec=sc.next().toLowerCase();
}
if(sec.equals("staters"))
{
	System.out.println(getAllStaters());
}
else if(sec.equals("deserts"))
{
	System.out.println(getAllDeserts());
}
else if(sec.equals("maincourse"))
{
	System.out.println(getAllMainCourse());
}
else if(sec.equals("drinks"))
{
	System.out.println(getAllDrinks());
}
}
}
}