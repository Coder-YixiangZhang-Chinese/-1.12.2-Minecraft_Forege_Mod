package nightskychaser.weaponcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nightskychaser.weaponcraft.WeaponCraft;
import nightskychaser.weaponcraft.creativetab.TabWeaponCraft;

public class BlockNiOre extends Block
{
    public BlockNiOre()
    {
        super(Material.ROCK);
        this.setUnlocalizedName(WeaponCraft.MODID + ".niOre");
        this.setCreativeTab(TabWeaponCraft.TAB_WEAPON_CRAFT);
        this.setRegistryName("ni_ore");
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(3.0F);
    }
}
