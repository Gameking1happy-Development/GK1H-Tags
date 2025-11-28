package io.github.gameking1happy.gk1htags.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCDP;
import static io.github.gameking1happy.gk1hcore.compat.CompatFlags.*;
import static io.github.gameking1happy.gk1htags.Main.*;

/**
 * Class to add packs.
 */
@SuppressWarnings("unused")
public class Packs implements AddPacks {
    /**
     * @param modContainerOrEvent ModContainer for Fabric, AddPackFindersEvent for NeoForge.
     */
    public void addPacks(@NotNull Object modContainerOrEvent) {
        if (Neted) {
            addCDP(modContainerOrEvent, getModID(), "netherited");
        }
        if (Access) {
            addCDP(modContainerOrEvent, getModID(), "accessories");
        }
        else {
            if (Curi) {
                addCDP(modContainerOrEvent, getModID(), "curios");
            }
            if (Trink) {
                addCDP(modContainerOrEvent, getModID(), "trinkets");
            }
        }
        if (ReinfShu) {
            addCDP(modContainerOrEvent, getModID(), "reinfshulker");
        }
        if (SpiSpi) {
            addCDP(modContainerOrEvent, getModID(), "spikyspikes");
        }
    }
    /**
     * @return Returns the mod ID.
     */
    @Override
    public @NotNull String getModID() {
        return MOD_ID;
    }
}
