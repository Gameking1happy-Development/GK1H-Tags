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
    public static final @NotNull TagKey<Item> ACCESSORIES = itkc("c", "accessories");
    /**
     * All Accessories accessories.
     */
    public static final @NotNull TagKey<Item> ALL_ACCESSORIES = accessories("all_accessories");
    /**
     * Accessories all slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ALL = accessories("all");
    /**
     * Accessories any slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ANY = accessories("any");
    /**
     * Accessories charm slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_CHARM = accessories("charm");
    /**
     * Accessories hat slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_HAT = accessories("hat");
    /**
     * Accessories face slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_FACE = accessories("face");
    /**
     * Accessories cape slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_CAPE = accessories("cape");
    /**
     * Accessories necklace slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_NECKLACE = accessories("necklace");
    /**
     * Accessories back slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_BACK = accessories("back");
    /**
     * Accessories hand slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_HAND = accessories("hand");
    /**
     * Accessories ring slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_RING = accessories("ring");
    /**
     * Accessories wrist slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_WRIST = accessories("wrist");
    /**
     * Accessories belt slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_BELT = accessories("belt");
    /**
     * Accessories anklet slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ANKLET = accessories("anklet");
    /**
     * Accessories shoes slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_SHOES = accessories("shoes");
    /**
     * Accessories arrow slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ARROW = accessories("arrow");
    /**
     * Accessories clock slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_CLOCK = accessories("clock");
    /**
     * Accessories compass slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_COMPASS = accessories("compass");
    /**
     * Accessories elytra slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ELYTRA = accessories("elytra");
    /**
     * Accessories ender chest slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_ENDER_CHEST = accessories("ender_chest");
    /**
     * Accessories lantern slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_LANTERN = accessories("lantern");
    /**
     * Accessories recovery compass slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_RECOVERY_COMPASS = accessories("recovery_compass");
    /**
     * Accessories shulker slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_SHULKER = accessories("shulker");
    /**
     * Accessories spyglass slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_SPYGLASS = accessories("spyglass");
    /**
     * Accessories totem slot.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_TOTEM = accessories("totem");
    /**
     * Accessories compat all Curios items.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_CURIOS = itkc("accessories_compat_layer", "all_curios_items");
    /**
     * Accessories compat all Trinkets items.
     */
    public static final @NotNull TagKey<Item> ACCESSORIES_TRINKETS = itkc("accessories_compat_layer", "all_trinkets_items");
    /**
     * All Curios accessories.
     */
    public static final @NotNull TagKey<Item> ALL_CURIOS = curios("all_curios");
    /**
     * Curios all slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_ALL = curios("all");
    /**
     * Curios curio slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_CURIO = curios("curio");
    /**
     * Curios charm slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_CHARM = curios("charm");
    /**
     * Curios head slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_HEAD = curios("head");
    /**
     * Curios bracelet slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_BRACELET = accessories("bracelet");
    /**
     * Curios necklace slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_NECKLACE = curios("necklace");
    /**
     * Curios back slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_BACK = curios("back");
    /**
     * Curios hands slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_HANDS = curios("hands");
    /**
     * Curios ring slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_RING = curios("ring");
    /**
     * Curios body slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_BODY = curios("body");
    /**
     * Curios belt slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_BELT = curios("belt");
    /**
     * Curios arrow slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_ARROW = curios("arrow");
    /**
     * Curios clock slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_CLOCK = curios("clock");
    /**
     * Curios compass slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_COMPASS = curios("compass");
    /**
     * Curios elytra slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_ELYTRA = curios("elytra");
    /**
     * Curios ender chest slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_ENDER_CHEST = curios("ender_chest");
    /**
     * Curios lantern slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_LANTERN = curios("lantern");
    /**
     * Curios recovery compass slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_RECOVERY_COMPASS = curios("recovery_compass");
    /**
     * Curios shulker slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_SHULKER = curios("shulker");
    /**
     * Curios spyglass slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_SPYGLASS = curios("spyglass");
    /**
     * Curios totem slot.
     */
    public static final @NotNull TagKey<Item> CURIOS_TOTEM = curios("totem");
    /**
     * All Trinkets accessories.
     */
    public static final @NotNull TagKey<Item> ALL_TRINKETS = trinkets("all_trinkets");
    /**
     * Trinkets back slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_BACK = trinkets("chest/back");
    /**
     * Trinkets cape slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_CAPE = trinkets("chest/cape");
    /**
     * Trinkets necklace slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_NECKLACE = trinkets("chest/necklace");
    /**
     * Trinkets hat slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_HAT = trinkets("head/hat");
    /**
     * Trinkets face slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_FACE = trinkets("head/face");
    /**
     * Trinkets belt slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_BELT = trinkets("legs/belt");
    /**
     * Trinkets shoes slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_SHOES = trinkets("feet/shoes");
    /**
     * Trinkets aglet slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_AGLET = trinkets("feet/aglet");
    /**
     * Trinkets hand/glove slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_HAND_GLOVE = trinkets("hand/glove");
    /**
     * Trinkets offhand/glove slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_OFF_HAND_GLOVE = trinkets("offhand/glove");
    /**
     * Trinkets hand/ring slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_HAND_RING = trinkets("hand/ring");
    /**
     * Trinkets offhand/ring slot.
     */
    public static final @NotNull TagKey<Item> TRINKETS_OFF_HAND_RING = trinkets("offhand/ring");
    /**
     * Netherited fireproof.
     */
    public static final @NotNull TagKey<Item> NET_FIREPROOF = itkc("netherited","enchantable/fireproof");
    /**
     * Reinforced Shulker Boxes.
     */
    public static final @NotNull TagKey<Item> ALL_REINF_SHULKER = itkc("reinfshulker","reinforced_shulker_boxes");
    /**
     * Reinforced Shulker Boxes copper.
     */
    public static final @NotNull TagKey<Item> COPPER_REINF_SHULKER = itkc("reinfshulker","copper_shulker_boxes");
    /**
     * Reinforced Shulker Boxes iron.
     */
    public static final @NotNull TagKey<Item> IRON_REINF_SHULKER = itkc("reinfshulker","iron_shulker_boxes");
    /**
     * Reinforced Shulker Boxes gold.
     */
    public static final @NotNull TagKey<Item> GOLD_REINF_SHULKER = itkc("reinfshulker","gold_shulker_boxes");
    /**
     * Reinforced Shulker Boxes diamond.
     */
    public static final @NotNull TagKey<Item> DIAMOND_REINF_SHULKER = itkc("reinfshulker","diamond_shulker_boxes");
    /**
     * Reinforced Shulker Boxes netherite.
     */
    public static final @NotNull TagKey<Item> NETHERITE_REINF_SHULKER = itkc("reinfshulker","netherite_shulker_boxes");
    /**
     * Tag of horse armor items.
     */
    public static final @NotNull TagKey<Item> HORSE_ARMOR = itkc("c", "horse_armor");
    /**
     * Tag of wolf armor items.
     */
    public static final @NotNull TagKey<Item> WOLF_ARMOR = itkc("c", "wolf_armor");
    /**
     * Tag of animal armor items.
     */
    public static final @NotNull TagKey<Item> ANIMAL_ARMOR = itkc("c", "animal_armor");
    /**
     * Tag of totems.
     */
    public static final @NotNull TagKey<Item> TOTEMS = itkc("c", "totems");
    /**
     * Tag of backpacks.
     */
    public static final @NotNull TagKey<Item> BACKPACKS = itkc("c","backpacks");
    /**
     * Tag of Traveler's Backpack backpacks.
     */
    public static final @NotNull TagKey<Item> TRAVELERS_BACKPACKS = itkc("travelersbackpack","custom_travelers_backpack");
    /**
     * Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> SPIKY_SPIKES = itkc("spikyspikes","spiky_spikes");
    /**
     * Enchantable Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> ENCHANTABLE_SPIKY_SPIKES = itkc("spikyspikes","enchantable_spiky_spikes");
    /**
     * Miscellaneous enchantables.
     */
    public static final @NotNull TagKey<Item> MISC_ENCHANTABLES = itkc("c","misc_enchantables");
}
