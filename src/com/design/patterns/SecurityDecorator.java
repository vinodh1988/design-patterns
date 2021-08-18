package com.design.patterns;

import com.system.Activity;

public class SecurityDecorator implements Activity{
	Activity obj;
	
	public SecurityDecorator(Activity obj) {
		this.obj = obj;
	}

	@Override
	public void task(String activity) {
		// TODO Auto-generated method stub
		if(activity.contains("Project"))
		{
			System.out.println("Log::: Security check passed");
			obj.task(activity);
		}
		else {
			System.out.println("Log:Error:: Security check failed");
		}
		
	}


	
}