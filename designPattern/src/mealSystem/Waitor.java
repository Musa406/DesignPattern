package mealSystem;

//Director class

public class Waitor {

		public Meal createMeal(MealBuilder customerTypebuilder) {
	
				customerTypebuilder.buildDrink();
		
				customerTypebuilder.buildMain();
		
				customerTypebuilder.buildDessert();
				
				customerTypebuilder.buildGift();
		
				return customerTypebuilder.getMeal();
	
		}
}