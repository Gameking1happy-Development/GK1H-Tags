package io.github.gameking1happy.gk1htags.data.curios;

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
 * Curios item tags datagen.
 */
public class CuriosItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public CuriosItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    public @NotNull String getName() {
        return super.getName() + "-Curios";
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(AllCurios).addOptionalTags(CuriosArrow,CuriosAll,CuriosCharm,CuriosCurio,CuriosCompass,CuriosRecoveryCompass,CuriosClock,CuriosElytra,CuriosEnderChest,CuriosBack,CuriosTotem,CuriosBody,CuriosLantern,CuriosSpyglass,CuriosShulker,CuriosNecklace,CuriosBelt,CuriosBracelet,CuriosHands,CuriosRing,CuriosHead);
    }
}