public class Boss {
    private int health;
    private  int damage;
    private String type;
    // getters

    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getType() {
        return type;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
}
