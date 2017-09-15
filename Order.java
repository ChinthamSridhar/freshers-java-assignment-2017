//import java.io.*;
import java.util.ArrayList;
import java.util.Random;
public class Order
{
	//fields
	private static int orderNo=0;
private ArrayList< Item > order=new ArrayList<Item>();

//constructors
public Order()
{
}

//get item from menu
public Item getItem(int index)
{
	return order.get(index);
}
//add item to the menu
public void addItem(Item item) 
{
	order.add(item);
}

//methods
//to remove an item from order
public void removeItem(Item item)
{
	order.remove(item);
}
//no of items,ordersize
public int getSize()
{
	return order.size();
}
//clears the order
public void clearOrder()
{
	order.clear();
}

//get order number
public int getNumber()
{
	return orderNo;
}
//increment orderNO
public void incrementNo()
{
	orderNo++;
}
//gets a random server
public String getServer()
{
	Random rand=new Random();
	int num =rand.nextInt(10)+1;
	switch(num)
	{
		case 1:
		return "Sachin";
		case 2:
		return "Dhoni";
		case 3:
		return "Raina";
		case 4:
		return "Virat";
		case 5:
		return "Sewag";
		case 6:
		return  "Dilshan";
		case 7:
		return  "Ricky";
		case 8:
		return  "Ram";
		case 9:
		return  "Harsha";
		case 10:
		return  "Tarun";
		default:
		return " sorry no server available";
	}
}
public String toString()
{
	String str="";
	for(int i=0;i<order.size();i++)
	{
	
		str +=order.get(i).toString()+"\n\n";
	}
	return str;
}
}

