package de.Panischer.items;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class SmeltingPickaxe
{
	public static void makeSmelting(Block block, BlockBreakEvent event, ItemStack is)
	{
	if(ConfigManager.useSmeltingPickaxe())
	{
		if(ItemManager.isSmeltingPickaxeItem(is))
		{
			switch (block.getType())
			{
			case IRON_ORE:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.IRON_INGOT, 1));
				break;
			}
			case GOLD_ORE:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GOLD_INGOT, 1));
				break;
			}
			case SAND:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.GLASS, 1));
				break;
			}
			case COBBLESTONE:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.STONE, 1));
				break;
			}
			case KELP:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.DRIED_KELP, 1));
				break;
			}
			case ANCIENT_DEBRIS:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.NETHERITE_SCRAP, 1));
				break;
			}
			case CLAY_BALL:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.BRICK, 1));
				break;
			}
			case WET_SPONGE:
			{
				event.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.SPONGE, 1));
				break;
			}
			default:
				break;
			}
		}
	}
	}
}
