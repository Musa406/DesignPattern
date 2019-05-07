package main;

import broadcastFestival.ObserverDemo;
import departmentCommunication.MediatorDemo;
import festivalsFacade.FacadeDemo;
import tscBooking.SingletonDemo;

public class FactoryTask {

	Task task;
	public Task performTask(String taskName) {
		
		if(taskName.equals("1")) {
			task = new FacadeDemo();
		}
		else if(taskName.equals("2")) {
			task = new ObserverDemo();
		}
		else if(taskName.equals("3")) {
			task = new MediatorDemo();
		}
		else if(taskName.equals("4")) {
			task = new SingletonDemo();
		}
		else System.out.println("invalid task");
		
		return task;
	}

}
