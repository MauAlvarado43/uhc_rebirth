package listeners;

import com.vch.uhc_rebirth.UHC_rebirth;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class Respawn implements Listener {

    UHC_rebirth plugin;

    public Respawn(UHC_rebirth plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {

        Player player = e.getPlayer();
        Location loc = e.getRespawnLocation();

        loc.setX(0);
        loc.setY(100);
        loc.setZ(0);

        e.setRespawnLocation(loc);

        Bukkit.getScheduler().runTaskLater(plugin, () -> {
            player.chat("/gamemode spectator");
        }, 1);

    }

}
