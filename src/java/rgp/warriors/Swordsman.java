package rgp.warriors;

import rgp.armors.Armor;
import rgp.weapons.Sword;
import rgp.weapons.Weapon;
import rgp.weapons.WeaponName;

public class Swordsman extends Warrior {
    private String name;
    private int health;
    private int damage;
    private Weapon weapon;
    private Armor armor;

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Warrior warrior) {
        int warriorHealth = warrior.getArmor().getSavedHealth(warrior.getHealth(), this.damage);
        warrior.setHealth(warriorHealth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        correctWeaponType(weapon);
    }


    public Swordsman(String name, int health, int damage, Sword sword, Armor armor)  {
        this.name = name;
        this.health = health;
        this.damage = damage;
        correctWeaponType(sword);
        this.armor = armor;
    }

    @Override
    void correctWeaponType(Weapon weapon) {
        if (!weapon.getName().equals(WeaponName.SWORD.getName())) {
            weapon.setName(WeaponName.SWORD);
        }
        this.weapon = weapon;
    }

    @Override
    public Armor getArmor() {
        return armor;
    }
}
