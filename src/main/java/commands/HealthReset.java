package commands;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class HealthReset implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {

            Player player = (Player) sender;
            player.setMaxHealth(20.0D);

        } else if (!(sender instanceof Player))  {

            sender.sendMessage("Only players can use this command");

        }
        return true;
    }

}
