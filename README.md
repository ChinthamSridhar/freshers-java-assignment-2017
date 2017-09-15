               RESTAURANT PROJECT
HOST :
This section welcomes the customer	 by host
and arranges the section for the customer 		   
			   
BUSBOYS:
This section customer is served by busboys with
mineral or general water			   
			
MANAGER CLASS:
IN this section manager shows menu for the customer
and customer can choose full or a section of items	

		
ITEM CLASS:

This section gives the basic idea about the item list such as 
price of the item in the menu
name of the item
category of the item
size of the item
CONSTRUCTOR is used to initialize the items
SET AND GET methods are used to get and set various fields


MENU CLASS:

In this section items are classified  into different section such as
1.Staters
2.Deserts
3.Maincourse
4.Drinks
ArrayList is used to add different items to the menu
Every section is associated with index number
  

ORDER CLASS:

In this section ArrayList is used to 
1.get items
2.add items
3.remove items
4.get size 
5.clear order
6.ordernumber
Finally getserver method is used to assign a random server using switch case

REGISTER CLASS

In this section after placing an order
bill calculations are provided in this section
bill calcualtion includes tax(GST)
a subtotal
and final amount to be paid by the customer
checkPayment method is used to check the amount is equal to total or less than total
suitable operations are performed

RESTAURANT MAIN CLASS:

This is the main class of the entire program
each class is called  from the main class using objects
1)host class welcomes the customer
and asks for the number of memebers
enter the number of members
after entering number of members
allocates a section for customer

2)Busboys ask for type of water
enter mineral or general water
if wrongly written gives invalid input
else gives mineral water or general water

3)Manager class aks for full or sec menu to customer
customer can view full or sec menu

4)order class is used  to order
To order choose staters or deserts or mianicourse or drinks
after choosing
enter the index number-1 to order
enter O to exit
 
5)server name is printed

6)finally bill is calcualted after adding tax gives total amount
customer gives some amount
depending on the amount managers asks for more money if insufficient
or gives change is more money is given by coustomer

7)finally asks for the feedback
customer enters feedback and leaves



