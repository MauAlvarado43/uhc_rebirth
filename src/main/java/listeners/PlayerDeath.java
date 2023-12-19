package listeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.DoubleChestInventory;
import org.bukkit.block.Skull;

public class PlayerDeath implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {

        //Death Chest
        Player player = e.getEntity();
        Location loc = player.getLocation();
        Block left = loc.getBlock();
        Block right = loc.clone().add(0,0,1).getBlock();

        left.setType(Material.CHEST);
        right.setType(Material.CHEST);

        BlockData leftData = left.getBlockData();
        ((Directional) leftData).setFacing(BlockFace.EAST);
        left.setBlockData(leftData);

        BlockData rightData = right.getBlockData();
        ((Directional) rightData).setFacing(BlockFace.EAST);
        right.setBlockData(rightData);

        org.bukkit.block.data.type.Chest chestLeftData = (org.bukkit.block.data.type.Chest) leftData;
        chestLeftData.setType(org.bukkit.block.data.type.Chest.Type.LEFT);
        left.setBlockData(chestLeftData);

        org.bukkit.block.data.type.Chest chestRightData = (org.bukkit.block.data.type.Chest) rightData;
        chestRightData.setType(org.bukkit.block.data.type.Chest.Type.RIGHT);
        right.setBlockData(chestRightData);

        Chest leftChest = (Chest)left.getState();
        Chest rightChest = (Chest)right.getState();

        leftChest.setCustomName(ChatColor.LIGHT_PURPLE + e.getEntity().getName() + ChatColor.GOLD + "'s Loot");
        rightChest.setCustomName(ChatColor.LIGHT_PURPLE + e.getEntity().getName() + ChatColor.GOLD + "'s Loot");
        leftChest.update();
        rightChest.update();

        DoubleChestInventory inventory = (DoubleChestInventory) leftChest.getInventory();
        inventory.setStorageContents(player.getInventory().getContents());
        e.getDrops().clear();

        //Player Head
        Block fence = loc.clone().add(0,0,2).getBlock();
        Block head = loc.clone().add(0,1,2).getBlock();

        fence.setType(Material.NETHER_BRICK_FENCE);
        head.setType(Material.PLAYER_HEAD);

        Skull skull = (Skull) head.getState();
        skull.setOwningPlayer(player);
        skull.update();

        //DeathMessages
//        String killer = e.getEntity().getKiller().getName();
//        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD +  "------------------------------------------");
//        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + player.getName() + " fue masacrado por " + killer);
//        Bukkit.getConsoleSender().sendMessage(ChatColor.GOLD +  "------------------------------------------");

    }

}
