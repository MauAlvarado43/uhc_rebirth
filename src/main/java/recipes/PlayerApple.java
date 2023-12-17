package recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;


public class PlayerApple {

    public static void register() {
        ItemStack playerApple = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta playerAppleMeta = playerApple.getItemMeta();

        //TODO change display name to show player's name
        assert playerAppleMeta != null;
        playerAppleMeta.setDisplayName(ChatColor.DARK_PURPLE + "Head apple");
        playerAppleMeta.setLocalizedName("player_apple");
        playerAppleMeta.addEnchant(Enchantment.MENDING, 1, false);
        playerAppleMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        playerApple.setItemMeta(playerAppleMeta);

        NamespacedKey pa = new NamespacedKey("player_apple", "player_apple");

        ShapedRecipe recipe = new ShapedRecipe(pa, playerApple);
        recipe.shape("GGG", "DHD", "GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('D', Material.DIAMOND);
        recipe.setIngredient('H', Material.PLAYER_HEAD);

        Bukkit.addRecipe(recipe);
    }

}
