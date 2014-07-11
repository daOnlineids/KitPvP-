package me.online.UltimateKitPvp;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class KitPvp extends JavaPlugin{
	public PluginDescriptionFile pdf = this.getDescription();
	public void onEnable() {
		String authors = getAuthors();
		String version = pdf.getVersion();
		String name = pdf.getName();
		Bukkit.getConsoleSender().sendMessage(color("&6" + name + " &aVersion: &6" + version + " &aMade by: &6" + authors + " &aEnabled!"));
	}
	
	public void onDisable() {
		String name = pdf.getName();
		Bukkit.getConsoleSender().sendMessage(color("&6" + name + " &cDisabled"));
	}
	public String getAuthors(){
		StringBuilder sb = new StringBuilder();
		for(String s : pdf.getAuthors()){
			if(sb.length() > 0){
				sb.append(", ");
			}
			sb.append(s);
		}
		return sb.toString().replace("[", "").replace("]", "");
	}
	public String color(String s){
		return ChatColor.translateAlternateColorCodes('&', s);
	}

}
