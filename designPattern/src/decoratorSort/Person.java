package decoratorSort;

public class Person implements Comparable<Person>{
	public String name;
	public int weight;
	public int height;
	public int age;
	int[] persons=new int[3];
	public static int sortChoice;
	
	public Person(String name, int weight, int height, int age) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
		persons[0]=weight;
		persons[1]=height;
		persons[2]=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSortFactor() {
		return sortChoice;
	}
	public void setSortFactor(int sortChoice) {
		this.sortChoice = sortChoice;
	}
	public int compareTo(Person personObj) {
		
		
		if(this.persons[sortChoice]<personObj.persons[sortChoice]) {
			
			return -1;
		}
		else {
			return 1;
		}
	}
}
