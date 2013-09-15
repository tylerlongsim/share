package com.server.games;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
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

			int count = 5;
			@Override
			public void run() {
				
				if(count == 5){
					spawnPads(0);
					Bukkit.broadcastMessage(ChatColor.GREEN + "Pads Spawned!");
				}else if(count == 4){
					spawnPads(1);
				}else if(count == 3){
					spawnPads(2);
				}else if(count == 2){
					
				}else if(count == 1){
					
				}else if(count == 0){
					Bukkit.getServer().getScheduler().cancelTask(task);
					Bukkit.broadcastMessage(ChatColor.GREEN + "The Game Is About To Begin!");
				}
				count --;
			}
			
		}, 20L, 20L);
	}
	
	public final void spawnPads(int distance){
		Location loc = plugin.map;
		Location loc1 = loc.getWorld().getBlockAt(loc.getBlockX() +5 - distance, loc.getBlockY(), loc.getBlockZ()).getLocation();
		Location loc2 = loc.getWorld().getBlockAt(loc.getBlockX() -5 + distance, loc.getBlockY(), loc.getBlockZ()).getLocation();
		Location loc3 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() +5 - distance).getLocation();
		Location loc4 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ() -5 + distance).getLocation();
		
		Location loc5 = loc.getWorld().getBlockAt(loc.getBlockX() -5 + distance, loc.getBlockY(), loc.getBlockZ() -5 + distance).getLocation();
		Location loc6 = loc.getWorld().getBlockAt(loc.getBlockX() +5 - distance, loc.getBlockY(), loc.getBlockZ() - 5 + distance).getLocation();
		Location loc7 = loc.getWorld().getBlockAt(loc.getBlockX() -5 + distance, loc.getBlockY(), loc.getBlockZ() +5 - distance).getLocation();
		Location loc8 = loc.getWorld().getBlockAt(loc.getBlockX() +5 - distance, loc.getBlockY(), loc.getBlockZ() +5 - distance).getLocation();
		
		this.populatePads(loc, Material.STONE);
		this.populatePads(loc1, Material.DIRT);
		this.populatePads(loc2, Material.SANDSTONE);
		this.populatePads(loc3, Material.GRASS);
		this.populatePads(loc4, Material.WOOD);
		
		this.populatePads(loc5, Material.BEDROCK);
		this.populatePads(loc6, Material.DIAMOND_BLOCK);
		this.populatePads(loc7, Material.GOLD_BLOCK);
		this.populatePads(loc8, Material.IRON_BLOCK);
	}
	
	public void populatePads(Location loc, Material mat){
        Block block = loc.getBlock();
        Location loc1 = block.getRelative(BlockFace.NORTH).getLocation();
        Location loc2 = block.getRelative(BlockFace.NORTH_EAST).getLocation();
        Location loc3 = block.getRelative(BlockFace.NORTH_WEST).getLocation();
        Location loc4 = block.getRelative(BlockFace.SOUTH).getLocation();
        Location loc5 = block.getRelative(BlockFace.SOUTH_EAST).getLocation();
        Location loc6 = block.getRelative(BlockFace.SOUTH_WEST).getLocation();
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
