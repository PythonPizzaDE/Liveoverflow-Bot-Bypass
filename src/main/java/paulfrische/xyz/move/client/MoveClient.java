package paulfrische.xyz.move.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MoveClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    @Override
    public void onInitializeClient() {
        LOGGER.info("chello from client!");
    }
}
