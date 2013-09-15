package com.server.games;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LevelGeneratorCommands implements CommandExecutor{
	
	public main plugin;
	public LevelGeneratorCommands(main p){
		this.plugin = p;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(sender instanceof Player == false){
			System.out.println("This Command Must Be Used As A Player!");
		}else{
			if(commandLabel.equalsIgnoreCase("Hex")){
				Player player = (Player) sender;
				if(args.length == 0){
					if(player.isOp()){
						this.sendHexAdminHelpMsg(player);
					}else{
						this.sendHexHelpMsg(player);
					}
				}else if(args.length == 1){
					if(args[0].equalsIgnoreCase("Join")){
						player.sendMessage(ChatColor.GOLD + "You Have Join The Hex MiniGame!");
						plugin.joined.add(player.getName());
					}else if(args[0].equalsIgnoreCase("Ready")){
						player.sendMessage(ChatColor.GOLD + "You Are Now Ready, The Game Will Begin Shortly!");
					}else if(args[0].equalsIgnoreCase("Start")){
						if(player.isOp()){
							
						}else{
							player.sendMessage(ChatColor.DARK_RED + "You Dont Have The Needed Permissions");
						}
					}else if(args[0].equalsIgnoreCase("Create")){
						if(player.isOp()){
							
						}else{
							player.sendMessage(ChatColor.DARK_RED + "You Dont Have The Needed Permissions");
						}
					}else if(args[0].equalsIgnoreCase("Kick")){
						if(player.isOp()){
							player.sendMessage(ChatColor.RED + "/Hex Kick <Player>");
						}else{
							player.sendMessage(ChatColor.DARK_RED + "You Dont Have The Needed Permissions");
						}
					}
				}else if(args.length == 2){
					if(args[0].equalsIgnoreCase("Kick")){
						if(Bukkit.getServer().getPlayer(args[1]) !=null){
							Player target = Bukkit.getServer().getPlayer(args[1]);
							plugin.joined.remove(target.getName());
						}
					}
				}
			}
		}
		
		return false;
	}
	
	
	public void sendHexAdminHelpMsg(Player player){
		player.sendMessage(ChatColor.GOLD + "-=-=-=-=-=-= " + ChatColor.RED + "Hex MiniGames - Admin" + ChatColor.GOLD + " =-=-=-=-=-=-");
		player.sendMessage(ChatColor.BLUE + "/Hex Start " + ChatColor.WHITE + "- Force The Game To Start!");
		player.sendMessage(ChatColor.BLUE + "/Hex Create " + ChatColor.WHITE + "- Create A New Map At Your Current Location!");
		player.sendMessage(ChatColor.BLUE + "/Hex Kick <Player> " + ChatColor.WHITE + "- Kick A Player From The Game!");
	}
	
	public void sendHexHelpMsg(Player player){
		player.sendMessage(ChatColor.GOLD + "-=-=-=-=-=-= " + ChatColor.RED + "Hex MiniGames" + ChatColor.GOLD + " =-=-=-=-=-=-");
		player.sendMessage(ChatColor.BLUE + "/Hex Join " + ChatColor.WHITE + "- Join The Hex MiniGame!");
		player.sendMessage(ChatColor.BLUE + "/Hex Ready " + ChatColor.WHITE + "- Ready Up To Start The Game!");
	}

}
