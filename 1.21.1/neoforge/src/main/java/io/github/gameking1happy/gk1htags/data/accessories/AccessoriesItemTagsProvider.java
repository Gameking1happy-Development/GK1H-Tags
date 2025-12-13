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
        tag(allAccessories).addOptionalTags(accessoriesAll, accessoriesAny, accessoriesAnklet, accessoriesArrow, accessoriesBack, accessoriesCape, accessoriesBelt, accessoriesShoes, accessoriesWrist, accessoriesRing, accessoriesHand, accessoriesNecklace, accessoriesFace, accessoriesHat, accessoriesCharm, accessoriesClock, accessoriesCompass, accessoriesRecoveryCompass, accessoriesElytra, accessoriesLantern, accessoriesShulker, accessoriesEnderChest, accessoriesSpyglass, accessoriesTotem, accessoriesCurios, accessoriesTrinkets);
    }
}