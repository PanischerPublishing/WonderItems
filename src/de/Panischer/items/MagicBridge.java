package de.Panischer.items;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import de.Panischer.main.Main;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class MagicBridge implements Listener
{
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static void makeBridge(Player player, ItemStack is)
	{
		if(ConfigManager.useMagicBridge())
		{
			if(ItemManager.isMagicBridgeItem(is))
			{
				Block block = player.getLocation().subtract(0, 1, 0).getBlock();
				if(block.getType().equals(Material.AIR))
				{
					block.setType(Material.BEDROCK);
					blocks.add(block);
					Bukkit.getScheduler().runTaskLater(Main.plugin, new Runnable()
					{
						@Override
						public void run()
						{
							block.setType(Material.AIR);
							blocks.remove(block);
						}
					}, 5*20L);
				}
			}
		}
	}
}
