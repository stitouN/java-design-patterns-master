
package com.iluwatar.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * ElfArmy.
 */
public class ElfArmy implements Army, ArmyMembers {

  static final String DESCRIPTION = "This is the elven army!";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }

  @Override
  public List<String> getMembers() {
    return null;
  }
}
