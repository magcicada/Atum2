package com.teammetallurgy.atum.init;

import com.teammetallurgy.atum.entity.*;
import com.teammetallurgy.atum.entity.arrow.*;
import com.teammetallurgy.atum.entity.projectile.EntitySmallBone;
import com.teammetallurgy.atum.utils.Constants;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.teammetallurgy.atum.utils.AtumRegistry.registerEntity;
import static com.teammetallurgy.atum.utils.AtumRegistry.registerMob;

@GameRegistry.ObjectHolder(value = Constants.MOD_ID)
public class AtumEntities {
    //Mobs
    public static final EntityEntry MUMMY = registerMob(EntityMummy.class, 0x515838, 0x868F6B);
    public static final EntityEntry BRIGAND = registerMob(EntityBrigand.class, 0xC2C2C2, 0x040F85);
    public static final EntityEntry NOMAD = registerMob(EntityNomad.class, 0xC2C2C2, 0x7E0C0C);
    public static final EntityEntry PHARAOH = registerMob(EntityPharaoh.class, 0xD4BC37, 0x3A4BE0);
    public static final EntityEntry FORSAKEN = registerMob(EntityForsaken.class, 0xB59C7D, 0x6F5C43);
    public static final EntityEntry WRAITH = registerMob(EntityWraith.class, 0xE7DBC8, 0xAD9467);
    public static final EntityEntry STONEGUARD = registerMob(EntityStoneguard.class, 0x918354, 0x695D37);
    public static final EntityEntry DESERT_WOLF = registerMob(EntityDesertWolf.class, 0xE7DBC8, 0xAD9467);
    public static final EntityEntry BANDIT_WARLORD = registerMob(EntityBanditWarlord.class, 0x918354, 0x695D37);
    public static final EntityEntry BARBARIAN = registerMob(EntityBarbarian.class, 0x918354, 0x695D37);
    public static final EntityEntry BONESTORM = registerMob(EntityBonestorm.class, 0xFFFFFF, 0xFFFFFF);

    //Entities
    public static final EntityEntry VELOCITY_ARROW = registerEntity(EntityArrowVelocity.class);
    public static final EntityEntry EXPLOSIVE_ARROW = registerEntity(EntityArrowExplosive.class);
    public static final EntityEntry POISON_ARROW = registerEntity(EntityArrowPoison.class);
    public static final EntityEntry FIRE_ARROW = registerEntity(EntityArrowFire.class);
    public static final EntityEntry DOUBLE_SHOT_ARROW = registerEntity(EntityArrowDoubleShot.class);
    public static final EntityEntry QUICKDRAW_ARROW = registerEntity(EntityArrowQuickdraw.class);
    public static final EntityEntry NUTS_CALL = registerEntity(EntityNutsCall.class);
    //public static final EntityEntry FISH_HOOK = registerEntity(EntityAtumFishHook.class); //TODO
    public static final EntityEntry SMALL_BONE = registerEntity(EntitySmallBone.class);
}