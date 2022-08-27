package nightskychaser.weaponcraft.event;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber
public class EventHandler
{
    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerLoggedInEvent event)
    {
        EntityPlayer player = event.player;
        String sendMessageText = "Welcome to play WeaponCraft Mod, " + player.getName() + " !";
        TextComponentString msgText = new TextComponentString(sendMessageText);
        player.sendMessage(msgText);
    }
}

//this event test the number of each dimension
//Main World-->0
//Hell-------->-1
//End--------->1
/*
@SubscribeEvent
public static void onPlayerChangeDimension(PlayerChangedDimensionEvent event)
{
    EntityPlayer player = event.player;
    final int fromDimension = event.fromDim;
    final int toDimension = event.toDim;
    if(player != null)
    {
        String sendMessageText = "Form " + fromDimension + " to " + toDimension;
        TextComponentString msgText = new TextComponentString(sendMessageText);
        player.sendMessage(msgText);
    }
}
*/