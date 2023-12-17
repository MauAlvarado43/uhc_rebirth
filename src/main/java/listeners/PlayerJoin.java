package listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.GOLD + "[UHC]: " + ChatColor.GREEN + p.getDisplayName() + " se ha unido al torneo!");
    }

}
