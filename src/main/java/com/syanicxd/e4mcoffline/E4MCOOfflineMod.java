package com.syanicxd.e4mcoffline;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class E4MCOOfflineMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("e4mc-offline");

    @Override
    public void onInitialize() {
        LOGGER.info("E4MC Offline Mod initialized");
    }
}