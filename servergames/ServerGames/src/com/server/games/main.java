package com.server.games;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin{
	
	public ArrayList<String> joined = new ArrayList<String>();
	public Location playerjoinloc;
	public blockLogger bl;
	private logger l;
	public void onEnable(){
		l = new logger(this);
		LevelGeneratorListener lis = new LevelGeneratorListener(this);
		
		
		this.getCommand("Hex").setExecutor(new LevelGeneratorCommands(this, lis));
		
		 getConfig().options().copyDefaults(true);        
         saveConfig();
         l.enabled(true); 
         bl = new blockLogger(this);
	}
	public void onDisable(){
		l.enabled(false);

	}

}
