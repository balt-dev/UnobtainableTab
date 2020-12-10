package net.unobtainabletab;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.Collection;

public class UnobtainableTab implements ModInitializer {
	public static final ItemGroup UNOB_TAB = FabricItemGroupBuilder.create(
			new Identifier("unobtainabletab", "tabname"))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(Items.COMMAND_BLOCK));
				stacks.add(new ItemStack(Items.REPEATING_COMMAND_BLOCK));
				stacks.add(new ItemStack(Items.CHAIN_COMMAND_BLOCK));
				stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
				stacks.add(new ItemStack(Items.STRUCTURE_BLOCK));
				stacks.add(new ItemStack(Items.JIGSAW));
				stacks.add(new ItemStack(Items.BARRIER));
				stacks.add(new ItemStack(Items.STRUCTURE_VOID));
				stacks.add(new ItemStack(Items.DEBUG_STICK));
				stacks.add(new ItemStack(Items.SPAWNER));
				stacks.add(new ItemStack(Items.KNOWLEDGE_BOOK));
				stacks.add(new ItemStack(Items.DRAGON_EGG));
			})
			.icon(() -> new ItemStack(Items.COMMAND_BLOCK))
			.build();
	@Override
	public void onInitialize(){}
}
