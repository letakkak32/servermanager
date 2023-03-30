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
        Bukkit.getConsoleSender().sendMessage( ChatColor.AQUA + "플러그인이 활성화되었습니다.ㅋ");
    }
    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage( ChatColor.RED + "플러그인이 비활성화되었습니다.ㅠ");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch (label) {
            case "testing" -> {
                sender.sendMessage("command testing complete! zzz");
            }
            case "gm", "gamemode" -> {
                if (args.length == 1) { //세부 명령의 길이가 1 일때
                    Player player = (Player) sender;
                    switch (args[0]) {
                        case "0", "survival" -> {
                            player.setGameMode(GameMode.SURVIVAL);
                        }
                        case "1", "creative" -> {
                            player.setGameMode(GameMode.CREATIVE);
                        }
                        case "2", "adventure" -> {
                            player.setGameMode(GameMode.ADVENTURE);
                        }
                        case "3", "spectator" -> {
                            player.setGameMode(GameMode.SPECTATOR);
                        } //명령어를 실행했을 때 텍스트 나오는 거 만들기
                    }
                }
            }
        }
        return true;
    }
}