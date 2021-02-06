package de.Panischer.items;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class MagicBeehive
{
	public static void makeMagicBeehive(PlayerDeathEvent event, ItemStack is)
	{
	if(ConfigManager.useMagicBeehive())
	{
		if(ItemManager.isMagicBeehiveItem(is))
		{
			event.setKeepInventory(true);
			event.setKeepLevel(true);
			event.getDrops().clear();
			event.setDroppedExp(0);
		}
	}
	}
}
