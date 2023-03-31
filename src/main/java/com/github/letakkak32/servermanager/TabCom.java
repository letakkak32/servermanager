package com.github.letakkak32.servermanager;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TabCom implements TabCompleter {

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch(command.getName()) {
            case "gm", "gamemode" -> {
                if(args.length == 1) {
                    List<String> returns1 = new ArrayList<>();
                    returns1.add("0");
                    returns1.add("1");
                    returns1.add("2");
                    returns1.add("3");
                    List<String> returns2 = new ArrayList<>();
                    for(String returns : returns1) {
                        if(returns.toLowerCase().startsWith(args[0].toLowerCase())) {
                            returns2.add(returns);
                        }
                    }
                    return returns2;
                }
                else {
                    return Arrays.asList("");
                }
            }
        }
        return null;
    }
}