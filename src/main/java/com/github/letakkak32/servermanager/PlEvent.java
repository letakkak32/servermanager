package com.github.letakkak32.servermanager;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlEvent implements Listener
{
    public static Main plugin;
    public static void setPlugin(Main MainPlugin){plugin = MainPlugin;}


    @EventHandler
    public void onjoin(PlayerJoinEvent event)
    {
        String playername = event.getPlayer().getName();
        event.setJoinMessage(ChatColor.YELLOW + playername + ChatColor.WHITE + "님이 " + ChatColor.GREEN + "접속" + ChatColor.WHITE + "하셨습니다.");
    }

    @EventHandler
    public void onquit(PlayerQuitEvent event)
    {
        String playername = event.getPlayer().getName();
        event.setQuitMessage(ChatColor.YELLOW + playername + ChatColor.WHITE + "님이 " + ChatColor.RED + "퇴장" + ChatColor.WHITE + "하셨습니다.");
    }
}
