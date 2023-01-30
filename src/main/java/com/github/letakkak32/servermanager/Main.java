package com.github.letakkak32.servermanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor, Listener
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Hello, servermanager is enabled!");
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("now").setExecutor(new PlCommand());
        PlEvent.setPlugin(this);
        PlEvent event = new PlEvent();
        getServer().getPluginManager().registerEvents(event, this);
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "See you, servermanager is disabled...");
    }

}
