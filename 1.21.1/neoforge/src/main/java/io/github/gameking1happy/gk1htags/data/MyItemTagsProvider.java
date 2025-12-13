package io.github.gameking1happy.gk1htags.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1hcore.data.CoreData.*;
import static io.github.gameking1happy.gk1htags.Main.MOD_ID;
import static io.github.gameking1happy.gk1htags.registry.ItemTag.*;

/**
 * Item tags datagen.
 */
public class MyItemTagsProvider extends ItemTagsProvider {
    /**
     * @param output Pack output.
     * @param lookupProvider Lookup provider.
     * @param blockTagsProvider Block tags provider.
     * @param existingFileHelper Existing file helper.
     */
    public MyItemTagsProvider(@NotNull PackOutput output, @NotNull CompletableFuture<HolderLookup.Provider> lookupProvider, @NotNull CompletableFuture<TagsProvider.TagLookup<Block>> blockTagsProvider, @NotNull ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider, MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.@NotNull Provider lookupProvider) {
        tag(Tags.Items.SHULKER_BOXES).addOptionalTag(ALL_REINF_SHULKER);
        tag(MISC_ENCHANTABLES)
                .add(Items.COMPASS)
                .addOptional(fnap( "linkedchests", "linked_pouch"))
                .addOptionalTags(itkc("bagofholding","bags"), itkc("moblassos","enchantable/lasso"));
        tag(Tags.Items.ENCHANTABLES).addOptionalTags(NET_FIREPROOF, MISC_ENCHANTABLES);
        tag(HORSE_ARMOR)
                .add(Items.DIAMOND_HORSE_ARMOR, Items.LEATHER_HORSE_ARMOR, Items.IRON_HORSE_ARMOR, Items.GOLDEN_HORSE_ARMOR)
                .addOptional(fnap("netheriteextras","netherite_horse_armor"));
        tag(WOLF_ARMOR)
                .add(Items.WOLF_ARMOR)
                .addOptional(fnap("netheriteextras","netherite_wolf_armor"));
        tag(ANIMAL_ARMOR).addTags(HORSE_ARMOR, WOLF_ARMOR);
        tag(ACCESSORIES).addOptionalTags(ALL_ACCESSORIES, ALL_CURIOS, ALL_TRINKETS);
        tag(TOTEMS)
                .add(Items.TOTEM_OF_UNDYING)
                .addOptional(fnap("netheriteextras","totem_of_neverdying"));
        tag(BACKPACKS).addOptionalTag(TRAVELERS_BACKPACKS);
    }
}