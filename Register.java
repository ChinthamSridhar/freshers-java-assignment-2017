import java.text.NumberFormat;
public class Register
{
//fields
private static final double GST= 0.18;//goods and service tax
private double subtotal;
private double total;
private NumberFormat numForm=NumberFormat.getCurrencyInstance();
Order order=new Order();


//constructors
public Register(Order order)
{
	this.order=order;
	order.incrementNo();
}
//assessors,mutators
public double getSubtotal()
{
	return subtotal;
}
public double getGST()
{
	return GST;
}

// calculations
public double calcSubtotal()
{
	for(int i=0;i<order.getSize();i++)
	{
		Item item=order.getItem(i);
		subtotal +=item.getprice();		
	}
	return subtotal;
}
public double calcGst()
{
	return subtotal*GST;
}
public double calcTotal()
{
	total=subtotal +calcGst();
	return total;
}
public void clearPayments()
{
	subtotal=0;
	total=0;
}
public String checkPayment(double payment)
{
	if(payment==total)
	{
		return "enough money provided by custumer";
	}
	else if(payment>total)
	{
		return "Here is your change sir: "+numForm.format(payment-total);
	}
	else
	{
		return "please pay"+numForm.format(total-payment)+"more";
	}
}
public String toString()
{
	String str="....................RESTAURANT.................\n"
	+ "order No:"+order.getNumber()+"\n"
	+ "server's Name:"+ order.getServer()+"\n"
	+ "........................................................\n";
	str+=order.toString();
	str += "....................................................\n"
	+ "subtotal:\t\t\t"+numForm.format(calcSubtotal())
	+ "\nGst:\t\t\t" + numForm.format(calcGst())
	+ "\nTotal:\t\t\t"+numForm.format(calcTotal());
	return str;
}
}
	
	
	
	
	
	