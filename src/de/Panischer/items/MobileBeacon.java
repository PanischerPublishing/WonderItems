package de.Panischer.items;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class MobileBeacon
{
	public static void makeMobileBeacon(Player player, ItemStack is)
	{
		if(ConfigManager.useMobileBeacon())
		{
			if(ItemManager.isMobileBeaconItem(is))
			{
				player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 200, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 200, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 200, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 3));
				player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 3));
			}
		}
	}
}
