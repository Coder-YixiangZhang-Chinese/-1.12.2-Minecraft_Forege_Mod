package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemChiseledStone extends Item
{
    public ItemChiseledStone()
    {
        this.setUnlocalizedName(WeaponCraft.MODID + ".chiseledStone");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
        this.setRegistryName("chiseled_stone");
    }
}
