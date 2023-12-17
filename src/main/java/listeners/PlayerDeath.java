package listeners;

import com.vch.uhc_rebirth.UHC_rebirth;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener {

    UHC_rebirth plugin;

    public PlayerDeath(UHC_rebirth plugin) {this.plugin = plugin;}

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {

        Location loc = e.getEntity().getLocation();
        Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);

    }

}
