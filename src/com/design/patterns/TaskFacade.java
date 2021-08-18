package com.design.patterns;

import com.system.Activity;

public class TaskFacade {
   public static void performActivity(String activityname,String taskname) {
	  
	   doActivity(ActivityFactory.getInstance(activityname),taskname);
   }
   
   public static void doActivity(Activity activity,String taskname) {
	   activity.task(taskname);
   }
}
