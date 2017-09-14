import java.io.*;
import java.util.Scanner;
public class Restaurant extends Menu
{
public static void main(String[] args)
{
//hosts welcomes the customer and allots sections
Host a=new Host();
a.gethost();
System.out.println();
//bus boy serves the water
Busboys b=new Busboys();
b.display();
System.out.println();
//manager shows the menu card to customer
Manager mgr=new Manager();
mgr.display();
Menu menu=new Menu();
//place a order
Scanner sc=new Scanner(System.in);
Order order=new Order();
int l=0;
	while(true)
	{
		System.out.println("To order enter the (S)tarters or (D)eserts or (M)aincourse or D(R)inks or D(O)ne");
		String itemID=sc.next().toUpperCase();
		char itemsec=itemID.charAt(0);
		if(itemsec=='S')
		{
			System.out.println(getAllStaters());
			System.out.println("please enter id of the item");
			Item myItem=menu.getStater(sc.nextInt());
			order.addItem(myItem);
			System.out.println(order.getItem(l++));
		}
		else if(itemsec=='D')
		{
			System.out.println(getAllDeserts());
			Item myItem=menu.getDesert(sc.nextInt());
			order.addItem(myItem);
			System.out.println(order.getItem(l++));
		}
		else if(itemsec=='M')
		{
			System.out.println(getAllMainCourse());
			Item myItem=menu.getMainCourse(sc.nextInt());
			order.addItem(myItem);
			System.out.println(order.getItem(l++));
		}
		else if(itemsec=='R')
		{
			System.out.println(getAllDrinks());
			Item myItem=menu.getDrinks(sc.nextInt());
			order.addItem(myItem);
			System.out.println(order.getItem(l++));
		}
		else if(itemsec=='O')
		{
			break;
		}
		System.out.println("Enter 'O' to exit or");
	}
	Register reg=new Register(order);
	reg.calcSubtotal();
	reg.calcGst();
	System.out.println("amount");
	System.out.println(reg.getSubtotal());
		System.out.println("Gst");
	System.out.println(reg.getGST());
		System.out.println("Total");
	System.out.println(reg.calcTotal());
	System.out.println("Enter the amount");
	double payment=sc.nextDouble();
	System.out.println(reg.checkPayment(payment));
	reg.clearPayments();
	reg.toString();
}
}

