package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemCuIngot extends Item
{
    public ItemCuIngot()
    {
        this.setUnlocalizedName(WeaponCraft.MODID + ".cuIngot");
        this.setRegistryName("cu_ingot");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
