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
	Location loc;
	public LevelGeneratorListener(main p){
		this.plugin = p;
	}
	
	public void joinPads(Location loc){
		this.loc = loc;			
		spawnPads(0, 0);    
	

		Bukkit.broadcastMessage(ChatColor.GREEN + "Pads Spawned!");
	}
	
	public final void spawnPads(int distance, int height){
		Location loc1 = loc.getWorld().getBlockAt(loc.getBlockX() +3 - distance, loc.getBlockY() + height, loc.getBlockZ()).getLocation();
		Location loc2 = loc.getWorld().getBlockAt(loc.getBlockX() -3 + distance, loc.getBlockY() + height, loc.getBlockZ()).getLocation();
		Location loc3 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() + height, loc.getBlockZ() +3 - distance).getLocation();
		Location loc4 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() + height, loc.getBlockZ() -3+ distance).getLocation();
		
		Location loc5 = loc.getWorld().getBlockAt(loc.getBlockX() -3 + distance, loc.getBlockY() + height, loc.getBlockZ() -3 + distance).getLocation();
		Location loc6 = loc.getWorld().getBlockAt(loc.getBlockX() +3 - distance, loc.getBlockY() + height, loc.getBlockZ() - 3 + distance).getLocation();
		Location loc7 = loc.getWorld().getBlockAt(loc.getBlockX() -3 + distance, loc.getBlockY() + height, loc.getBlockZ() +3- distance).getLocation();
		Location loc8 = loc.getWorld().getBlockAt(loc.getBlockX() +3 - distance, loc.getBlockY() + height, loc.getBlockZ() +3 - distance).getLocation();
		
		this.populatePads(loc, Material.STONE);
		this.populatePads(loc1, Material.EMERALD_BLOCK);
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
