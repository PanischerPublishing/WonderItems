package de.Panischer.items;
import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import de.Panischer.main.Main;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class InfiniteFood
{
	public static void makeInfiniteFood(PlayerItemConsumeEvent event, ItemStack is)
	{
		if(ConfigManager.useInfiniteFood())
		{
			if(ItemManager.isInfiniteFoodItem(is))
			{
				Bukkit.getScheduler().runTaskLaterAsynchronously(Main.plugin, new Runnable()
					{
						@Override
						public void run()
						{
							event.getPlayer().setFoodLevel(20);
						}
					},2L);
				event.setCancelled(true);
			}
		}
	}
}
