package com.system2;

public class NetworkTaskRunner implements Job{

	@Override
	public void perform(String jobname) {
		// TODO Auto-generated method stub
		System.out.println(jobname+"  is running on network");
	}

}
