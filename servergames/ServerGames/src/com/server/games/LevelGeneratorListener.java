package com.server.games;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.Listener;

public class LevelGeneratorListener implements Listener{

	public int task;
	
	public main plugin;
	public LevelGeneratorListener(main p){
		this.plugin = p;
	}
	
	public void joinPads(){
		task = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable(){

			@Override
			public void run() {
				int count = 5;
				
				if(count == 5){
					spawnPads();
				}else if(count == 4){
					
				}else if(count == 3){
					
				}else if(count == 2){
					
				}else if(count == 1){
					
				}else if(count == 0){
					Bukkit.getServer().getScheduler().cancelTask(task);
				}
				count --;
			}
			
		}, 20L, 20L);
	}
	
	public final void spawnPads(){
		Location loc = plugin.map;
		this.populatePads(loc, Material.STONE);
		
	}
	
	public void populatePads(Location loc, Material mat){
        Block block = loc.getBlock();
        Location loc1 = block.getRelative(BlockFace.NORTH).getLocation();
        Location loc2 = block.getRelative(BlockFace.NORTH_EAST).getLocation();
        Location loc3 = block.getRelative(BlockFace.NORTH_NORTH_WEST).getLocation();
        Location loc4 = block.getRelative(BlockFace.SOUTH).getLocation();
        Location loc5 = block.getRelative(BlockFace.SOUTH_EAST).getLocation();
        Location loc6 = block.getRelative(BlockFace.SOUTH_SOUTH_WEST).getLocation();
        Location loc7 = block.getRelative(BlockFace.EAST).getLocation();
        Location loc8 = block.getRelative(BlockFace.WEST).getLocation();
        
        loc.getBlock().setType(mat);
        loc1.getBlock().setType(mat);
        loc2.getBlock().setType(mat);
        loc3.getBlock().setType(mat);
        loc4.getBlock().setType(mat);
        loc5.getBlock().setType(mat);
        loc6.getBlock().setType(mat);
        loc7.getBlock().setType(mat);
        loc8.getBlock().setType(mat);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
