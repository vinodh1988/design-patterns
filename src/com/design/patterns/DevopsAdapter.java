package com.design.patterns;

import com.devops.DevopsComponent;
import com.factory.AbstractDevopsFactory;
import com.system.Activity;

public class DevopsAdapter implements Activity {

	DevopsComponent component;
	
	public DevopsAdapter(String task) {
       
		this.component=  AbstractDevopsFactory.getInstance(task);
	}
	@Override
	public void task(String activity) {
		// TODO Auto-generated method stub
		component.start(activity);
	}

}
