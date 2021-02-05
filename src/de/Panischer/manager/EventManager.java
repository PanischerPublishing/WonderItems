package de.Panischer.manager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import de.Panischer.items.ExplosionBow;
import de.Panischer.items.LavaWalker;
import de.Panischer.items.MagicBeehive;
import de.Panischer.items.MagicBridge;
import de.Panischer.items.MegaPickaxe;
import de.Panischer.items.MobileBeacon;
import de.Panischer.items.PeaceOmen;
import de.Panischer.items.SmeltingPickaxe;
public class EventManager implements Listener
{
	@EventHandler
	public void onMove(PlayerMoveEvent event)
	{
		MagicBridge.makeBridge(event.getPlayer(), event.getPlayer().getInventory().getItemInMainHand());
		MobileBeacon.makeMobileBeacon(event.getPlayer(), event.getPlayer().getInventory().getItemInMainHand());
		LavaWalker.makeLavaWalk(event.getPlayer(), event.getPlayer().getInventory().getItemInMainHand());
	}
	@EventHandler
	public void onArrowHit(ProjectileHitEvent event)
	{
		if(event.getEntity().getShooter() instanceof Player)
		{
			Player player = (Player) event.getEntity().getShooter();
			if(event.getHitBlock() != null)
			{
				ExplosionBow.makeExplosion(event.getHitBlock().getLocation(), player.getInventory().getItemInMainHand());
			}else if(event.getEntity() != null)
			{
				ExplosionBow.makeExplosion(event.getHitEntity().getLocation(), player.getInventory().getItemInMainHand());
			}
		}
	}
	@EventHandler
	public void onPlayerDeath(PlayerDeathEvent event)
	{
		MagicBeehive.makeMagicBeehive(event, event.getEntity().getInventory().getItemInMainHand());
	}
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event)
	{
		SmeltingPickaxe.makeSmelting(event.getBlock(), event, event.getPlayer().getInventory().getItemInMainHand());
		MegaPickaxe.makeMegaPickaxe(event.getBlock(), event.getPlayer().getInventory().getItemInMainHand());
	}
	@EventHandler
	public void onEntityTarget(EntityTargetLivingEntityEvent event)
	{
		if(event.getTarget() instanceof Player)
		{
			PeaceOmen.makePeace(event, ((Player) event.getTarget()).getInventory().getItemInMainHand());
		}
	}
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent event)
	{
		ItemStack is = event.getItemInHand();
		if(ItemManager.isMagicBridgeItem(is) | ItemManager.isExplosionBowItem(is) | ItemManager.isMobileBeaconItem(is) | ItemManager.isMagicBeehiveItem(is) | ItemManager.isSmeltingPickaxeItem(is) | ItemManager.isMegaPickaxeItem(is) | ItemManager.isLavaWalkerItem(is) | ItemManager.isPeaceOmenItem(is))
		{
			event.setCancelled(true);
		}
	}
}
