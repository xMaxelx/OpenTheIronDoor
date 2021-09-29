package de.max.opentheirondoor.Listeners;

import org.bukkit.block.Block;
import org.bukkit.block.data.type.Door;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class IronDoorListener implements Listener {

    @EventHandler
    public void on(PlayerInteractEvent e) {
        Block b = e.getClickedBlock();

        var world = b.getWorld().getName().equalsIgnoreCase("world_adventure");

        if (b.getState() instanceof Door door) {
            System.out.println(door.isOpen());
            door.setOpen(true);
        }
    }
}
