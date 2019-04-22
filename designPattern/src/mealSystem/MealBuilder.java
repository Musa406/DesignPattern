package mealSystem;

public abstract class MealBuilder {

	  Meal meal = new Meal();

	  public abstract void buildDrink();

	  public abstract void buildMain();

	  public abstract void buildDessert();
	  
	  public abstract void buildGift();
	  
	  public abstract Meal getMeal();

	}