package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemSnIngot extends Item
{
    public ItemSnIngot()
    {
        this.setUnlocalizedName(WeaponCraft.MODID + ".snIngot");
        this.setRegistryName("sn_ingot");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
