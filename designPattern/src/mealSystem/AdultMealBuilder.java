package mealSystem;

public class AdultMealBuilder extends MealBuilder {

	  public void buildDrink(){

		  System.out.println("Fanta");

	  }

	  public void buildMain(){

		  System.out.println("PizzA");

	  }

	  public void buildDessert(){

		  System.out.println("Cheese");

	  }

	
		public void buildGift() {
			System.out.println("Byke");
			
		}
		
	  public Meal getMeal(){
		  
		  return meal;
	   }

	}