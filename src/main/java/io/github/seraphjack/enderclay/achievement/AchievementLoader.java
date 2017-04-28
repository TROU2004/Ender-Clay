package io.github.seraphjack.enderclay.achievement;


import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;

public class AchievementLoader {
    public static Achievement balance = new Achievement("achievement.enderclay.balance","enderclay.balance",5,-4, ItemLoader.ItemEnderClay ,null);
    public AchievementLoader(){
        balance.setSpecial().registerStat();
    }
}
