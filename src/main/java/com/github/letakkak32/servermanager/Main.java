package com.github.letakkak32.servermanager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class Main extends JavaPlugin implements CommandExecutor {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage( ChatColor.GREEN + "플러그인이 활성화되었습니다.ㅋ");
    }
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage( ChatColor.RED + "플러그인이 비활성화되었습니다.ㅠ");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (label) {
            case "testing" -> sender.sendMessage("command testing complete! zzz");
            case "gm", "gamemode" -> {
                if (args.length == 1) { //세부 명령의 길이가 1 일때
                    Player player = (Player) sender;
                    switch (args[0]) {
                        case "0", "survival" -> {
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(ChatColor.AQUA + "게임 모드가 서바이벌 모드로 변경하였습니다!");
                        }
                        case "1", "creative" -> {
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(ChatColor.AQUA + "게임 모드가 크리에이티브 모드로 변경하였습니다!");
                        }
                        case "2", "adventure" -> {
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(ChatColor.AQUA + "게임 모드가 어드벤처 모드로 변경하였습니다!");
                        }
                        case "3", "spectator" -> {
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(ChatColor.AQUA + "게임 모드가 관전자 모드로 변경하였습니다!");
                        }
                        default -> player.sendMessage(ChatColor.RED + "잘못된 명령어입니다!");
                    }
                }
            }
        }
        return true;
    }
}