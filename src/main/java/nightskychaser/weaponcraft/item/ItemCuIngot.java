package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemCuIngot extends Item
{
    public ItemCuIngot()
    {
        this.func_77655_b(WeaponCraft.MODID + ".cuIngot");
        this.setRegistryName("cu_ingot");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
