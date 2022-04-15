package ch.fantasticgame28.jes.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

import java.util.Random;

public class RedstoneSword extends SwordItem {
    public final Tier tier;
    public final int attackDamageModifier;

    public RedstoneSword(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
        this.tier = pTier;
        this.attackDamageModifier = pAttackDamageModifier;
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pAttacker.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3));
        pTarget.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2));
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }

    @Override
    public float getDamage() {

        return tier.getAttackDamageBonus() + this.attackDamageModifier * new Random().nextInt(0, 3);
    }
}
