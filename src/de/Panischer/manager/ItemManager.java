package de.Panischer.manager;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
public class ItemManager
{
	public static boolean isMagicBridgeItem(ItemStack is)
	{
		if(is.getType().equals(Material.BEDROCK) && is.containsEnchantment(Enchantment.SOUL_SPEED))
		{
		return true;
		}
		return false;
	}
	public static boolean isExplosionBowItem(ItemStack is)
	{
		if(is.getType().equals(Material.BOW) && is.containsEnchantment(Enchantment.CHANNELING))
		{
		return true;
		}
		return false;
	}
	public static boolean isMobileBeaconItem(ItemStack is)
	{
		if(is.getType().equals(Material.BEACON) && is.containsEnchantment(Enchantment.ARROW_INFINITE))
		{
		return true;
		}
		return false;
	}
	public static boolean isMagicBeehiveItem(ItemStack is)
	{
		if(is.getType().equals(Material.BEEHIVE) && is.containsEnchantment(Enchantment.SILK_TOUCH))
		{
		return true;
		}
		return false;
	}
	public static boolean isSmeltingPickaxeItem(ItemStack is)
	{
		if(is.getType().equals(Material.NETHERITE_PICKAXE) && is.containsEnchantment(Enchantment.FIRE_ASPECT))
		{
		return true;
		}
		return false;
	}
	public static boolean isMegaPickaxeItem(ItemStack is)
	{
		if(is.getType().equals(Material.NETHERITE_PICKAXE) && is.containsEnchantment(Enchantment.MULTISHOT))
		{
		return true;
		}
		return false;
	}
	public static boolean isLavaWalkerItem(ItemStack is)
	{
		if(is.getType().equals(Material.MAGMA_BLOCK) && is.containsEnchantment(Enchantment.FROST_WALKER))
		{
		return true;
		}
		return false;
	}
	public static boolean isPeaceOmenItem(ItemStack is)
	{
		if(is.getType().equals(Material.IRON_BARS) && is.containsEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL))
		{
		return true;
		}
		return false;
	}
}
