package rgp;

import rgp.armors.HeavyArmor;
import rgp.armors.LightArmor;
import rgp.warriors.Archer;
import rgp.warriors.Swordsman;
import rgp.weapons.Bow;
import rgp.weapons.Sword;
import rgp.weapons.WeaponName;

public class Game {
    public static void main(String[] args) {
        Archer archer = new Archer("Robin", 230, 50,
                new Bow(WeaponName.BOW, 70), new LightArmor(10));
        Swordsman swordsman = new Swordsman("Arthur", 400, 100,
                new Sword(WeaponName.SWORD, 100), new HeavyArmor(15));

        while(archer.getHealth() > 0 && swordsman.getHealth() > 0){

            archer.attack(swordsman);
            System.out.println(archer.getName() + " attack " + swordsman.getName());
            System.out.println(swordsman.getName() + " health is " + swordsman.getHealth());

            if(swordsman.getHealth() > 0){
                swordsman.attack(archer);
                System.out.println(swordsman.getName() + " attack " + archer.getName());
                System.out.println(archer.getName() +  " health is " + archer.getHealth());

            }

            if(archer.getHealth() > 0){
                archer.shot(swordsman);
                System.out.println(archer.getName() + " shot " + swordsman.getName());
                System.out.println(swordsman.getName() + " health is " + swordsman.getHealth());
            }
        }
    }
}
