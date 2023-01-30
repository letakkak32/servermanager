package com.github.letakkak32.servermanager;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "Hello, servermanager is enabled!");
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "See you, servermanager is disabled...");
    }

    @EventHandler
    public void onjoin(PlayerJoinEvent event)
    {
        String playername = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.YELLOW + playername + ChatColor.WHITE + "님이 " + ChatColor.GREEN + "입장" + ChatColor.WHITE + "하셨습니다.");
    }

    @EventHandler
    public void onquit(PlayerQuitEvent event)
    {
        String playername = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.YELLOW + playername + ChatColor.WHITE + "님이 " + ChatColor.RED + "입장" + ChatColor.WHITE + "하셨습니다.");
    }
}
