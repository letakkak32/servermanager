package com.github.letakkak32.servermanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        Bukkit.getConsoleSender().sendMessage( ChatColor.AQUA + "플러그인이 활성화되었습니다.ㅋ");
    }

    @Override
    public void onDisable()
    {
        Bukkit.getConsoleSender().sendMessage( ChatColor.RED + "플러그인이 비활성화되었습니다.ㅠ");
    }
}