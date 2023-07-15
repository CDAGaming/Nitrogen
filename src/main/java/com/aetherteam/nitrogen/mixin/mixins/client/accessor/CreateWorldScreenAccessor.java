package com.aetherteam.nitrogen.mixin.mixins.client.accessor;

import net.minecraft.client.gui.screens.worldselection.CreateWorldScreen;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(CreateWorldScreen.class)
public interface CreateWorldScreenAccessor {
    @Mutable
    @Accessor("HEADER_SEPERATOR")
    static void nitrogen$setHeaderSeparator(ResourceLocation location) {
        throw new AssertionError();
    }

    @Mutable
    @Accessor("FOOTER_SEPERATOR")
    static void nitrogen$setFooterSeparator(ResourceLocation location) {
        throw new AssertionError();
    }
}