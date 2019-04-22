package flyWeight;

public class FlyWeightDemo {
	
	private static final String colors[] = {"Red","Blue","Green","White","Black"};
	
	public static void main(String[] args) {
		FactoryShape factoryShape = new FactoryShape();
		Shape shape;
		
		//using FlyWeight.....time start...............
		 long startTime = System.currentTimeMillis();
		
			for(int i=0; i<200000;i++) {
					shape = factoryShape.getShape(getRandomColor(), i);
					shape.draw(getRandomX(),getRandomY());
			}
		    long endTime = System.currentTimeMillis();
		    long duration = endTime - startTime;
			
			//......end.........................
		
		
		//without using FlyWeight........time start............
			  long startTime2 = System.currentTimeMillis();
				
				for(int i=0; i<200000;i++) {
						if(i%2==1) {
							shape = new Circle(getRandomColor());
						}
						else 
							shape = new Rectangle(getRandomColor());
						
						shape.draw(getRandomX(),getRandomY());
				}
			 long endTime2 = System.currentTimeMillis();
			 long duration2 = endTime2 - startTime2;
			
				//......end.........................
				System.out.println("\n\ntotal time needed without FlyWeight : "+duration+" ms");
				System.out.println("total time needed using FlyWeight : "+duration2+" ms");
		
		
	}
	private static String getRandomColor() {
		// TODO Auto-generated method stub	
		return colors[(int)(Math.random()*colors.length)];
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100);
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
	
}
