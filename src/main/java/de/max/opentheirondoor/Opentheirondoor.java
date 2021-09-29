package de.max.opentheirondoor;

import de.max.opentheirondoor.Listeners.IronDoorListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Opentheirondoor extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new IronDoorListener(), this);

    }

}
