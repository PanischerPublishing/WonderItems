package de.Panischer.items;
import java.util.List;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.inventory.ItemStack;
import de.Panischer.manager.ConfigManager;
import de.Panischer.manager.ItemManager;
public class PeaceOmen
{
	public static void makePeace(EntityTargetLivingEntityEvent event , ItemStack is)
	{
		if(ConfigManager.usePeaceOmen())
		{
			if(ItemManager.isPeaceOmenItem(is))
			{
				event.setTarget(null);
				List<Entity> entities = event.getEntity().getNearbyEntities(20, 20, 20);
				double lowestDistanceSoFar = Double.MAX_VALUE;
				Entity closestEntity = null;
				for (Entity entity : entities)
				{
				    double distance = entity.getLocation().distance(event.getEntity().getLocation());
				    if (distance < lowestDistanceSoFar &! entity.equals(event.getTarget()))
				    {
				        lowestDistanceSoFar = distance;
				        closestEntity = entity;
				    }
				}
				if (closestEntity != null)
				{
					if(closestEntity instanceof Player)
					{
						event.setTarget(null);
					}else
					{
						event.setTarget(closestEntity);
					}
				}else
				{
				    event.setTarget(null);
				}
			}
		}
	}
}
