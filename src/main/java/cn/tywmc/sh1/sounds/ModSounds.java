package cn.tywmc.sh1.sounds;

import cn.tywmc.sh1.ShanghaiMetroLineOneMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static final SoundEvent nextstation_waihuanroad_1_1_1 =registerSoundEvents("nextstation_waihuanroad_1_1_1");
    public static SoundEvent registerSoundEvents(String name){
        Identifier identifier = new Identifier(ShanghaiMetroLineOneMod.MOD_ID,name);
        return Registry.register(Registry.REGISTRIES.SOUND_EVENT, identifier, new SoundEvent(identifier));
    }
    public static void registerSounds() {
    }
}

