package nightskychaser.weaponcraft.block;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public class BlockRegistryHandler
{
    public static final BlockCuOre BLOCK_CU_ORE = new BlockCuOre();
    public static final BlockSnOre BLOCK_SN_ORE = new BlockSnOre();
    public static final BlockNiOre BLOCK_NI_ORE = new BlockNiOre();
    public static final BlockZnOre BLOCK_ZN_ORE = new BlockZnOre();

    @SubscribeEvent
    public static void onRegistry(Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.register(BLOCK_CU_ORE);
        registry.register(BLOCK_NI_ORE);
        registry.register(BLOCK_SN_ORE);
        registry.register(BLOCK_ZN_ORE);
    }
}
