package ga.didrus.morearrows;

import ga.didrus.init.ModEntities;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreArrows.modId, name = MoreArrows.name, version = MoreArrows.version)
public class MoreArrows {

	public static final String modId = "morearrows";
	public static final String name = "More arrows";
	public static final String version = "1.0";
	
    @Instance
    public static MoreArrows instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModEntities.RegisterEntities();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
