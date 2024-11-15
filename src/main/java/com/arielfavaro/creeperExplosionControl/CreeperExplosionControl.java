package com.arielfavaro.creeperExplosionControl;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class CreeperExplosionControl extends JavaPlugin implements Listener {

    private boolean preventBlockDamage;
    private boolean preventEntityDamage;

    @Override
    public void onEnable() {
        // Save the config file, if it doesn't exist
        saveDefaultConfig();

        loadConfiguration();

        getServer().getPluginManager().registerEvents(this, this);

        Bukkit.getLogger().info("CreeperExplosion Control enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("CreeperExplosionControl disabled!");
    }

    private void loadConfiguration() {
        FileConfiguration fileConfiguration = getConfig();

        preventBlockDamage = fileConfiguration.getBoolean("prevent-block-damage", true);
        preventEntityDamage = fileConfiguration.getBoolean("prevent-entity-damage", false);
    }

    @EventHandler
    public void onCreeperExplosion(EntityExplodeEvent event) {
        if (preventBlockDamage) {
            if (event.getEntity().getType() == EntityType.CREEPER) {
                event.blockList().clear();
            }
        }
    }

    @EventHandler
    public void onEntityDamageByCreeper(EntityDamageByEntityEvent event) {
        if (preventEntityDamage) {
            if (event.getDamager().getType() == EntityType.CREEPER) {
                event.setCancelled(true);
            }
        }
    }

    @Override
    public void reloadConfig() {
        super.reloadConfig();

        loadConfiguration();
    }
}
