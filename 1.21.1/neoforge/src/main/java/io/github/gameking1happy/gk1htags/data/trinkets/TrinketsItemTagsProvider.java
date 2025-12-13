package io.github.gameking1happy.gk1htags.data.trinkets;

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
 * Trinkets item tags datagen.
 */
public class TrinketsItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public TrinketsItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Trinkets";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(ALL_TRINKETS).addOptionalTags(TRINKETS_AGLET, TRINKETS_OFF_HAND_GLOVE, TRINKETS_OFF_HAND_RING, TRINKETS_HAND_RING, TRINKETS_HAND_GLOVE, TRINKETS_BACK, TRINKETS_CAPE, ACCESSORIES_ANKLET, TRINKETS_NECKLACE, TRINKETS_FACE, TRINKETS_HAT, TRINKETS_BELT, TRINKETS_SHOES);
    }
}