package com.dndcharacters.s1project;

import java.awt.Font;

/** Class containing all fundamental constants of the program e.g. fonts, enums with set game types, etc. */
@SuppressWarnings("unused")
public class Constants {
    /** Font object for labels */
    public static Font labels = new Font("Serif", Font.BOLD, 20);
    /** Font object for buttons */
    public static Font buttons = new Font("Serif", Font.BOLD, 30);
    /** Title font */
    public static Font titleFont = new Font("DialogInput", Font.BOLD, 90);

    /** Defines every race in D&D, used for the races JComboBox in Sheet1Panel */
    public enum Races {
        Aarakocra,
        Aasimar,
        FallenAasimar,
        ProtectorAasimar,
        ScourgeAasimar,
        Bugbear,
        Bullywug,
        Centaur,
        Changeling,
        DEFAULT,
        Dhampir,
        Dragonborn,
        ChromaticDragonborn,
        DraconbloodDragonborn,
        GemDragonborn,
        MetallicDragonborn,
        RaveniteDragonborn,
        DuergarDwarf,
        HillDwarf,
        MarkOfWardingDwarf,
        MountainDwarf,
        DrowElf,
        EladrinElf,
        HighElf,
        MarkOfShadowElf,
        PallidElf,
        SeaElf,
        ShadarKaiElf,
        WoodElf,
        Fairy,
        Firbolg,
        AirGenasi,
        EarthGenasi,
        WaterGenasi,
        GithyankiGith,
        GithzeraiGith,
        Gnoll,
        DeepGnome,
        DeepSvirfneblinGnome,
        ForestGnome,
        MarkOfScribingGnome,
        RockGnome,
        Goblin,
        DankwoodGoblin,
        Goliath,
        Grimlock,
        Grung,
        HalfElf,
        AquaticHalfElf,
        DrowHalfElf,
        MarkOfDetectionHalfElf,
        MarkOfStormHalfElf,
        MoonHalfElf,
        SunHalfElf,
        WoodHalfElf,
        HalfOrc,
        MarkOfFindingHalfOrc,
        GhostwiseHalfling,
        LightfootHalfling,
        LotusdenHalfling,
        MarkOfHealingHalfling,
        MarkOfHospitalityHalfling,
        StoutHalfling,
        Harengon,
        Hexblood,
        Hobgoblin,
        Human,
        MarkOfFindingHuman,
        MarkOfHandlingHuman,
        MarkOfMakingHuman,
        MarkOfPassageHuman,
        MarkOfSentinelHuman,
        Kalashtar,
        Kenku,
        Kobold,
        Leonin,
        Lizardfolk,
        Locathah,
        Loxodon,
        Minotaur,
        Orc,
        Owlin,
        Reborn,
        Satyr,
        BeasthideShifter,
        LongtoothShifter,
        SwiftstrideShifter,
        WildhuntShifter,
        SimicHybrid,
        Skeleton,
        Tabaxi,
        Tiefling,
        AsmodeusTiefling,
        BaalzebulTiefling,
        DispaterTiefling,
        FiernaTiefling,
        GlasyaTiefling,
        LevistusTiefling,
        MammonTiefling,
        MephistophelesTiefling,
        DevilsTongueTiefling,
        HellfireTiefling,
        InfernalTiefling,
        WingedTiefling,
        ZarielTiefling,
        Tortle,
        Triton,
        Troglodyte,
        Vedalken,
        Verdan,
        Warforged,
        YuantiPureblood,
        Zombie
    }

    /** Defines all D&D skills, used in serialization of the skills ArrayList in Sheet1Fields */
    public enum Skills {
        Acrobatics,
        AnimalHandling,
        Arcana,
        Athletics,
        Deception,
        History,
        Insight,
        Intimidation,
        Investigation,
        Medicine,
        Nature,
        Perception,
        Performance,
        Persuasion,
        Religion,
        SleightOfHand,
        Stealth,
        Survival
    }

    /** Defines all alignments, used in adding options to alignment JComboBox in Sheet1Panel */
    public enum Alignment {
        LawfulGood,
        LawfulNeutral,
        LawfulEvil,
        NeutralGood,
        TrueNeutral,
        NeutralEvil,
        ChaoticGood,
        ChaoticNeutral,
        ChaoticEvil
    }

    /** Defines all damage types, used in adding options to damage type JComboBoxes in Sheet1Panel */
    public enum DamageTypes {
        Acid,
        Bludgeoning,
        Cold,
        Fire,
        Force,
        Lightning,
        Necrotic,
        Piercing,
        Poison,
        Psychic,
        Radiant,
        Slashing,
        Thunder
    }

    /** Defines all character classes, used in adding options to class JComboBox in Sheet1Panel */
    public enum Classes {
        Barbarian,
        Bard,
        Cleric,
        Druid,
        Fighter,
        Monk,
        Paladin,
        Ranger,
        Rogue,
        Sorcerer,
        Warlock,
        Wizard
    }

    /** Defines all types of abilities, used in serialization of the ability ArrayList in Sheet1Fields */
    public enum Ability {
        Strength,
        Dexterity,
        Constitution,
        Intelligence,
        Wisdom,
        Charisma
    }

    /** Defines all currency types, used in serialization of the ability ArrayList in Sheet1Fields */
    public enum CurrencyType {
        Copper,
        Silver,
        Electrum,
        Gold,
        Platinum
    }
}