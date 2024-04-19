
package com.iluwatar.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * ElfArmy.
 */
public class ElfArmy implements Army, ArmyMembers {

  static final String DESCRIPTION_ELF = "This is the elven army!";

  @Override
  public String getDescription() {
    return "Description";
  }

  @Override
  public List<String> getMembers() {
    return new ArrayList<>();
  }
}
