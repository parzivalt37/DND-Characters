package com.dndcharacters.s1project;

import java.io.Serializable;

public class Records {
    public record Ability(Constants.Ability a, String abilityValue, String modifierValue, String savingThrowValue) implements Serializable {}

    public record Attack(String attackName, String attackBonus, Constants.DamageTypes type) implements Serializable {}

    public record Currency(String currencyValue) implements Serializable {}

    public record Skill(String skillValue) implements Serializable {}

}