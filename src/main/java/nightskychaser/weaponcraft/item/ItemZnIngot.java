package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemZnIngot extends Item
{
    public ItemZnIngot()
    {
        this.setUnlocalizedName(WeaponCraft.MODID + ".znIngot");
        this.setRegistryName("zn_ingot");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
