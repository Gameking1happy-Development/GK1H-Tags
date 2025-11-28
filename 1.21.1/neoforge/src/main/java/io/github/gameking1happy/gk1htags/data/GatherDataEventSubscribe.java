package io.github.gameking1happy.gk1htags.data;

import io.github.gameking1happy.gk1htags.data.accessories.AccessoriesItemTagsProvider;
import io.github.gameking1happy.gk1htags.data.curios.CuriosItemTagsProvider;
import io.github.gameking1happy.gk1htags.data.netherited.NetheritedItemTagsProvider;
import io.github.gameking1happy.gk1htags.data.reinfshulker.ReinfShulkeritemTagsProvider;
import io.github.gameking1happy.gk1htags.data.spikyspikes.SpikySpikesItemTagsProvider;
import io.github.gameking1happy.gk1htags.data.trinkets.TrinketsItemTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static io.github.gameking1happy.gk1htags.Main.MOD_ID;

/**
 * GatherDataEventSubscribe class for datagen.
 */
@EventBusSubscriber(modid = MOD_ID)
public class GatherDataEventSubscribe {
    /**
     * @param event GatherDataEvent.
     */
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        PackOutput NetheritedOutput = generator.getPackOutput("netherited");
        PackOutput ReinfShulkerOutput = generator.getPackOutput("reinfshulker");
        PackOutput AccessoriesOutput = generator.getPackOutput("accessories");
        PackOutput CuriosOutput = generator.getPackOutput("curios");
        PackOutput TrinketsOutput = generator.getPackOutput("trinkets");
        PackOutput SpikySpikesOutput = generator.getPackOutput("spikyspikes");
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        BlockTagsProvider blockTagsProvider = new MyBlockTagsProvider(output, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new MyItemTagsProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new NetheritedItemTagsProvider(NetheritedOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ReinfShulkeritemTagsProvider(ReinfShulkerOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new AccessoriesItemTagsProvider(AccessoriesOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new CuriosItemTagsProvider(CuriosOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new TrinketsItemTagsProvider(TrinketsOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new SpikySpikesItemTagsProvider(SpikySpikesOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
    }
}