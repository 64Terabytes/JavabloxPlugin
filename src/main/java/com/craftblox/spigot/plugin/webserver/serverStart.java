package com.craftblox.spigot.plugin.webserver;

import static org.bukkit.Bukkit.getServer;
import static spark.Spark.*;

import org.bukkit.ChatColor;

public class serverStart {
    public static void main() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Javablox] serverStart Test");

        get("/hello", (req, res) -> "Hello World");
    }
}

