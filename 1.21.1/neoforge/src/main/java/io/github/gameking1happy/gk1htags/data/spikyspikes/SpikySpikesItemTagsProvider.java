package io.github.gameking1happy.gk1htags.data.spikyspikes;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.fnap;
import static io.github.gameking1happy.gk1htags.Main.MOD_ID;
import static io.github.gameking1happy.gk1htags.registry.ItemTag.*;

/**
 * Spiky Spikes item tags datagen.
 */
public class SpikySpikesItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public SpikySpikesItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-SpikySpikes";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(ENCHANTABLE_SPIKY_SPIKES)
                .addOptional(fnap("spikyspikes","diamond_spike"))
                .addOptional(fnap("spikyspikes","netherite_spike"));
        tag(SPIKY_SPIKES)
                .addOptionalTag(ENCHANTABLE_SPIKY_SPIKES)
                .addOptional(fnap("spikyspikes","wooden_spike"))
                .addOptional(fnap("spikyspikes","stone_spike"))
                .addOptional(fnap("spikyspikes","gold_spike"))
                .addOptional(fnap("spikyspikes","iron_spike"));
    }
}