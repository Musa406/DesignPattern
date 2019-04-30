package decoratorSort;

import java.util.ArrayList;
import java.util.Collections;


public class Decorator {

	int choice;
	Decorator decorator;
	
	public Decorator(Decorator decorator,int choice) {
			this.decorator=decorator;
			this.choice=choice;
	}
	
	public void sort(ArrayList<Person> personList) {
			
			Person.sortChoice=choice;
			Collections.sort(personList);
			if(decorator!=null) decorator.sort(personList);
			
	}
}
