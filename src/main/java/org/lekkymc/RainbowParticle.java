package org.lekkymc;

import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import org.lekkymc.Listener.EventListener;

import java.util.Arrays;
import java.util.List;

public class RainbowParticle extends PluginBase implements Listener {

    private RainbowParticle instance;

    private String prefix = "?";

    private int itemId;

    private int itemDamage;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        itemId = getConfig().getInt("itemId");
        itemDamage = getConfig().getInt("itemDamage");
        this.prefix = "§f[§cR§6a§ei§an§bB§1o§dw§f]";
        getLogger().info(getPluginInfo());
        this.registerEvents();
    }

    public RainbowParticle getInstance() {
        return instance;
    }

    public String getPrefix(){
        return prefix;
    }

    public void registerEvents(){
        this.getServer().getPluginManager().registerEvents(this, this);
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }

    public String getPluginInfo(){
        String authors = String.join(", ", getDescription().getAuthors());
        List<String> arrayList = Arrays.asList(
                getPrefix()+" ปลั๊กอินชื่อ "+getDescription().getName(),
                getPrefix()+" เวอร์ชัน "+getDescription().getVersion(),
                getPrefix()+" สร้างโดย "+authors,
                getPrefix()+" §fคำอธิบายปลั๊กอิน §eปลั๊กอินนี้ทำมาเพื่อแจกกรุณาอย่านำไปขาย ถ้าแจกต่อกรุณาให้เครดิตผู้สร้างด้วย :)"
        );
        return String.join("\n", arrayList);
    }

    public int getItemId() {
        return itemId;
    }

    public int getItemDamage() {
        return itemDamage;
    }
}
