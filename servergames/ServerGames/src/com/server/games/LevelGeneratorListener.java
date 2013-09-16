package com.server.games;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.Listener;

public class LevelGeneratorListener implements Listener{

	public int task;
	
	public main plugin;
	Location loc;
	public LevelGeneratorListener(main p){
		this.plugin = p;
	}
	
	public void createPads(Location location){
		this.loc = location;
		Bukkit.broadcastMessage(ChatColor.BLUE + "The Games Are About To Begin!");
		this.setPad(location, Material.STONE, 5);
	}
	
	public void setPad(Location centerLoc, Material mat, int halfpadsize){
        
		for(int x = centerLoc.getBlockX() - halfpadsize; x >= centerLoc.getBlockX() + halfpadsize; x++){
			for(int z = centerLoc.getBlockZ() - halfpadsize; z >= centerLoc.getBlockZ() + halfpadsize; z++){
				centerLoc.getWorld().getBlockAt(x, centerLoc.getBlockY(), z).setType(mat);
			}
		}
		
	}
	
	public void getPad(Location centerLoc, int halfpadsize){
        
		for(int x = centerLoc.getBlockX() - halfpadsize; x >= centerLoc.getBlockX() + halfpadsize; x++){
			for(int z = centerLoc.getBlockZ() - halfpadsize; z >= centerLoc.getBlockZ() + halfpadsize; z++){
			}
		}
		
	}
	
	public void movePad(Location centerLoc, Material mat, int halfpadsize, int height){
        
		for(int x = centerLoc.getBlockX() - halfpadsize; x >= centerLoc.getBlockX() + halfpadsize; x++){
			for(int z = centerLoc.getBlockZ() - halfpadsize; z >= centerLoc.getBlockZ() + halfpadsize; z++){
				centerLoc.getWorld().getBlockAt(x, centerLoc.getBlockY() + height, z).setType(mat);
				centerLoc.getWorld().getBlockAt(x, centerLoc.getBlockY(), z).setType(Material.AIR);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
