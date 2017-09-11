import java.util.ArrayList;
public class Menu
{
	private ArrayList<Item> staters= new ArrayList<Item>();
	private ArrayList<Item> deserts=new ArrayList<Item>();
	private ArrayList<Item> maincourse=new ArrayList<Item>();
	private ArrayList<Item> drinks=new ArrayList<Item>();
//constructor
public Menu()
{
	populateMenu();
}
//returns a specific stater
public Item getStater(int index)
{
	return staters.get(index);
}
//returns the size of the category staters
public int getStatersSize()
{
	return staters.size();
}
//returns all the staters
public String getAllStaters()
{
	String aMenu="";
	aMenu += "STATERS:\n";
	for(int i=0;i<staters.size();i++)
	{
		Item a=staters.get(i);
		aMenu +="A" + (i+1) + " " + a.toString() +"\n";
	}
	return aMenu;
}
public Item getDesert(int index)
{
	return deserts.get(index);
}
//returns the size of the category staters
public int getDesertsSize()
{
	return deserts.size();
}
public String getAllDeserts()
{
	String aMenu="";
	aMenu += "DESERTS:\n";
	for(int i=0;i<deserts.size();i++)
	{
		Item a=deserts.get(i);
		aMenu +="B" + (i+1) + " " + a.toString() +"\n";
	}
	return aMenu;
}
public Item getMainCourse(int index)
{
	return maincourse.get(index);
}
//returns the size of the category staters
public int getMainCourseSize()
{
	return maincourse.size();
}
public String getAllMainCourse()
{
	String aMenu="";
	aMenu += "MAINCOURSE:\n";
	for(int i=0;i<maincourse.size();i++)
	{
		Item a=maincourse.get(i);
		aMenu +="C" + (i+1) + " " + a.toString() +"\n";
	}
	return aMenu;
}
public Item getDrinks(int index)
{
	return drinks.get(index);
}
//returns the size of the category staters
public int getDrinksSize()
{
	return drinks.size();
}
public String getAllDrinks()
{
	String aMenu="";
	aMenu += "DRINKS:\n";
	for(int i=0;i<drinks.size();i++)
	{
		Item a=drinks.get(i);
		aMenu +="D" + (i+1) + " " + a.toString() +"\n";
	}
	return aMenu;
}
	
//methods
public void populateMenu()
{
	//staters
	
	 staters.add(new Item("chicken Walings\t\t","Staters",100));
	 staters.add(new Item("Papad Roll\t\t\t","Staters",50));
     staters.add(new Item("Mushroom Basket\t\t","Staters",200));
	 staters.add(new Item("Paneer\t\t\t","Staters",100));
	 staters.add(new Item("Prawn Arabia\t\t\t","Staters",300));
	 staters.add(new Item("Kathal Tikka\t\t\t","Staters",200));
	 staters.add(new Item("Tandori panner\t\t","Staters",100));
	 staters.add(new Item("Prawn Pakora\t\t\t","Staters",100));
	 staters.add(new Item("Chicken Kababs\t\t","Staters",250));
	 staters.add(new Item("Paneer Butter\t\t","Staters",100));
	 staters.add(new Item("Roasted Chicken\t\t","Staters",400));
	 
	//deserts 
	
	deserts.add(new Item("Badam Halwa\t\t\t","Deserts",  75));
    deserts.add(new Item("Badam Kheer\t\t\t","Deserts",  50));
	deserts.add(new Item("Beran Burfi \t\t\t","Deserts", 60));
	deserts.add(new Item("Coconut Burfi\t\t","Deserts", 70));
	deserts.add(new Item("Fruit Kheer\t\t\t","Deserts",  80));
	deserts.add(new Item("Gulab jamum\t\t\t","Deserts",  50));
	deserts.add(new Item("Rasmalai\t\t\t","Deserts",     60));
	deserts.add(new Item("Kulfi\t\t\t","Deserts",        30));
	deserts.add(new Item("Rabri\t\t\t","Deserts",        75));
	deserts.add(new Item("Gilebi\t\t\t","Deserts",       55));
	
	//main course
	maincourse.add(new Item("Chicken Biryani\t\t","MainCourse",200));
	maincourse.add(new Item("Mutton Biryani\t\t","MainCourse", 300));
	maincourse.add(new Item("Prawn Biryani\t\t","MainCourse",  400));
	maincourse.add(new Item("Fish Biryani\t\t\t","MainCourse",   200));
	maincourse.add(new Item("Egg Biryani\t\t\t","MainCourse",    100));
	maincourse.add(new Item("Veg Biryani\t\t\t","MainCourse",    100));
	maincourse.add(new Item("Plane Rice\t\t\t","MainCourse",      80));
	maincourse.add(new Item("Vegitable Rice\t\t","MainCourse", 100));
	maincourse.add(new Item(" Dal Rice\t\t\t","MainCourse",       50));
	
	// drinks
	drinks.add(new Item("Mineral Water\t\t","Drinks",20));
	drinks.add(new Item("Cock\t\t\t\t","Drinks",         30));
	drinks.add(new Item("Sprite\t\t\t","Drinks",       30));
	drinks.add(new Item("Thumps Up\t\t\t","Drinks",    30));
	drinks.add(new Item("Mirinda\t\t\t","Drinks",      30));
	drinks.add(new Item("Appy\t\t\t\t","Drinks",         40));
	drinks.add(new Item("Fruit Juice\t\t\t","Drinks",  40));
}
public String toString()
{
	String menu= "";
	menu +="RESTAURANT MENU \n"+
	".......................................................................\n";
	menu +=getAllStaters() +"\n";
	menu +=getAllDeserts() +"\n";
	menu +=getAllMainCourse() +"\n";
	menu +=getAllDrinks() +"\n";
	return menu;
}
}

	
	 
	 
	 
	 