package com.system2;

public class OsTaskRunner implements Job{

	@Override
	public void perform(String jobname) {
		// TODO Auto-generated method stub
		System.out.println("OS is running "+jobname);
	}

}
