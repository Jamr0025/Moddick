package com.github.jamr0025.dickmod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.github.jamr0025.init.dickblock;

@Mod(dickModMain.MODID)

public class dickModMain {

    public static final String MODID = "moddick";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public dickModMain() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.debug("este es el mensaje que imprimo, pene");
        dickblock.BLOCKS.register(modEventBus);
    }
}
