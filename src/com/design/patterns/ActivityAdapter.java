package com.design.patterns;

import com.system.Activity;
import com.system2.Job;

public class ActivityAdapter implements Activity {
	
	private Job job;
	
	
	public ActivityAdapter(Job job) {
	
		this.job = job;
	}

	@Override
	public void task(String activity) {
		// TODO Auto-generated method stub
		job.perform(activity);
	}

}
