package com.teammetallurgy.atum.items.artifacts;

import com.teammetallurgy.atum.items.ItemTexturedArmor;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@Mod.EventBusSubscriber(value = Side.CLIENT)
public class ItemMaatsBalance extends ItemTexturedArmor {

    public ItemMaatsBalance(ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot) {
        super(material, renderIndex, slot);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(@Nonnull ItemStack stack) {
        return true;
    }

    @SubscribeEvent
    public void onLivingAttack(LivingHurtEvent event) {
        if (event.getEntityLiving().getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == this) {
            event.setAmount((event.getAmount() + 1.0F) / 1.5F - 1.0F);
        }

        if (event.getSource() instanceof EntityDamageSource) {
            EntityDamageSource source = (EntityDamageSource) event.getSource();
            if (source.getTrueSource() != null && source.getTrueSource() instanceof EntityLiving) {
                EntityLiving entity = (EntityLiving) source.getTrueSource();
                if (entity.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == this) {
                    event.setAmount((event.getAmount() + 1.0F) / 1.5F - 1.0F);
                }
            }
        }

    }

    @Override
    @Nonnull
    public EnumRarity getRarity(@Nonnull ItemStack stack) {
        return EnumRarity.RARE;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(@Nonnull ItemStack stack, @Nullable World world, List<String> tooltip, ITooltipFlag tooltipType) {
        if (Keyboard.isKeyDown(42)) {
            tooltip.add(TextFormatting.DARK_PURPLE + I18n.format(this.getUnlocalizedName() + ".line1"));
            tooltip.add(TextFormatting.DARK_PURPLE + I18n.format(this.getUnlocalizedName() + ".line2"));
        } else {
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".line3") + " " + TextFormatting.DARK_GRAY + "[SHIFT]");
        }
    }

    @Override
    public boolean getIsRepairable(@Nonnull ItemStack toRepair, @Nonnull ItemStack repair) {
        return repair.getItem() == Items.DIAMOND;
    }
}