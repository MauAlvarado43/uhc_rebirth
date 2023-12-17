package recipes;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Melon {

    public static void register() {

        ItemStack glisteringMelon = new ItemStack(Material.GLISTERING_MELON_SLICE);
        ItemMeta glisteringMelonMeta = glisteringMelon.getItemMeta();

        assert glisteringMelonMeta != null;
        glisteringMelonMeta.setDisplayName(ChatColor.YELLOW + "Glistering Melon Slice");
        glisteringMelon.setItemMeta(glisteringMelonMeta);

        NamespacedKey gm = new NamespacedKey("glistering_melon", "glistering_melon");

        ShapedRecipe recipe = new ShapedRecipe(gm, glisteringMelon);
        recipe.shape("GGG", "GMG", "GGG");
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('M', Material.MELON_SLICE);

        Bukkit.addRecipe(recipe);
    }

    public static void deleteMelon() {
        ItemStack melon = new ItemStack(Material.VOID_AIR);
        NamespacedKey m = new NamespacedKey("melon", "melon");

        ShapedRecipe recipe = new ShapedRecipe(m, melon);
        recipe.shape("NNN", "NMN", "NNN");
        recipe.setIngredient('N', Material.GOLD_NUGGET);
        recipe.setIngredient('M', Material.MELON_SLICE);

        Bukkit.addRecipe(recipe);


    }

}
