package com.craftblox.spigot.plugin;

import com.craftblox.spigot.plugin.webserver.serverStart;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new serverStart();
        serverStart.main();

        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Javablox] Plugin has started");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic


        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Javablox] Plugin has stopped");
    }
}
