package nightskychaser.weaponcraft.item;

import net.minecraft.item.ItemSword;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class ItemStoneKnife extends ItemSword
{
    public ItemStoneKnife()
    {
        super(ItemRegistryHandler.CHISELED_STONE_KNIFE_TOOL_MATERIAL);
        this.func_77655_b(WeaponCraft.MODID + ".stoneKnife");
        this.setRegistryName("stone_knife");
        this.func_77637_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
    }
}
