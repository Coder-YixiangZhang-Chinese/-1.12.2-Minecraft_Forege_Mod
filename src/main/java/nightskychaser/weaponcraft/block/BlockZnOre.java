package nightskychaser.weaponcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class BlockZnOre extends Block
{
    public BlockZnOre()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(WeaponCraft.MODID + ".znOre");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
        this.setRegistryName("zn_ore");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
    }
}
