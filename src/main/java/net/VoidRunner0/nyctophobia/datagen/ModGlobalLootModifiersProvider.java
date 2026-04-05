package net.VoidRunner0.nyctophobia.datagen;

import net.VoidRunner0.nyctophobia.Nyctophobia;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Nyctophobia.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
