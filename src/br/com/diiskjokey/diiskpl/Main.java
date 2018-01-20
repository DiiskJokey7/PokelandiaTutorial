package br.com.diiskjokey.diiskpl;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor, Listener {

	public static Main main;

	public void onEnable() {
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage(ChatColor.GREEN + "--------------------------------------");
		c.sendMessage(ChatColor.GREEN + "   Plugin do DiiskJokey Habilitado");
		c.sendMessage(ChatColor.GREEN + " Versao 1.0 Atualizado em 19/01/2018");
		c.sendMessage(ChatColor.GREEN + "--------------------------------------");
		RegisterCommands();
		main = this;
	}

	public void onDisable() {
		ConsoleCommandSender c = Bukkit.getConsoleSender();
		c.sendMessage(ChatColor.RED + "--------------------------------------");
		c.sendMessage(ChatColor.RED + "   Plugin do DiiskJokey Desativado");
		c.sendMessage(ChatColor.RED + " Versao 1.0 Atualizado em 19/01/2018");
		c.sendMessage(ChatColor.RED + "--------------------------------------");
	}

	public void RegisterCommands() {
		getCommand("helds").setExecutor(new Helds());
		getCommand("moveset").setExecutor(new Moveset());
	}
}
