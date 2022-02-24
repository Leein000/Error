package kr.kro.habaek.calculator;

import kr.kro.habaek.calculator.Control.ControlSwitch;
import kr.kro.habaek.calculator.OverTime.OverTimeManager;
import kr.kro.habaek.calculator.OverTime.OverTimeValues;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public void Calculator(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("calculator class started");
    }

    public void ControlSwitch(String[] args) {
        ControlSwitch control = new ControlSwitch();
        control.swtichStatement2(1);
    }

    public static void Main(String args[]) {
        OverTimeManager manager = new OverTimeManager();
        int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
        System.out.println(myAmount);
    }

    public void onEnable()
    {
        getServer().getConsoleSender().sendMessage("플러그인이 활성화 되었습니다.");
        getServer().getPluginManager().registerEvents(this, this);
    }

    public void onDisable()
    {
        getServer().getConsoleSender().sendMessage("플러그인이 비활성화 되었습니다.");
    }

    @EventHandler
    public void bk(BlockBreakEvent e)
    {
        Player p = e.getPlayer();
        Block b = e.getBlock();

        if(!p.isOp())
        {
            if(b.getType() == Material.SPONGE)
            {
                e.setCancelled(true);
                p.sendMessage(ChatColor.YELLOW + "파괴 불가능!");
            }
        }
    }

    @EventHandler
    public void bp(BlockBreakEvent e)
    {
        Player p = e.getPlayer();
        Block b = e.getBlock();

        if(!p.isOp())
    }
}
