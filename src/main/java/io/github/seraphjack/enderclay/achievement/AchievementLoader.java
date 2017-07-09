package io.github.seraphjack.enderclay.achievement;


import io.github.seraphjack.enderclay.common.ConfigLoader;
import io.github.seraphjack.enderclay.item.ItemLoader;
import net.minecraft.stats.Achievement;

public class AchievementLoader {
    public static Achievement balance;
    public AchievementLoader(){
        ConfigLoader.logger().info("Loading Achievements.");
        balance = new Achievement("achievement.enderclay.balance","enderclay.balance",-8,-6, ItemLoader.ItemEnderClay ,null);
        balance.setSpecial();
        balance.registerStat();
    }
}
