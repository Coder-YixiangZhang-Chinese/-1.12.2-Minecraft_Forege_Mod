package nightskychaser.weaponcraft;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nightskychaser.weaponcraft.crafting.FurnaceRecipeRegistryHandler;
import org.apache.logging.log4j.Logger;

@Mod(modid = WeaponCraft.MODID, name = WeaponCraft.MODNAME, version = WeaponCraft.VERSION)
public class WeaponCraft
{
    public static final String MODID = "weaponcraft";
    public static final String MODNAME = "Weapon Craft";
    public static final String VERSION = "Beta 2.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        //test log
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        FurnaceRecipeRegistryHandler.register();
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // It's nothing here now
    }
}
