package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemNiIngot extends Item
{
    public ItemNiIngot()
    {
        this.setUnlocalizedName(WeaponCraft.MODID + ".niIngot");
        this.setRegistryName("ni_ingot");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
