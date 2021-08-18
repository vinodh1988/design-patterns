package com.demo;

public class BusinessTask {
   public static void perform(Activity activity,String []n)
   {
	   int percent=100/n.length;
	   int part=percent;
	   for(String x:n) {
	       System.out.println("Business Task is being performed in the Library  "+percent+" %");
		   activity.task(x);
		   percent+=part;
	   
	   }
   }
}
