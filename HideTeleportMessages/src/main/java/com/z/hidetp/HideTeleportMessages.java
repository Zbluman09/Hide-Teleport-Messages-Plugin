package com.z.hidetp;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class HideTeleportMessages extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("HideTeleportMessages enabled.");
    }

    @EventHandler
    public void onChat(AsyncChatEvent event) {
        String plain = event.message().toString();

        if (plain.startsWith("Teleported ")) {
            event.setCancelled(true);
        }
    }
}
