package ch.fantasticgame28.jes.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {

    public static final ForgeTier REDSTONE = new ForgeTier(
            1,
            340,
            3.0f,
            1.5f,
            30,
            BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.REDSTONE_BLOCK)
    );

}
