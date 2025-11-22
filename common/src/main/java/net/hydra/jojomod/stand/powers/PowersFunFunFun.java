package net.hydra.jojomod.stand.powers;

import com.google.common.collect.Lists;
import net.hydra.jojomod.entity.ModEntities;
import net.hydra.jojomod.entity.stand.FunFunFunEntity;
import net.hydra.jojomod.entity.stand.StandEntity;
import net.hydra.jojomod.entity.stand.WalkingHeartEntity;
import net.hydra.jojomod.event.powers.StandPowers;
import net.hydra.jojomod.stand.powers.presets.NewDashPreset;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;

import java.util.Arrays;
import java.util.List;

public class PowersFunFunFun extends NewDashPreset {
    public PowersFunFunFun(LivingEntity self) {
        super(self);
    }
    public StandEntity getNewStandEntity(){
        return ModEntities.FUN_FUN_FUN.create(this.getSelf().level());
    }
    @Override
    public StandPowers generateStandPowers(LivingEntity entity){
        return new PowersFunFunFun(entity);
    }


    @Override
    public boolean isSecondaryStand(){
        return true;
    }
    @Override
    public List<Byte> getSkinList() {
        List<Byte> $$1 = Lists.newArrayList();
        $$1.add(FunFunFunEntity.MANGA_SKIN);
        return $$1;
    }
    @Override
    public Component getSkinName(byte skinId) {
        return getSkinNameT(skinId);
    }
    public static Component getSkinNameT(byte skinId) {

        return Component.translatable("textures.roundabout.fun_fun_fun.base");
    }
    public boolean isWip() {
        return true;
    }

    public Component ifWipListDevStatus() {
        return Component.translatable("roundabout.dev_status.active").withStyle(ChatFormatting.AQUA);
    }

    public Component ifWipListDev() {
        return Component.literal("Chxzym").withStyle(ChatFormatting.YELLOW);
    }


}
