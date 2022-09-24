package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemZnIngot extends Item
{
    public ItemZnIngot()
    {
        this.func_77655_b(WeaponCraft.MODID + ".znIngot");
        this.setRegistryName("zn_ingot");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
