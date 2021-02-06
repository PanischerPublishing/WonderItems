package de.Panischer.items;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class MegaPickaxe
{
	public static void makeMegaPickaxe(Block block, ItemStack is)
	{
		if(ConfigManager.useMegaPickaxe())
		{
			if(ItemManager.isMegaPickaxeItem(is))
			{
				int radius = 1;
				for(int x = block.getX() - radius; x <= block.getX() + radius; x++)
				{
		            for(int y = block.getY() - radius; y <= block.getY() + radius; y++)
		            {
		                for(int z = block.getZ() - radius; z <= block.getZ() + radius; z++)
		                {
		                	if(!block.getType().equals(Material.BEDROCK))
		                	{
		                		block.getWorld().getBlockAt(x, y, z).breakNaturally();
		                	}
		                }
		            }
				}
			}
		}
	}
}
