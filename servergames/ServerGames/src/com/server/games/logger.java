package com.server.games;

import java.util.logging.Logger;

public class logger {
private static main plugin;
public static Logger log;
private static String v;

	public logger (main instance){
		plugin = instance;
		log = Logger.getLogger("Minecraft");
		v = "0.2";
	}
	public static String getVersion(){
		return v;
	}

	public static Logger getlog(){
		return log;
	}
	
	public void enabled(boolean enabled){
		if(enabled == true){
			getlog().info("[PadS]"+getVersion()+"] is now enabled!!!");
		} else {
			getlog().info("[PadS]"+getVersion()+"] is now disabled!!!");
		}
	}
	
	public static void mess(String string,String level){
		if(level.equals("low")){
		getlog().info("[PadS]"+getVersion()+"] "+string);		
		}else
			if(level.equals("med")){			
			getlog().warning("[PadS]"+getVersion()+"] "+string);
		    }else
		    	if(level.equals("high")){
		    		getlog().severe("[PadS]"+getVersion()+"] "+string);
		    	}
			
		  
	}
	
	public boolean checkBoolean(String string) throws Exception{			
		return  plugin.getConfig().getBoolean(string);
		}
	
	public static int checkint(String string){
		return plugin.getConfig().getInt(string);
	}
	public static String checkString(String string){
		return plugin.getConfig().getString(string);
	}
	
	public void setBoolean(String string,boolean bool){
		plugin.getConfig().set(string, bool);
		
	}
}
