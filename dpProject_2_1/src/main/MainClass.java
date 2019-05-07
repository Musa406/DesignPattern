package main;
import java.util.Scanner;

import broadcastFestival.*;
import departmentCommunication.*;
import festivals.*;
import festivalsFacade.*;
import tscBooking.*;


public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		FactoryTask factorytask = new FactoryTask();
		
		while(true) {
			System.out.println("Task-->1:Connect Festivals & Media, 3: IntraDepartment Communication, \n 2:Broadcast festival activity, 4:TSC booking");
			
			String taskName =  scanner.nextLine();
			if(taskName.equals("exit"))break;
			
			Task task = factorytask.performTask(taskName);
			task.runTask();

		}
	}
}
