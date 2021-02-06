package de.Panischer.commands;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import de.Panischer.manager.ConfigManager;
public class ItemGiveCommand implements CommandExecutor
{
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			if(player.hasPermission(ConfigManager.getPermission()))
			{
				giveMagicBridge(player);
				giveExplosionBow(player);
				giveMobileBeacon(player);
				giveMagicBeehive(player);
				giveSmeltingPickaxe(player);
				giveMegaPickaxe(player);
				giveLavaWalker(player);
				givePeaceOmen(player);
				giveInfiniteFood(player);
			}else
			{
				player.sendMessage(ConfigManager.getNoPermissionMessage());
			}
		}
		return false;
	}
	public static void giveMagicBridge(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Creates a");
		lore.add("§5magic §7trail of");
		lore.add("§7bedrock underneath you.");
		lore.add("");
		ItemStack is = new ItemStack(Material.BEDROCK);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lMagic§8-§5§lBridge");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.SOUL_SPEED, 1);
		player.getInventory().addItem(is);
	}
	public static void giveExplosionBow(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Turns your");
		lore.add("§5arrows §7into");
		lore.add("§7explosive weapons.");
		lore.add("");
		ItemStack is = new ItemStack(Material.BOW);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lExplosion§8-§5§lBow");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.CHANNELING, 1);
		player.getInventory().addItem(is);
	}
	public static void giveMobileBeacon(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Lets you use");
		lore.add("§7all §5beacon effects");
		lore.add("§7on the go.");
		lore.add("");
		ItemStack is = new ItemStack(Material.BEACON);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lMobile§8-§5§lBeacon");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		player.getInventory().addItem(is);
	}
	public static void giveMagicBeehive(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7At death, you");
		lore.add("§7keep your §5inventory");
		lore.add("§7and your §5experience§7.");
		lore.add("");
		ItemStack is = new ItemStack(Material.BEEHIVE);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lMagic§8-§5§lBeehive");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.SILK_TOUCH, 1);
		player.getInventory().addItem(is);
	}
	public static void giveSmeltingPickaxe(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Smelts broken");
		lore.add("§5blocks §7for");
		lore.add("§7you.");
		ItemStack is = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lSmelting§8-§5§lPickaxe");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
		player.getInventory().addItem(is);
	}
	public static void giveMegaPickaxe(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Breakes all");
		lore.add("§7blocks in a §53x3");
		lore.add("§7area.");
		ItemStack is = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lMega§8-§5§lPickaxe");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.MULTISHOT, 1);
		player.getInventory().addItem(is);
	}
	public static void giveLavaWalker(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Creates a");
		lore.add("§5magic §7obsidian-trail");
		lore.add("§7when you go over lava.");
		lore.add("");
		ItemStack is = new ItemStack(Material.MAGMA_BLOCK);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lLava§8-§5§lWalker");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.FROST_WALKER, 1);
		player.getInventory().addItem(is);
	}
	public static void givePeaceOmen(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Makes you every");
		lore.add("§5monster §7a friend so that it");
		lore.add("§7kills everything exept you.");
		lore.add("");
		ItemStack is = new ItemStack(Material.IRON_BARS);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lPeace§8-§5§lOmen");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
		player.getInventory().addItem(is);
	}
	public static void giveInfiniteFood(Player player)
	{
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add("§7Fills your");
		lore.add("§5whole hungerlevel §7to");
		lore.add("§7the maximum!");
		lore.add("");
		ItemStack is = new ItemStack(Material.COOKED_CHICKEN);
		ItemMeta im = is.getItemMeta();
		im.setLore(lore);
		if(ConfigManager.makeUnbreakable())
		{
			im.setUnbreakable(true);
		}
		im.setDisplayName("§5§lInfinite§8-§5§lChicken");
		is.setItemMeta(im);
		is.addUnsafeEnchantment(Enchantment.ARROW_INFINITE, 1);
		player.getInventory().addItem(is);
	}
}
