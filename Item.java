import java.io.*;
import java.text.NumberFormat;
public class Item
{
//fields
private String name;
private String category;
private double price;
private String size;
NumberFormat numForm=NumberFormat.getCurrencyInstance();
//constructors
public Item(String name,String category,double price)
{
	this.name=name;
	this.category=category;
	this.price=price;
}
public Item(String name,String category,String size,double price)
{
	this.name=name;
	this.category=category;
	this.size=size;
	this.price=price;
}
public double getprice()
{
	return price;
}
public void setprice(double price)
{
	this.price=price;
}
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.name=name;
}
public String getcategory()
{
	return category;
}
public void setcategory(String category)
{
this.category=category;
}
//to string
public String toString()
{
	if(size!=null)
	{
	return "("+size+")"+name+"\t"+numForm.format(price);
	}
	else
	{
		return name+"\t"+numForm.format(price);
}	
}
}		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	