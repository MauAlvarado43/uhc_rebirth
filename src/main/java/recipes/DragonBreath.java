package recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class DragonBreath {

    public static void register() {

        ItemStack dragonBreath = new ItemStack(Material.DRAGON_BREATH);
        ItemMeta dragonBreathMeta = dragonBreath.getItemMeta();

        assert dragonBreathMeta != null;
        dragonBreathMeta.setDisplayName(ChatColor.DARK_PURPLE + "Dragon Breath");
        dragonBreath.setItemMeta(dragonBreathMeta);

        NamespacedKey db = new NamespacedKey("dragon_breath", "dragon_breath");

        ShapedRecipe recipe = new ShapedRecipe(db, dragonBreath);
        recipe.shape("PEP", "VBV");
        recipe.setIngredient('P', Material.BLAZE_POWDER);
        recipe.setIngredient('E', Material.ENDER_PEARL);
        recipe.setIngredient('B', Material.GLASS_BOTTLE);
        recipe.setIngredient('V', Material.VOID_AIR);

        Bukkit.addRecipe(recipe);

    }

}
