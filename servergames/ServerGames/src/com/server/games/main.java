package com.server.games;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	
	public ArrayList<String> joined = new ArrayList<String>();
	public Location playerjoinloc;

	public void onEnable(){
		LevelGeneratorListener lis = new LevelGeneratorListener(this);
		
		
		this.getCommand("Hex").setExecutor(new LevelGeneratorCommands(this, lis));
	}
	public void onDisable(){
		
	}

}
