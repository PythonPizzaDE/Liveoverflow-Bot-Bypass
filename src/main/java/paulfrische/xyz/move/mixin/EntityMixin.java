package paulfrische.xyz.move.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(Entity.class)
public class EntityMixin {
    @Shadow
    private Vec3d pos;

    public Vec3d getPos() {
        return pos;
    }

    public void setPos(Vec3d pos) {
       this.pos = pos;
    }
}
