package de.Panischer.manager;
import org.bukkit.configuration.file.FileConfiguration;
import de.Panischer.main.Main;
public class ConfigManager
{
	public static void makeConfig()
	{
		FileConfiguration config = Main.plugin.getConfig();
		if(!config.contains("items.use-magicbridge"))
		{
			config.set("items.use-magicbridge", true);
		}
		if(!config.contains("items.use-explosionbow"))
		{
			config.set("items.use-explosionbow", true);
		}
		if(!config.contains("items.use-mobilebeacon"))
		{
			config.set("items.use-mobilebeacon", true);
		}
		if(!config.contains("items.use-magicbeehive"))
		{
			config.set("items.use-magicbeehive", true);
		}
		if(!config.contains("items.use-smeltingpickaxe"))
		{
			config.set("items.use-smeltingpickaxe", true);
		}
		if(!config.contains("items.use-megapickaxe"))
		{
			config.set("items.use-megapickaxe", true);
		}
		if(!config.contains("items.use-lavawalker"))
		{
			config.set("items.use-lavawalker", true);
		}
		if(!config.contains("items.use-peaceomen"))
		{
			config.set("items.use-peaceomen", true);
		}
		if(!config.contains("items.use-infinitefood"))
		{
			config.set("items.use-infinitefood", true);
		}
		if(!config.contains("items.make-unbreakable"))
		{
			config.set("items.make-unbreakable", true);
		}
		if(!config.contains("permission.itemgive"))
		{
			config.set("permission.itemgive", "wonderitems.itemgive");
		}
		if(!config.contains("language.no-permission"))
		{
			config.set("language.no-permission", "§7Sorry, but you don't have §cpermission §7to do that.");
		}
		Main.plugin.saveConfig();
	}
	public static boolean useMagicBridge()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-magicbridge");
	}
	public static boolean useExplosionBow()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-explosionbow");
	}
	public static boolean useMobileBeacon()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-mobilebeacon");
	}
	public static boolean useMagicBeehive()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-magicbeehive");
	}
	public static boolean useSmeltingPickaxe()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-smeltingpickaxe");
	}
	public static boolean useMegaPickaxe()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-megapickaxe");
	}
	public static boolean useLavaWalker()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-lavawalker");
	}
	public static boolean usePeaceOmen()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-peaceomen");
	}
	public static boolean useInfiniteFood()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.use-infinitefood");
	}
	public static boolean makeUnbreakable()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getBoolean("items.make-unbreakable");
	}
	public static String getPermission()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getString("permission.itemgive");
	}
	public static String getNoPermissionMessage()
	{
		FileConfiguration config = Main.plugin.getConfig();
		return config.getString("language.no-permission");
	}
}
