package de.Panischer.items;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class ExplosionBow
{
	public static void makeExplosion(Location location, ItemStack is)
	{
		if(ConfigManager.useExplosionBow())
		{
			if(ItemManager.isExplosionBowItem(is))
			{
				location.getWorld().createExplosion(location, 3.5f);
			}
		}
	}
}
