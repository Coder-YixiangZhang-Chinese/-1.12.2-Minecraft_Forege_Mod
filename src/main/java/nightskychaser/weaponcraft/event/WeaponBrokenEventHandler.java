package nightskychaser.weaponcraft.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nightskychaser.weaponcraft.item.ItemRegistryHandler;

import java.util.Random;

import static net.minecraft.init.SoundEvents.ENTITY_ITEM_BREAK;

@EventBusSubscriber
public class WeaponBrokenEventHandler
{
    private static Item[] ancientWeapons = {ItemRegistryHandler.ITEM_STONE_KNIFE};
    //private Item[] gunWeapons = {};
    //private Item[] futureWeapons = {};
    private static int ancientWeaponsSize = ancientWeapons.length;
    //private int gunWeaponsSize = gunWeapons.length;
    //private int futureWeaponsSize = futureWeapons.length;

    @SubscribeEvent
    public static void onPlayerUseThisModWeapons(AttackEntityEvent event)
    {
        EntityPlayer player = event.getEntityPlayer();
        checkWeapons(player);
    }

    private static void checkWeapons(EntityPlayer player)
    {
        Item mainHandWeapon = player.func_184614_ca().func_77973_b();
        for(int index = 0 ; index < ancientWeaponsSize ; ++index)
        {
            //check ancient weapons
            //0.015 String Broke
            if(mainHandWeapon.equals(ancientWeapons[index]) && getRandomNumber()<=15)
            {
                destroyPlayerWeapon(player);
                playBrokenSound(player);
            }
        }
    }
    private static void destroyPlayerWeapon(EntityPlayer player) {player.func_184611_a(EnumHand.MAIN_HAND, new ItemStack(Items.field_190931_a));}

    private static void playBrokenSound(Entity player){player.func_184185_a(field_187635_cQ, 1.0F, 1.0F);}

    private static int getRandomNumber(){return new Random().nextInt(1000) + 1; }

}
