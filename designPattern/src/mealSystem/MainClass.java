package mealSystem;

import java.util.Scanner;

public class MainClass {

public static void main(String[] args) {

	 Waitor waitor = new Waitor();
	 MealBuilder builder = null;
	 
	 System.out.println("Enter 1 for KidsMeal & 2 for AdultsMeal");
	 
	 Scanner scan = new Scanner(System.in);
	 int kidsOrAdult = scan.nextInt();
	 
	 if (kidsOrAdult==1) {
	
	   builder = new KidsMealBuilder();
	
	 }
	
	 else{
	
	   builder = new AdultMealBuilder();
	
	 }

	 Meal meal = waitor.createMeal(builder);

	}

}