package rickroll.register;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.ActionResult;

public class EventRgister {

    public static void registerEvents(){

        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) ->
        {
            /* 手动的旁观者检查是必要的，因为 AttackBlockCallbacks 会在旁观者检查之前应用 */
            if ( !player.isSpectator() &&
                    player.getMainHandStack().isEmpty())
            {
                player.damage(DamageSource.GENERIC, 1.0F);
            }
            return ActionResult.SUCCESS;
        });

    }

}
