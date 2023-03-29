package com.github.letakkak32.servermanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class Main extends JavaPlugin implements CommandExecutor
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

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args)
    {
        switch(label)
        {
            case "testing":
            {
                sender.sendMessage("command testing complete! zzz");
                break;
            }
        }
        return true;
    }
}