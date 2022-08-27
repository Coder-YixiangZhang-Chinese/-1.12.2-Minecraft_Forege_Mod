package nightskychaser.weaponcraft.crafting;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nightskychaser.weaponcraft.block.BlockRegistryHandler;
import nightskychaser.weaponcraft.item.ItemRegistryHandler;

public class FurnaceRecipeRegistryHandler
{
    public static void register()
    {
        GameRegistry.addSmelting(BlockRegistryHandler.BLOCK_CU_ORE,
                new ItemStack(ItemRegistryHandler.ITEM_CU_INGOT), 0.7F);

        GameRegistry.addSmelting(BlockRegistryHandler.BLOCK_NI_ORE,
                new ItemStack(ItemRegistryHandler.ITEM_NI_INGOT), 0.7F);

        GameRegistry.addSmelting(BlockRegistryHandler.BLOCK_SN_ORE,
                new ItemStack(ItemRegistryHandler.ITEM_SN_INGOT), 0.7F);

        GameRegistry.addSmelting(BlockRegistryHandler.BLOCK_ZN_ORE,
                new ItemStack(ItemRegistryHandler.ITEM_ZN_INGOT), 0.7F);

    }
}
