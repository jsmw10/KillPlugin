package me.jsm.w.killplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class KillPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("kill")) ;
        {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.setHealth(0);
            } else {
                System.out.println("Only a player can do this command.");
            }
            return true;

        }

    }
}