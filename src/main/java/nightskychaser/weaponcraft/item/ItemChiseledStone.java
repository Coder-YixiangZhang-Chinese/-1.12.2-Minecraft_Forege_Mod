package nightskychaser.weaponcraft.item;

import net.minecraft.item.Item;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemChiseledStone extends Item
{
    public ItemChiseledStone()
    {
        this.func_77655_b(WeaponCraft.MODID + ".chiseledStone");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
        this.setRegistryName("chiseled_stone");
    }
}
