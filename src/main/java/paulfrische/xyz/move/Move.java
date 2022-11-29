package paulfrische.xyz.move;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Move implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("MOVE");

    @Override
    public void onInitialize() {
        LOGGER.info("MOVE Hello World!");
    }
}
