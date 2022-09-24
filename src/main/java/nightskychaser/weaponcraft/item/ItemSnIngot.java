package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemSnIngot extends Item
{
    public ItemSnIngot()
    {
        this.func_77655_b(WeaponCraft.MODID + ".snIngot");
        this.setRegistryName("sn_ingot");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
