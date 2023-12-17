package recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class HyperGoldenApple {

    public static void register() {

        ItemStack hyperGolden = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta hyperGoldenMeta = hyperGolden.getItemMeta();

        assert hyperGoldenMeta != null;
        hyperGoldenMeta.setDisplayName(ChatColor.RED + "Hyper Golden Apple");
        hyperGoldenMeta.setLocalizedName("hyper_golden_apple");
        hyperGolden.setItemMeta(hyperGoldenMeta);

        NamespacedKey hga = new NamespacedKey("hyper_golden_apple", "hyper_golden_apple");

        ShapedRecipe recipe = new ShapedRecipe(hga, hyperGolden);
        recipe.shape("GGG", "GAG", "GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('A', Material.GOLDEN_APPLE);

        Bukkit.addRecipe(recipe);

    }

    public static ItemMeta getMeta() {

        ItemStack hyperGolden = new ItemStack(Material.GOLDEN_APPLE);
        ItemMeta hyperGoldenMeta = hyperGolden.getItemMeta();

        assert hyperGoldenMeta != null;
        hyperGoldenMeta.setDisplayName(ChatColor.RED + "Hyper Golden Apple");
        hyperGoldenMeta.setLocalizedName("hyper_golden_apple");
        hyperGolden.setItemMeta(hyperGoldenMeta);

        return hyperGoldenMeta;

    }

}
