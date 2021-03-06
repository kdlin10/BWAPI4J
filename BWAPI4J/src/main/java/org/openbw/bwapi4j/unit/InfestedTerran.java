////////////////////////////////////////////////////////////////////////////////
//
//    Copyright (C) 2017-2018 OpenBW Team
//
//    This file is part of BWAPI4J.
//
//    BWAPI4J is free software: you can redistribute it and/or modify
//    it under the terms of the Lesser GNU General Public License as published
//    by the Free Software Foundation, version 3 only.
//
//    BWAPI4J is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with BWAPI4J.  If not, see <http://www.gnu.org/licenses/>.
//
////////////////////////////////////////////////////////////////////////////////

package org.openbw.bwapi4j.unit;

import static org.openbw.bwapi4j.type.UnitCommandType.Burrow;
import static org.openbw.bwapi4j.type.UnitCommandType.Unburrow;

import org.openbw.bwapi4j.type.UnitType;

public class InfestedTerran extends MobileUnitImpl implements Organic, Burrowable, GroundAttacker {
  protected InfestedTerran(int id) {
    super(id, UnitType.Zerg_Infested_Terran);
  }

  @Override
  public boolean burrow() {
    return issueCommand(this.id, Burrow, -1, -1, -1, -1);
  }

  @Override
  public boolean unburrow() {
    return issueCommand(this.id, Unburrow, -1, -1, -1, -1);
  }

  @Override
  public boolean isBurrowed() {
    return this.burrowed;
  }

  @Override
  public Weapon getGroundWeapon() {
    return groundWeapon;
  }

  @Override
  public int getGroundWeaponMaxRange() {
    return super.getGroundWeaponMaxRange();
  }

  @Override
  public int getGroundWeaponMaxCooldown() {
    return super.getGroundWeaponMaxCooldown();
  }

  @Override
  public int getGroundWeaponCooldown() {
    return super.getGroundWeaponCooldown(this);
  }

  @Override
  public int getGroundWeaponDamage() {
    return super.getGroundWeaponDamage();
  }

  @Override
  public int getMaxGroundHits() {
    return super.getMaxGroundHits();
  }
}
