package io.github.gameking1happy.gk1htags.packs;

import io.github.gameking1happy.gk1hcore.packs.AddPacks;
import org.jetbrains.annotations.NotNull;

import static io.github.gameking1happy.gk1hcore.packs.AddPackPreset.addCdp;
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
        if (neted) {
            addCdp(modContainerOrEvent, getModID(), "netherited");
        }
        if (access) {
            addCdp(modContainerOrEvent, getModID(), "accessories");
        }
        else {
            if (curi) {
                addCdp(modContainerOrEvent, getModID(), "curios");
            }
            if (trink) {
                addCdp(modContainerOrEvent, getModID(), "trinkets");
            }
        }
        if (reinfShu) {
            addCdp(modContainerOrEvent, getModID(), "reinfshulker");
        }
        if (spiSpi) {
            addCdp(modContainerOrEvent, getModID(), "spikyspikes");
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
