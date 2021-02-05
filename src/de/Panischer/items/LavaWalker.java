package de.Panischer.items;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class LavaWalker
{
	public static void makeLavaWalk(Player player, ItemStack is)
	{
		if(ConfigManager.useLavaWalker())
		{
			if(ItemManager.isLavaWalkerItem(is))
			{
				Block block = player.getLocation().subtract(0, 1, 0).getBlock();
				if(block.getType().equals(Material.LAVA))
				{
					block.setType(Material.OBSIDIAN);
				}
			}
		}
	}
}
