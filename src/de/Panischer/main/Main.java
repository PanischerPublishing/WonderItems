package de.Panischer.main;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import de.Panischer.commands.ItemGiveCommand;
import de.Panischer.items.MagicBridge;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.EventManager;
public class Main extends JavaPlugin
{
	public static Main plugin;
	public void onEnable()
	{
		plugin = this;
		ConfigManager.makeConfig();
		getCommand("givewonderitems").setExecutor(new ItemGiveCommand());
		getServer().getPluginManager().registerEvents(new EventManager(),this);
	}
	public void onDisable()
	{
		MagicBridge.blocks.forEach(b ->
		{
			b.setType(Material.AIR);
		});
	}
}
