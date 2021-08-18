package com.system2;

public class DbTaskRunner implements Job{

	@Override
	public void perform(String jobname) {
		// TODO Auto-generated method stub
		System.out.println("DB is running "+jobname);
	}

}
