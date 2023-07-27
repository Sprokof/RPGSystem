package rgp.weapons;

public enum WeaponName {
    BOW("Bow"),
    SWORD("SWORD");

    private String name;

    WeaponName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
