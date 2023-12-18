package com.vch.uhc_rebirth;

import commands.HealthReset;
import listeners.Death;
import listeners.Food;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import recipes.DragonBreath;
import recipes.HyperGoldenApple;
import recipes.Melon;
import listeners.PlayerJoin;
import recipes.PlayerApple;


public final class UHC_rebirth extends JavaPlugin {

    @Override
    public void onEnable() {

        //Listeners
        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
        Bukkit.getPluginManager().registerEvents(new Death(), this);
        Bukkit.getPluginManager().registerEvents(new Food(this), this);

        //Item Recipes
        HyperGoldenApple.register();
        Melon.register();
        Melon.deleteMelon();
        PlayerApple.register();
        DragonBreath.register();

        //Commands
        getCommand("reset-health").setExecutor(new HealthReset());

    }

    @Override
    public void onDisable() {

        Bukkit.clearRecipes();
    }

    public static UHC_rebirth getInstance(){
        return getPlugin(UHC_rebirth.class);
    }
}
