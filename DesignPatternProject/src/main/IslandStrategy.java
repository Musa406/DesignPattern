package main;
import factory_1.*;
import singleTon_2.*;
import observer_3.*;
import mediator_4.*;

import java.util.Scanner;

import command_5.*;

public class IslandStrategy {

	Island island;
	public void goIsland(Island island1) {
		
		this.island = island;
		System.out.println(island1.getIslandName());
		
		Function f1 = new Function_1Demo();
		Function f2 = new Function_2Demo();
		Function f3 = new Function_3Demo();
		Function f4 = new Function_4Demo();
		Function f5 = new Function_5Demo();
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("press 1 for function1, 2 for Function2, 3 for Function3, 4 for Function4, 5 for Function5");
		
		while(true) {
			String input = scan.nextLine();
			
			if(input.equals("1"))
				f1.runFunction();
			else if(input.equals("2"))
				f2.runFunction();

			else if(input.equals("3"))
				f3.runFunction();

			else if(input.equals("4"))
				f4.runFunction();

			else if(input.equals("5"))
				f5.runFunction();

		}
	}

}
