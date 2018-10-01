package themightyducks.medalofhonor;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "MOH:VWM",name = "Medal of Honor:Vietnam War Mod", version = "1.0")
public class MedalofHonor {
	

	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		//Items/Block init and registering
		//Config handling
		
	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Proxy, TileEntity, entity,GUI and Package Registering
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		
	}
}
