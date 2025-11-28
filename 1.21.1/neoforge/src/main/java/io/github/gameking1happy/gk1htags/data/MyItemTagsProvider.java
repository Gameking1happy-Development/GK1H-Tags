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
        tag(Tags.Items.SHULKER_BOXES).addOptionalTag(AllReinfShulker);
        tag(MiscEnchantables)
                .add(Items.COMPASS)
                .addOptional(fNaP( "linkedchests", "linked_pouch"))
                .addOptionalTags(ITKC("bagofholding","bags"), ITKC("moblassos","enchantable/lasso"));
        tag(Tags.Items.ENCHANTABLES).addOptionalTags(NetFireproof, MiscEnchantables);
        tag(HorseArmor)
                .add(Items.DIAMOND_HORSE_ARMOR, Items.LEATHER_HORSE_ARMOR, Items.IRON_HORSE_ARMOR, Items.GOLDEN_HORSE_ARMOR)
                .addOptional(fNaP("netheriteextras","netherite_horse_armor"));
        tag(WolfArmor)
                .add(Items.WOLF_ARMOR)
                .addOptional(fNaP("netheriteextras","netherite_wolf_armor"));
        tag(AnimalArmor).addTags(HorseArmor, WolfArmor);
        tag(Accessories).addOptionalTags(AllAccessories,AllCurios,AllTrinkets);
        tag(Totems)
                .add(Items.TOTEM_OF_UNDYING)
                .addOptional(fNaP("netheriteextras","totem_of_neverdying"));
        tag(Backpacks).addOptionalTag(TravelersBackpacks);
    }
}