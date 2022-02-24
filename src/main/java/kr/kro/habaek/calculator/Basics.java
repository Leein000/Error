package kr.kro.habaek.calculator;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Basics implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String string, String []args) {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;

            if(args.length == 0)
            {
                p.sendMessage("안녕");
            }
            else if(args.length > 0)
            {
                if(args[0].equalsIgnoreCase("give"))
                {
                    p.giveInventory().addItem(new ItemStack((Material.STONE_AXE)));
                    p.sendMessage("아이템이 지급되었습니다.");
                }
            }
        }
        else
        {
            sender.sendMessage("콘솔로는 이 명령어를 사용하실 수 없습니다.");
        }
        return false;
    }
}
