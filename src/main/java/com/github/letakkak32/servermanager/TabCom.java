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

    List<String> arguments = new ArrayList<String>();
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        switch(command.getName())
        {
            case "gm", "gamemode" -> {
                if(args.length == 1)
                {
                    arguments.add("0");
                    arguments.add("1");
                    arguments.add("2");
                    arguments.add("3");
                } else if (args.length >= 3) {
                    return Arrays.asList("");
                }
            }
        }
        List<String> result = new ArrayList<String>();
        if(args.length == 1) {
            for(String a : arguments) {
                if(a.toLowerCase().startsWith(args[0].toLowerCase())) {
                    result.add(a);
                }
            }
            return result;
        }
        return arguments;
    }
}
