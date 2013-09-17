package com.server.games;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
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
		spawnPads(0, 0);
		regMap();
		Bukkit.broadcastMessage(ChatColor.BLUE + "The Games Are About To Begin!");
	}
	
	public final void spawnPads(int distance, int height){
		Location loc1 = loc.getWorld().getBlockAt(loc.getBlockX() +10 - distance, loc.getBlockY() + height, loc.getBlockZ()).getLocation();
		Location loc2 = loc.getWorld().getBlockAt(loc.getBlockX() -10 + distance, loc.getBlockY() + height, loc.getBlockZ()).getLocation();
		Location loc3 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() + height, loc.getBlockZ() +10 - distance).getLocation();
		Location loc4 = loc.getWorld().getBlockAt(loc.getBlockX(), loc.getBlockY() + height, loc.getBlockZ() -10 + distance).getLocation();
		
		Location loc5 = loc.getWorld().getBlockAt(loc.getBlockX() -10 + distance, loc.getBlockY() + height, loc.getBlockZ() -10 + distance).getLocation();
		Location loc6 = loc.getWorld().getBlockAt(loc.getBlockX() +10 - distance, loc.getBlockY() + height, loc.getBlockZ() -10 + distance).getLocation();
		Location loc7 = loc.getWorld().getBlockAt(loc.getBlockX() -10 + distance, loc.getBlockY() + height, loc.getBlockZ() +10 - distance).getLocation();
		Location loc8 = loc.getWorld().getBlockAt(loc.getBlockX() +10 - distance, loc.getBlockY() + height, loc.getBlockZ() +10 - distance).getLocation();
		
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
	
	
	public void regMap(){
        Block block = loc.getBlock();      
		loc.getWorld().getBlockAt(block.getX()+15,block.getY(),block.getZ()+15).getLocation();
	}
	public void populatePads(Location loc, Material mat){

        Block block = loc.getBlock();      
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()).setType(mat);        
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+5,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+4,block.getY(),block.getZ()-4).setType(mat);
        
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+3,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+2,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()+1,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-1,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-2,block.getY(),block.getZ()-4).setType(mat);
        //-----------------------------------
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-3,block.getY(),block.getZ()-4).setType(mat);
        
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX()-4,block.getY(),block.getZ()-4).setType(mat);

        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()+5).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()+4).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()+3).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()+2).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()+1).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()-1).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()-2).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()-3).setType(mat);
        loc.getWorld().getBlockAt(block.getX(),block.getY(),block.getZ()-4).setType(mat);
       	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
