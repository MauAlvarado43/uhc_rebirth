package commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class PlayerHead implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        Player player = (Player) sender;

        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta headMeta = (SkullMeta)head.getItemMeta();
        headMeta.setOwningPlayer(Bukkit.getOfflinePlayer(player.getName()));
        head.setItemMeta(headMeta);

        Inventory inventory = player.getInventory();
        inventory.addItem(head);

        return true;

    }
}
