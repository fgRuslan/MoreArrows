package ga.didrus.morearrows.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockYungRussia extends Block {

	public BlockYungRussia(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
}