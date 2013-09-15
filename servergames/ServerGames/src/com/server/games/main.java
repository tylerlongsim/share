package com.server.games;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
	
	public ArrayList<String> joined = new ArrayList<String>();
	public Location playerjoinloc;
	public LevelGeneratorListener lgl;
	
	public void onEnable(){
		LevelGeneratorListener lis = new LevelGeneratorListener(this);
		
		PluginManager pm = this.getServer().getPluginManager();
		lgl = new LevelGeneratorListener(this);
		
		this.getCommand("Hex").setExecutor(new LevelGeneratorCommands(this, lis));
	}
	public void onDisable(){
		
	}

}
