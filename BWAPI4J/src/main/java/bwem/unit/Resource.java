package bwem.unit;

import bwem.map.Map;
import org.openbw.bwapi4j.unit.MineralPatch;
import org.openbw.bwapi4j.unit.Unit;
import org.openbw.bwapi4j.unit.VespeneGeyser;

public class Resource extends Neutral {

    private final int initialAmount;

    public Resource(Unit unit, Map map) {
        super(unit, map);

//        bwem_assert(Type().isMineralField() || (Type() == Resource_Vespene_Geyser));
        if (super.getUnit() instanceof MineralPatch) {
            MineralPatch patch = (MineralPatch) super.getUnit();
            this.initialAmount = patch.getInitialResources();
        } else if (super.getUnit() instanceof VespeneGeyser) {
            VespeneGeyser geyser = (VespeneGeyser) super.getUnit();
            this.initialAmount = geyser.getInitialResources();
        } else {
            throw new UnsupportedOperationException("unsupported resource type");
        }
    }

    // Returns the initial amount of ressources for this Ressource (same as Unit()->getInitialResources).
    public int getInitialAmount() {
        return this.initialAmount;
    }

    // Returns the current amount of ressources for this Ressource (same as Unit()->getResources).
    public int getAmount() {
        if (super.getUnit() instanceof MineralPatch) {
            MineralPatch patch = (MineralPatch) super.getUnit();
            return patch.getResources();
        } else if (super.getUnit() instanceof VespeneGeyser) {
            VespeneGeyser geyser = (VespeneGeyser) super.getUnit();
            return geyser.getResources();
        } else {
            throw new UnsupportedOperationException("unsupported resource type");
        }
    }

}