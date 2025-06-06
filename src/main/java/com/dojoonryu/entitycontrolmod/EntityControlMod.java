package com.yourname.entitycontrolmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod(EntityControlMod.MODID)
@EventBusSubscriber(modid = EntityControlMod.MODID, bus = Bus.MOD)
public class EntityControlMod {
    public static final String MODID = "entitycontrlmod";

    public EntityControlMod() {
        // 모드 초기화
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // 클라이언트 초기화 코드
    }
}
