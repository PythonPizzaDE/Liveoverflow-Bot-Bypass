package paulfrische.xyz.move.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public abstract class MoveMixin extends EntityMixin {

    private static final Logger LOGGER = LoggerFactory.getLogger("MOVE");

    @Inject(at = @At("TAIL"), method = "tickMovement")
    private void PlayerMoveC2SPacket(CallbackInfo ci) {
        double x = (double)((long)(getPos().x * 1000) / 10) / 100;
        double z = (double)((long)(getPos().z * 1000) / 10) / 100;
        setPos(new Vec3d(x, getPos().y, z));

        LOGGER.info("x: " + x + " z: " + z);
    }
}
