package org.lekkymc.Listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.item.Item;
import cn.nukkit.level.particle.DustParticle;
import cn.nukkit.math.Vector3;
import org.lekkymc.RainbowParticle;

public class EventListener implements Listener {

    private final RainbowParticle plugin;

    public EventListener(RainbowParticle plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        Item item = Item.get(plugin.getItemId(), plugin.getItemDamage());
        if (player.getInventory().contains(item)) {
            Vector3 center1 = new Vector3(player.getX(), player.getY() + 0.7, player.getZ());
            Vector3 center2 = new Vector3(player.getX(), player.getY() + 0.6, player.getZ());
            Vector3 center3 = new Vector3(player.getX(), player.getY() + 0.5, player.getZ());
            Vector3 center4 = new Vector3(player.getX(), player.getY() + 0.4, player.getZ());
            Vector3 center5 = new Vector3(player.getX(), player.getY() + 0.3, player.getZ());
            Vector3 center6 = new Vector3(player.getX(), player.getY() + 0.2, player.getZ());
            Vector3 center7 = new Vector3(player.getX(), player.getY() + 0.1, player.getZ());
            player.getLevel().addParticle(new DustParticle(center1, 255, 0, 0));
            player.getLevel().addParticle(new DustParticle(center2, 255, 110, 0));
            player.getLevel().addParticle(new DustParticle(center3, 255, 247, 0));
            player.getLevel().addParticle(new DustParticle(center4, 100, 255, 0));
            player.getLevel().addParticle(new DustParticle(center5, 0, 196, 255));
            player.getLevel().addParticle(new DustParticle(center6, 119, 0, 255));
            player.getLevel().addParticle(new DustParticle(center7, 255, 0, 247));
        }
    }
}
