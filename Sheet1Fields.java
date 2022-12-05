import java.io.Serializable;

public class Sheet1Fields implements Serializable {

    private String classLevel;
    private String background;
    private String pName;
    private String cName;
    //race record?

    //[strength, dexterity, constitution, intelligence, wisdom, charisma]
    private ArrayList<Integer> attributes;

    //same order as attributes
    private ArrayList savingThrows;

    //Acrobatics, animalhandling, arcana, athletics, deception, history,
    //insight, intimidation, investigation, medicine, nature, perception,
    //performance, persuasion, religion, sleight of hand, stealth, survival
    private ArrayList skills;

    //inspiration
    //proficiencybonus
    //armorclass
    //initiative
    //speed
    private ArrayList hp;
    private ArrayList attacks;
    private ArrayList equipment;

    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;
    private String features&Traits;
    //passive wisdom
    private String otherProficiencies;
    //equipment


}