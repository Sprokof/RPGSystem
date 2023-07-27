package rgp.warriors;

import rgp.armors.Armor;
import rgp.weapons.Bow;
import rgp.weapons.Weapon;
import rgp.weapons.WeaponName;

public class Archer extends Warrior {
    private String name;
    private int health;
    private int damage;
    private Weapon weapon;
    private Armor armor;

    public Archer(String name, int health, int damage, Bow bow, Armor armor) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        correctWeaponType(bow);
        this.armor = armor;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        correctWeaponType(weapon);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void attack(Warrior warrior) {
        int warriorHealth = warrior.getArmor().getSavedHealth(warrior.getHealth(),
                this.damage);
        warrior.setHealth(warriorHealth);
    }

    @Override
    public void shot(Warrior warrior) {
        int warriorHealth = warrior.getArmor().getSavedHealth(warrior.getHealth(),
                this.weapon.getDamage());
        warrior.setHealth(warriorHealth);
    }

    @Override
    void correctWeaponType(Weapon weapon) {
        if (!weapon.getName().equals(WeaponName.BOW.getName())) {
            weapon.setName(WeaponName.BOW);
        }
        this.weapon = weapon;
    }


}
