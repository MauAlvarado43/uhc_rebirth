package listeners;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class Death implements Listener {
    @EventHandler
    public static void onDeath(EntityDeathEvent e) {
            if (e.getEntityType() == EntityType.GHAST) {
                ItemStack gold_ingot = new ItemStack(Material.GOLD_INGOT);
                e.getDrops().clear();
                e.getDrops().add(gold_ingot);
            }
    }

}
