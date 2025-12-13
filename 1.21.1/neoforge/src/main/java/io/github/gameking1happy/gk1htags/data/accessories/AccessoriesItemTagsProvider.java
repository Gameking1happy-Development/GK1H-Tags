package io.github.gameking1happy.gk1htags.data.accessories;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1htags.Main.MOD_ID;
import static io.github.gameking1happy.gk1htags.registry.ItemTag.*;

/**
 * Accessories item tags datagen.
 */
public class AccessoriesItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public AccessoriesItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Accessories";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(ALL_ACCESSORIES).addOptionalTags(ACCESSORIES_ALL, ACCESSORIES_ANY, ACCESSORIES_ANKLET, ACCESSORIES_ARROW, ACCESSORIES_BACK, ACCESSORIES_CAPE, ACCESSORIES_BELT, ACCESSORIES_SHOES, ACCESSORIES_WRIST, ACCESSORIES_RING, ACCESSORIES_HAND, ACCESSORIES_NECKLACE, ACCESSORIES_FACE, ACCESSORIES_HAT, ACCESSORIES_CHARM, ACCESSORIES_CLOCK, ACCESSORIES_COMPASS, ACCESSORIES_RECOVERY_COMPASS, ACCESSORIES_ELYTRA, ACCESSORIES_LANTERN, ACCESSORIES_SHULKER, ACCESSORIES_ENDER_CHEST, ACCESSORIES_SPYGLASS, ACCESSORIES_TOTEM, ACCESSORIES_CURIOS, ACCESSORIES_TRINKETS);
    }
}