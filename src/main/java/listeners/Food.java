package listeners;

import com.vch.uhc_rebirth.UHC_rebirth;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Food implements Listener {

    UHC_rebirth plugin;

    public Food(UHC_rebirth plugin) {
       this.plugin = plugin;
    }

    @EventHandler
    public void onEating(PlayerItemConsumeEvent e) {

        e.setCancelled(true);
        e.getPlayer().getInventory().getItemInHand().setAmount(e.getItem().getAmount() - 1);

        Player player = e.getPlayer();
        ItemStack food = e.getItem();

        //HyperGoldenApple Effect
        if (food.getItemMeta().getLocalizedName().equals("hyper_golden_apple")) {

            if (!(e.getPlayer().getMaxHealth() + 4.0D > 60.0D)) {
                e.getPlayer().setMaxHealth(e.getPlayer().getMaxHealth() + 4.0D);

            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 130, 1));

        }

        //PlayerApple Effect
        Bukkit.getScheduler().runTaskLater(plugin, () -> {

            if (food.getItemMeta().getLocalizedName().equals("player_apple")) {

                if (!(e.getPlayer().getMaxHealth() + 4.0D > 60.0D)) {
                    e.getPlayer().setMaxHealth(e.getPlayer().getMaxHealth() + 4.0D);
                }

                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 2400, 2));
                player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,100, 3));

            }
            }, 1);

    }

}
