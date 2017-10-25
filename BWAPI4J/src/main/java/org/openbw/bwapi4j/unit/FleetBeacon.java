package org.openbw.bwapi4j.unit;

import org.openbw.bwapi4j.type.TechType;
import org.openbw.bwapi4j.type.UnitType;
import org.openbw.bwapi4j.type.UpgradeType;

public class FleetBeacon extends Building implements Mechanical, ResearchingFacility {

    private Researcher researcher;
    
    protected FleetBeacon(int id, int timeSpotted) {
        
        super(id, UnitType.Protoss_Fleet_Beacon, timeSpotted);
        this.researcher = new Researcher();
    }

    @Override
    public void update(int[] unitData, int index) {

        this.researcher.update(unitData, index);
        super.update(unitData, index);
    }
    
	public boolean researchDisruptionWeb() {

		return this.researcher.research(TechType.Disruption_Web);
	}

	public boolean upgradeCarrierCapacity() {

		return this.researcher.upgrade(UpgradeType.Carrier_Capacity);
	}
	
	public boolean upgradeApialSensors() {

		return this.researcher.upgrade(UpgradeType.Apial_Sensors);
	}
	
	public boolean upgradeGraviticThrusters() {

		return this.researcher.upgrade(UpgradeType.Gravitic_Thrusters);
	}
	
	public boolean upgradeArgusJewel() {

		return this.researcher.upgrade(UpgradeType.Argus_Jewel);
	}
	
    @Override
    public boolean isUpgrading() {
        
        return this.researcher.isUpgrading();
    }

    @Override
    public boolean isResearching() {
        
        return this.researcher.isResearching();
    }

    @Override
    public boolean cancelResearch() {
        
        return this.researcher.cancelResearch();
    }

    @Override
    public boolean cancelUpgrade() {
        
        return this.researcher.cancelUpgrade();
    }
}