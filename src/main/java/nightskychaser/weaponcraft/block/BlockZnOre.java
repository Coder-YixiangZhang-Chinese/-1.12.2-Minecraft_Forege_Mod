package nightskychaser.weaponcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class BlockZnOre extends Block
{
    public BlockZnOre()
    {
        super(Material.field_151576_e);
        this.func_149663_c(WeaponCraft.MODID + ".znOre");
        this.func_149647_a(TabWeaponCraft.TAB_WEAPON_CRAFT);
        this.setRegistryName("zn_ore");
        this.setHarvestLevel("pickaxe", 2);
        this.func_149711_c(3.0F);
    }
}
