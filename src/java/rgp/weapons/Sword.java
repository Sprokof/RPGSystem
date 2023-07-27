package rgp.weapons;

public class Sword implements Weapon {
    private String name;
    private int damage;

    @Override
    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return name;
    }

    public Sword(WeaponName name, int damage) {
        this.name = name.getName();
        this.damage = damage;
    }

    public Sword() {
    }

    @Override
    public void setName(WeaponName name) {
        this.name = name.getName();
    }
}
