package nightskychaser.weaponcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import nightskychaser.weaponcraft.block.BlockRegistryHandler;

@EventBusSubscriber
public class ItemRegistryHandler {
    //ToolMaterials
    public static final Item.ToolMaterial CHISELED_STONE_KNIFE_TOOL_MATERIAL = EnumHelper.addToolMaterial("CHISELED_STONE", -1, 30, 2.0F, 1.2F, 5);

    //Items
    public static final ItemChiseledStone ITEM_CHISELED_STONE = new ItemChiseledStone();
    public static final ItemCuIngot ITEM_CU_INGOT = new ItemCuIngot();
    public static final ItemZnIngot ITEM_ZN_INGOT = new ItemZnIngot();
    public static final ItemSnIngot ITEM_SN_INGOT = new ItemSnIngot();
    public static final ItemNiIngot ITEM_NI_INGOT = new ItemNiIngot();
    public static final ItemStoneKnife ITEM_STONE_KNIFE = new ItemStoneKnife();

    //ItemBlocks
    public static final ItemBlock ITEM_BLOCK_CU_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_CU_ORE));
    public static final ItemBlock ITEM_BLOCK_ZN_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_ZN_ORE));
    public static final ItemBlock ITEM_BLOCK_SN_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_SN_ORE));
    public static final ItemBlock ITEM_BLOCK_NI_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_NI_ORE));

    private static ItemBlock withRegistryName(ItemBlock item) {
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }

    @SubscribeEvent
    public static void onItemRegistry(Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        //Items
        registry.register(ITEM_CHISELED_STONE);
        registry.register(ITEM_CU_INGOT);
        registry.register(ITEM_ZN_INGOT);
        registry.register(ITEM_NI_INGOT);
        registry.register(ITEM_SN_INGOT);
        registry.register(ITEM_STONE_KNIFE);

        //ItemBlocks
        registry.register(ITEM_BLOCK_CU_ORE);
        registry.register(ITEM_BLOCK_NI_ORE);
        registry.register(ITEM_BLOCK_SN_ORE);
        registry.register(ITEM_BLOCK_ZN_ORE);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel(Item item) {
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, modelResourceLocation);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        //ItemBlocks
        registerModel(ITEM_BLOCK_CU_ORE);
        registerModel(ITEM_BLOCK_NI_ORE);
        registerModel(ITEM_BLOCK_SN_ORE);
        registerModel(ITEM_BLOCK_ZN_ORE);

        //Items
        registerModel(ITEM_CHISELED_STONE);
        registerModel(ITEM_CU_INGOT);
        registerModel(ITEM_NI_INGOT);
        registerModel(ITEM_SN_INGOT);
        registerModel(ITEM_ZN_INGOT);
        registerModel(ITEM_STONE_KNIFE);
    }
}