package rgp.armors;

public class HeavyArmor implements Armor {
    private int defenceInterests;

    @Override
    public int getDefenceInterests() {
        return this.defenceInterests;
    }

    public HeavyArmor(int defenceInterests) {
        this.defenceInterests = defenceInterests;
    }

    @Override
    public int getSavedHealth(int warriorHealth, int weaponDamage) {
        int reduceDamage = (weaponDamage - ((this.defenceInterests * weaponDamage) / 100));
        return warriorHealth - reduceDamage;
    }
}
