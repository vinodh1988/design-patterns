package com.perform;
import com.demo.BusinessTask;
import com.demo.Functions;

public class MainActivity {
   public static void main(String n[]) {
	/*  class Spot implements Activity{

		@Override
		public void task(String type) {
			// TODO Auto-generated method stub
			System.out.println("Doing ....."+type);
		}
		   
	   }*/
	   //BusinessTask.perform(new Spot() , tasks);
	   
		/*   BusinessTask.perform(new Activity() {

			@Override
			public void task(String type) {
				// TODO Auto-generated method stub
				System.out.println("Doing ....."+type);
			}
			 
		   }, tasks);*/
		   
	   String []tasks= {"designing","coding","testing","deploying","maintaining"};
	
	   /*BusinessTask.perform((type)->{
		   System.out.println("Doing...."+type);
	   },tasks);*/
	   
	   BusinessTask.perform(Functions::prepare, tasks);
	   BusinessTask.perform(Functions::running, tasks);
	   BusinessTask.perform(Functions::finishing, tasks);
	   
   }
}
