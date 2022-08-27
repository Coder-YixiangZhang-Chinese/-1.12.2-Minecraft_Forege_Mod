package nightskychaser.weaponcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nightskychaser.weaponcraft.item.ItemRegistryHandler;

public class TabWeaponCraft extends CreativeTabs
{
    public static final TabWeaponCraft TAB_WEAPON_CRAFT = new TabWeaponCraft();

    public TabWeaponCraft()
    {
        super("WeaponCraft");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemRegistryHandler.ITEM_CHISELED_STONE);
    }
}
