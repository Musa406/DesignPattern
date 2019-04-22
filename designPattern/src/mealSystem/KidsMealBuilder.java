package mealSystem;

public class KidsMealBuilder extends MealBuilder {

	  public void buildDrink() {

	    System.out.println("Pepsi");
	  }

	  public void buildMain() {
		  System.out.println("Burger");
	  }

	  public void buildDessert() {
		  System.out.println("Donut");

	  }
	  public void buildGift() {
			System.out.println("Car");
			
		}
	  

	  public Meal getMeal() {
		  return meal;
		  }
	
	  }