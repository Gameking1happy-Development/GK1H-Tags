package io.github.gameking1happy.gk1htags.registry;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.itkc;

/**
 * Item tags so other mods don't have to use {@link net.minecraft.tags.TagKey#create(ResourceKey, ResourceLocation)}.
 */
public class ItemTag {
    /**
     * For all tags of the accessories namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> accessories(String path) {
        return itkc("accessories", path);
    }
    /**
     * For all tags of the curios namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> curios(String path) {
        return itkc("curios", path);
    }
    /**
     * For all tags of the trinkets namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> trinkets(String path) {
        return itkc("trinkets", path);
    }
    /**
     * All accessories.
     */
    public static final @NotNull TagKey<Item> accessories = itkc("c", "accessories");
    /**
     * All Accessories accessories.
     */
    public static final @NotNull TagKey<Item> allAccessories = accessories("all_accessories");
    /**
     * Accessories all slot.
     */
    public static final @NotNull TagKey<Item> accessoriesAll = accessories("all");
    /**
     * Accessories any slot.
     */
    public static final @NotNull TagKey<Item> accessoriesAny = accessories("any");
    /**
     * Accessories charm slot.
     */
    public static final @NotNull TagKey<Item> accessoriesCharm = accessories("charm");
    /**
     * Accessories hat slot.
     */
    public static final @NotNull TagKey<Item> accessoriesHat = accessories("hat");
    /**
     * Accessories face slot.
     */
    public static final @NotNull TagKey<Item> accessoriesFace = accessories("face");
    /**
     * Accessories cape slot.
     */
    public static final @NotNull TagKey<Item> accessoriesCape = accessories("cape");
    /**
     * Accessories necklace slot.
     */
    public static final @NotNull TagKey<Item> accessoriesNecklace = accessories("necklace");
    /**
     * Accessories back slot.
     */
    public static final @NotNull TagKey<Item> accessoriesBack = accessories("back");
    /**
     * Accessories hand slot.
     */
    public static final @NotNull TagKey<Item> accessoriesHand = accessories("hand");
    /**
     * Accessories ring slot.
     */
    public static final @NotNull TagKey<Item> accessoriesRing = accessories("ring");
    /**
     * Accessories wrist slot.
     */
    public static final @NotNull TagKey<Item> accessoriesWrist = accessories("wrist");
    /**
     * Accessories belt slot.
     */
    public static final @NotNull TagKey<Item> accessoriesBelt = accessories("belt");
    /**
     * Accessories anklet slot.
     */
    public static final @NotNull TagKey<Item> accessoriesAnklet = accessories("anklet");
    /**
     * Accessories shoes slot.
     */
    public static final @NotNull TagKey<Item> accessoriesShoes = accessories("shoes");
    /**
     * Accessories arrow slot.
     */
    public static final @NotNull TagKey<Item> accessoriesArrow = accessories("arrow");
    /**
     * Accessories clock slot.
     */
    public static final @NotNull TagKey<Item> accessoriesClock = accessories("clock");
    /**
     * Accessories compass slot.
     */
    public static final @NotNull TagKey<Item> accessoriesCompass = accessories("compass");
    /**
     * Accessories elytra slot.
     */
    public static final @NotNull TagKey<Item> accessoriesElytra = accessories("elytra");
    /**
     * Accessories ender chest slot.
     */
    public static final @NotNull TagKey<Item> accessoriesEnderChest = accessories("ender_chest");
    /**
     * Accessories lantern slot.
     */
    public static final @NotNull TagKey<Item> accessoriesLantern = accessories("lantern");
    /**
     * Accessories recovery compass slot.
     */
    public static final @NotNull TagKey<Item> accessoriesRecoveryCompass = accessories("recovery_compass");
    /**
     * Accessories shulker slot.
     */
    public static final @NotNull TagKey<Item> accessoriesShulker = accessories("shulker");
    /**
     * Accessories spyglass slot.
     */
    public static final @NotNull TagKey<Item> accessoriesSpyglass = accessories("spyglass");
    /**
     * Accessories totem slot.
     */
    public static final @NotNull TagKey<Item> accessoriesTotem = accessories("totem");
    /**
     * Accessories compat all Curios items.
     */
    public static final @NotNull TagKey<Item> accessoriesCurios = itkc("accessories_compat_layer", "all_curios_items");
    /**
     * Accessories compat all Trinkets items.
     */
    public static final @NotNull TagKey<Item> accessoriesTrinkets = itkc("accessories_compat_layer", "all_trinkets_items");
    /**
     * All Curios accessories.
     */
    public static final @NotNull TagKey<Item> allCurios = curios("all_curios");
    /**
     * Curios all slot.
     */
    public static final @NotNull TagKey<Item> curiosAll = curios("all");
    /**
     * Curios curio slot.
     */
    public static final @NotNull TagKey<Item> curiosCurio = curios("curio");
    /**
     * Curios charm slot.
     */
    public static final @NotNull TagKey<Item> curiosCharm = curios("charm");
    /**
     * Curios head slot.
     */
    public static final @NotNull TagKey<Item> curiosHead = curios("head");
    /**
     * Curios bracelet slot.
     */
    public static final @NotNull TagKey<Item> curiosBracelet = accessories("bracelet");
    /**
     * Curios necklace slot.
     */
    public static final @NotNull TagKey<Item> curiosNecklace = curios("necklace");
    /**
     * Curios back slot.
     */
    public static final @NotNull TagKey<Item> curiosBack = curios("back");
    /**
     * Curios hands slot.
     */
    public static final @NotNull TagKey<Item> curiosHands = curios("hands");
    /**
     * Curios ring slot.
     */
    public static final @NotNull TagKey<Item> curiosRing = curios("ring");
    /**
     * Curios body slot.
     */
    public static final @NotNull TagKey<Item> curiosBody = curios("body");
    /**
     * Curios belt slot.
     */
    public static final @NotNull TagKey<Item> curiosBelt = curios("belt");
    /**
     * Curios arrow slot.
     */
    public static final @NotNull TagKey<Item> curiosArrow = curios("arrow");
    /**
     * Curios clock slot.
     */
    public static final @NotNull TagKey<Item> curiosClock = curios("clock");
    /**
     * Curios compass slot.
     */
    public static final @NotNull TagKey<Item> curiosCompass = curios("compass");
    /**
     * Curios elytra slot.
     */
    public static final @NotNull TagKey<Item> curiosElytra = curios("elytra");
    /**
     * Curios ender chest slot.
     */
    public static final @NotNull TagKey<Item> curiosEnderChest = curios("ender_chest");
    /**
     * Curios lantern slot.
     */
    public static final @NotNull TagKey<Item> curiosLantern = curios("lantern");
    /**
     * Curios recovery compass slot.
     */
    public static final @NotNull TagKey<Item> curiosRecoveryCompass = curios("recovery_compass");
    /**
     * Curios shulker slot.
     */
    public static final @NotNull TagKey<Item> curiosShulker = curios("shulker");
    /**
     * Curios spyglass slot.
     */
    public static final @NotNull TagKey<Item> curiosSpyglass = curios("spyglass");
    /**
     * Curios totem slot.
     */
    public static final @NotNull TagKey<Item> curiosTotem = curios("totem");
    /**
     * All Trinkets accessories.
     */
    public static final @NotNull TagKey<Item> allTrinkets = trinkets("all_trinkets");
    /**
     * Trinkets back slot.
     */
    public static final @NotNull TagKey<Item> trinketsBack = trinkets("chest/back");
    /**
     * Trinkets cape slot.
     */
    public static final @NotNull TagKey<Item> trinketsCape = trinkets("chest/cape");
    /**
     * Trinkets necklace slot.
     */
    public static final @NotNull TagKey<Item> trinketsNecklace = trinkets("chest/necklace");
    /**
     * Trinkets hat slot.
     */
    public static final @NotNull TagKey<Item> trinketsHat = trinkets("head/hat");
    /**
     * Trinkets face slot.
     */
    public static final @NotNull TagKey<Item> trinketsFace = trinkets("head/face");
    /**
     * Trinkets belt slot.
     */
    public static final @NotNull TagKey<Item> trinketsBelt = trinkets("legs/belt");
    /**
     * Trinkets shoes slot.
     */
    public static final @NotNull TagKey<Item> trinketsShoes = trinkets("feet/shoes");
    /**
     * Trinkets aglet slot.
     */
    public static final @NotNull TagKey<Item> trinketsAglet = trinkets("feet/aglet");
    /**
     * Trinkets hand/glove slot.
     */
    public static final @NotNull TagKey<Item> trinketsHandGlove = trinkets("hand/glove");
    /**
     * Trinkets offhand/glove slot.
     */
    public static final @NotNull TagKey<Item> trinketsOffHandGlove = trinkets("offhand/glove");
    /**
     * Trinkets hand/ring slot.
     */
    public static final @NotNull TagKey<Item> trinketsHandRing = trinkets("hand/ring");
    /**
     * Trinkets offhand/ring slot.
     */
    public static final @NotNull TagKey<Item> trinketsOffHandRing = trinkets("offhand/ring");
    /**
     * Netherited fireproof.
     */
    public static final @NotNull TagKey<Item> netFireproof = itkc("netherited","enchantable/fireproof");
    /**
     * Reinforced Shulker Boxes.
     */
    public static final @NotNull TagKey<Item> allReinfShulker = itkc("reinfshulker","reinforced_shulker_boxes");
    /**
     * Reinforced Shulker Boxes copper.
     */
    public static final @NotNull TagKey<Item> copperReinfShulker = itkc("reinfshulker","copper_shulker_boxes");
    /**
     * Reinforced Shulker Boxes iron.
     */
    public static final @NotNull TagKey<Item> ironReinfShulker = itkc("reinfshulker","iron_shulker_boxes");
    /**
     * Reinforced Shulker Boxes gold.
     */
    public static final @NotNull TagKey<Item> goldReinfShulker = itkc("reinfshulker","gold_shulker_boxes");
    /**
     * Reinforced Shulker Boxes diamond.
     */
    public static final @NotNull TagKey<Item> diamondReinfShulker = itkc("reinfshulker","diamond_shulker_boxes");
    /**
     * Reinforced Shulker Boxes netherite.
     */
    public static final @NotNull TagKey<Item> netheriteReinfShulker = itkc("reinfshulker","netherite_shulker_boxes");
    /**
     * Tag of horse armor items.
     */
    public static final @NotNull TagKey<Item> horseArmor = itkc("c", "horse_armor");
    /**
     * Tag of wolf armor items.
     */
    public static final @NotNull TagKey<Item> wolfArmor = itkc("c", "wolf_armor");
    /**
     * Tag of animal armor items.
     */
    public static final @NotNull TagKey<Item> animalArmor = itkc("c", "animal_armor");
    /**
     * Tag of totems.
     */
    public static final @NotNull TagKey<Item> totems = itkc("c", "totems");
    /**
     * Tag of backpacks.
     */
    public static final @NotNull TagKey<Item> backpacks = itkc("c","backpacks");
    /**
     * Tag of Traveler's Backpack backpacks.
     */
    public static final @NotNull TagKey<Item> travelersBackpacks = itkc("travelersbackpack","custom_travelers_backpack");
    /**
     * Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> spikySpikes = itkc("spikyspikes","spiky_spikes");
    /**
     * Enchantable Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> enchantableSpikySpikes = itkc("spikyspikes","enchantable_spiky_spikes");
    /**
     * Miscellaneous enchantables.
     */
    public static final @NotNull TagKey<Item> miscEnchantables = itkc("c","misc_enchantables");
}
