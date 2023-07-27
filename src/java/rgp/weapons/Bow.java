package rgp.weapons;

public class Bow implements Weapon {
    private String name;
    private int damage;

    @Override
    public int getDamage() {
        return this.damage;
    }

    public Bow(WeaponName name, int damage) {
        this.damage = damage;
        this.name = name.getName();
    }

    public Bow() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(WeaponName name) {
        this.name = name.getName();
    }
}
