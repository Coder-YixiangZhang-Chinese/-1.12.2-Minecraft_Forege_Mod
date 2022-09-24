package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemNiIngot extends Item
{
    public ItemNiIngot()
    {
        this.func_77655_b(WeaponCraft.MODID + ".niIngot");
        this.setRegistryName("ni_ingot");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
