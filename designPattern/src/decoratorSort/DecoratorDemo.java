package decoratorSort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DecoratorDemo {
		
	public static void main(String[] args) throws IOException {
		ArrayList<Person> personList=new ArrayList<Person>();
		
		
	
		
		File file = new File("personInfo.txt");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) {
				  String []str = st.split(",");
				  Person person=new Person(str[0], Integer.parseInt(str[1]),Integer.parseInt(str[1]),Integer.parseInt(str[1]));
				  personList.add(person);
				  
			  }
			    //System.out.println(st); 
			  
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		Decorator decorator=new Decorator(new Decorator(new Decorator(null,2),1),0);
		decorator.sort(personList);
		
		System.out.println("After Sort");
		
		for(Person person1:personList){	
			System.out.println("Name:"+person1.name+" Age:"+person1.age+" weight:"+person1.weight+" height:"+person1.height);
		}
		
		
	}
}
