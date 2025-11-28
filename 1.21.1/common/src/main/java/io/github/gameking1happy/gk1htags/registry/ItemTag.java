package io.github.gameking1happy.gk1htags.registry;

import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.data.CoreData.ITKC;

/**
 * Item tags so other mods don't have to use {@link net.minecraft.tags.TagKey#create(ResourceKey, ResourceLocation)}.
 */
public class ItemTag {
    /**
     * For all tags of the accessories namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> Accessories(String path) {
        return ITKC("accessories", path);
    }
    /**
     * For all tags of the curios namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> Curios(String path) {
        return ITKC("curios", path);
    }
    /**
     * For all tags of the trinkets namespace.
     * @param path Path.
     * @return Item tag key.
     */
    public static @NotNull TagKey<Item> Trinkets(String path) {
        return ITKC("trinkets", path);
    }
    /**
     * All accessories.
     */
    public static final @NotNull TagKey<Item> Accessories = ITKC("c", "accessories");
    /**
     * All Accessories accessories.
     */
    public static final @NotNull TagKey<Item> AllAccessories = Accessories("all_accessories");
    /**
     * Accessories all slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesAll = Accessories("all");
    /**
     * Accessories any slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesAny = Accessories("any");
    /**
     * Accessories charm slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesCharm = Accessories("charm");
    /**
     * Accessories hat slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesHat = Accessories("hat");
    /**
     * Accessories face slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesFace = Accessories("face");
    /**
     * Accessories cape slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesCape = Accessories("cape");
    /**
     * Accessories necklace slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesNecklace = Accessories("necklace");
    /**
     * Accessories back slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesBack = Accessories("back");
    /**
     * Accessories hand slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesHand = Accessories("hand");
    /**
     * Accessories ring slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesRing = Accessories("ring");
    /**
     * Accessories wrist slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesWrist = Accessories("wrist");
    /**
     * Accessories belt slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesBelt = Accessories("belt");
    /**
     * Accessories anklet slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesAnklet = Accessories("anklet");
    /**
     * Accessories shoes slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesShoes = Accessories("shoes");
    /**
     * Accessories arrow slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesArrow = Accessories("arrow");
    /**
     * Accessories clock slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesClock = Accessories("clock");
    /**
     * Accessories compass slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesCompass = Accessories("compass");
    /**
     * Accessories elytra slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesElytra = Accessories("elytra");
    /**
     * Accessories ender chest slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesEnderChest = Accessories("ender_chest");
    /**
     * Accessories lantern slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesLantern = Accessories("lantern");
    /**
     * Accessories recovery compass slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesRecoveryCompass = Accessories("recovery_compass");
    /**
     * Accessories shulker slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesShulker = Accessories("shulker");
    /**
     * Accessories spyglass slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesSpyglass = Accessories("spyglass");
    /**
     * Accessories totem slot.
     */
    public static final @NotNull TagKey<Item> AccessoriesTotem = Accessories("totem");
    /**
     * Accessories compat all Curios items.
     */
    public static final @NotNull TagKey<Item> AccessoriesCurios = ITKC("accessories_compat_layer", "all_curios_items");
    /**
     * Accessories compat all Trinkets items.
     */
    public static final @NotNull TagKey<Item> AccessoriesTrinkets = ITKC("accessories_compat_layer", "all_trinkets_items");
    /**
     * All Curios accessories.
     */
    public static final @NotNull TagKey<Item> AllCurios = Curios("all_curios");
    /**
     * Curios all slot.
     */
    public static final @NotNull TagKey<Item> CuriosAll = Curios("all");
    /**
     * Curios curio slot.
     */
    public static final @NotNull TagKey<Item> CuriosCurio = Curios("curio");
    /**
     * Curios charm slot.
     */
    public static final @NotNull TagKey<Item> CuriosCharm = Curios("charm");
    /**
     * Curios head slot.
     */
    public static final @NotNull TagKey<Item> CuriosHead = Curios("head");
    /**
     * Curios bracelet slot.
     */
    public static final @NotNull TagKey<Item> CuriosBracelet = Accessories("bracelet");
    /**
     * Curios necklace slot.
     */
    public static final @NotNull TagKey<Item> CuriosNecklace = Curios("necklace");
    /**
     * Curios back slot.
     */
    public static final @NotNull TagKey<Item> CuriosBack = Curios("back");
    /**
     * Curios hands slot.
     */
    public static final @NotNull TagKey<Item> CuriosHands = Curios("hands");
    /**
     * Curios ring slot.
     */
    public static final @NotNull TagKey<Item> CuriosRing = Curios("ring");
    /**
     * Curios body slot.
     */
    public static final @NotNull TagKey<Item> CuriosBody = Curios("body");
    /**
     * Curios belt slot.
     */
    public static final @NotNull TagKey<Item> CuriosBelt = Curios("belt");
    /**
     * Curios arrow slot.
     */
    public static final @NotNull TagKey<Item> CuriosArrow = Curios("arrow");
    /**
     * Curios clock slot.
     */
    public static final @NotNull TagKey<Item> CuriosClock = Curios("clock");
    /**
     * Curios compass slot.
     */
    public static final @NotNull TagKey<Item> CuriosCompass = Curios("compass");
    /**
     * Curios elytra slot.
     */
    public static final @NotNull TagKey<Item> CuriosElytra = Curios("elytra");
    /**
     * Curios ender chest slot.
     */
    public static final @NotNull TagKey<Item> CuriosEnderChest = Curios("ender_chest");
    /**
     * Curios lantern slot.
     */
    public static final @NotNull TagKey<Item> CuriosLantern = Curios("lantern");
    /**
     * Curios recovery compass slot.
     */
    public static final @NotNull TagKey<Item> CuriosRecoveryCompass = Curios("recovery_compass");
    /**
     * Curios shulker slot.
     */
    public static final @NotNull TagKey<Item> CuriosShulker = Curios("shulker");
    /**
     * Curios spyglass slot.
     */
    public static final @NotNull TagKey<Item> CuriosSpyglass = Curios("spyglass");
    /**
     * Curios totem slot.
     */
    public static final @NotNull TagKey<Item> CuriosTotem = Curios("totem");
    /**
     * All Trinkets accessories.
     */
    public static final @NotNull TagKey<Item> AllTrinkets = Trinkets("all_trinkets");
    /**
     * Trinkets back slot.
     */
    public static final @NotNull TagKey<Item> TrinketsBack = Trinkets("chest/back");
    /**
     * Trinkets cape slot.
     */
    public static final @NotNull TagKey<Item> TrinketsCape = Trinkets("chest/cape");
    /**
     * Trinkets necklace slot.
     */
    public static final @NotNull TagKey<Item> TrinketsNecklace = Trinkets("chest/necklace");
    /**
     * Trinkets hat slot.
     */
    public static final @NotNull TagKey<Item> TrinketsHat = Trinkets("head/hat");
    /**
     * Trinkets face slot.
     */
    public static final @NotNull TagKey<Item> TrinketsFace = Trinkets("head/face");
    /**
     * Trinkets belt slot.
     */
    public static final @NotNull TagKey<Item> TrinketsBelt = Trinkets("legs/belt");
    /**
     * Trinkets shoes slot.
     */
    public static final @NotNull TagKey<Item> TrinketsShoes = Trinkets("feet/shoes");
    /**
     * Trinkets aglet slot.
     */
    public static final @NotNull TagKey<Item> TrinketsAglet = Trinkets("feet/aglet");
    /**
     * Trinkets hand/glove slot.
     */
    public static final @NotNull TagKey<Item> TrinketsHandGlove = Trinkets("hand/glove");
    /**
     * Trinkets offhand/glove slot.
     */
    public static final @NotNull TagKey<Item> TrinketsOffHandGlove = Trinkets("offhand/glove");
    /**
     * Trinkets hand/ring slot.
     */
    public static final @NotNull TagKey<Item> TrinketsHandRing = Trinkets("hand/ring");
    /**
     * Trinkets offhand/ring slot.
     */
    public static final @NotNull TagKey<Item> TrinketsOffHandRing = Trinkets("offhand/ring");
    /**
     * Netherited fireproof.
     */
    public static final @NotNull TagKey<Item> NetFireproof = ITKC("netherited","enchantable/fireproof");
    /**
     * Reinforced Shulker Boxes.
     */
    public static final @NotNull TagKey<Item> AllReinfShulker = ITKC("reinfshulker","reinforced_shulker_boxes");
    /**
     * Reinforced Shulker Boxes copper.
     */
    public static final @NotNull TagKey<Item> CopperReinfShulker = ITKC("reinfshulker","copper_shulker_boxes");
    /**
     * Reinforced Shulker Boxes iron.
     */
    public static final @NotNull TagKey<Item> IronReinfShulker = ITKC("reinfshulker","iron_shulker_boxes");
    /**
     * Reinforced Shulker Boxes gold.
     */
    public static final @NotNull TagKey<Item> GoldReinfShulker = ITKC("reinfshulker","gold_shulker_boxes");
    /**
     * Reinforced Shulker Boxes diamond.
     */
    public static final @NotNull TagKey<Item> DiamondReinfShulker = ITKC("reinfshulker","diamond_shulker_boxes");
    /**
     * Reinforced Shulker Boxes netherite.
     */
    public static final @NotNull TagKey<Item> NetheriteReinfShulker = ITKC("reinfshulker","netherite_shulker_boxes");
    /**
     * Tag of horse armor items.
     */
    public static final @NotNull TagKey<Item> HorseArmor = ITKC("c", "horse_armor");
    /**
     * Tag of wolf armor items.
     */
    public static final @NotNull TagKey<Item> WolfArmor = ITKC("c", "wolf_armor");
    /**
     * Tag of animal armor items.
     */
    public static final @NotNull TagKey<Item> AnimalArmor = ITKC("c", "animal_armor");
    /**
     * Tag of totems.
     */
    public static final @NotNull TagKey<Item> Totems = ITKC("c", "totems");
    /**
     * Tag of backpacks.
     */
    public static final @NotNull TagKey<Item> Backpacks = ITKC("c","backpacks");
    /**
     * Tag of Traveler's Backpack backpacks.
     */
    public static final @NotNull TagKey<Item> TravelersBackpacks = ITKC("travelersbackpack","custom_travelers_backpack");
    /**
     * Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> SpikySpikes = ITKC("spikyspikes","spiky_spikes");
    /**
     * Enchantable Spiky Spikes.
     */
    public static final @NotNull TagKey<Item> EnchantableSpikySpikes = ITKC("spikyspikes","enchantable_spiky_spikes");
    /**
     * Miscellaneous enchantables.
     */
    public static final @NotNull TagKey<Item> MiscEnchantables = ITKC("c","misc_enchantables");
}
