package com.perform;

import com.demo.SystemConstants;
import com.design.patterns.TaskFacade;

public class DesignPatternConsumer {
  public static void main(String[] args) {
	  TaskFacade.performActivity(SystemConstants.TEST, "Employee Accounts Project");
	  TaskFacade.performActivity(SystemConstants.TEST, "Angular Project");
	  TaskFacade.performActivity(SystemConstants.DEBUG,"Angular Project");
	  TaskFacade.performActivity(SystemConstants.BUILD,"Maven Rest API Project");
	  TaskFacade.performActivity(SystemConstants.BUILD,"Maven Soap Project");
	  TaskFacade.performActivity(SystemConstants.OS,"Disk defragmentation");
	  TaskFacade.performActivity(SystemConstants.OS,"Process killing");
	  TaskFacade.performActivity(SystemConstants.NETWORK,"Routing");
	  TaskFacade.performActivity(SystemConstants.DB,"Backup");
	  TaskFacade.performActivity(SystemConstants.GITHUB,"Create a new repository");
	  TaskFacade.performActivity(SystemConstants.JENKINS, "Create a CI/CD Pipeline");
  }
}
