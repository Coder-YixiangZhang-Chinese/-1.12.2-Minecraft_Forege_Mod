package nightskychaser.weaponcraft.event;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber
public class WelcomeEventHandler
{
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerLoggedInEvent event)
    {
        EntityPlayer player = event.player;
        String sendMessageText = "Welcome to play WeaponCraft Mod, " + player.func_70005_c_() + " !";
        TextComponentString msgText = new TextComponentString(sendMessageText);
        player.func_145747_a(msgText);
    }
}