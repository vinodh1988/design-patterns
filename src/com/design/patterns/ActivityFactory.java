package com.design.patterns;


import com.system.Activity;
import com.system.Building;
import com.system.Debugging;
import com.system.Testing;
import com.system2.DbTaskRunner;
import com.system2.NetworkTaskRunner;
import com.system2.OsTaskRunner;

public class ActivityFactory {
	private final static Testing testing=new Testing();
	private final static Debugging debugging=new Debugging();
	private final static Building building=new Building();
	private final static OsTaskRunner ostask=new OsTaskRunner();
	private final static NetworkTaskRunner networktask=new NetworkTaskRunner();
	private final static DbTaskRunner dbtask=new DbTaskRunner();
	
     public static Activity getInstance(String type) {
    	 switch(type) {
    	   case "test":
    		    return new SecurityDecorator(testing);
    	   case "debug":
    		    return  new SecurityDecorator(debugging);
    	   case "build":
    		    return new SecurityDecorator(building);
    	   case "network":
    		     return new ActivityAdapter(networktask);
    	   case "os":
  		     return new ActivityAdapter(ostask);
    	   case "db":
  		     return new ActivityAdapter(dbtask);
    	   case "azure": case "azurerepos": case "github": case "jenkins": case "bitbucket":
 		      return new DevopsAdapter(type);
    	   default:
    	    	return null;
    	 }		    
     }
}
