package rgp.warriors;

import rgp.armors.Armor;
import rgp.weapons.Weapon;

public abstract class Warrior {
    void attack(Warrior warrior){};
    void shot(Warrior warrior){};
    Armor getArmor(){return null;};
    int getHealth(){return 0;};
    void setHealth(int health){};
    void correctWeaponType(Weapon weapon){}
}
