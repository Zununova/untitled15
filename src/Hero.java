public class Hero {
    private int health;
    private int damage;
    private  String power;
    // getters
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public String getPower() {
        return power;
    }
    // constructs
    public  Hero (int health, String power, int damage ){
        this. health=health;
        this. damage=damage;
        this. power = power;
    }
    public Hero   (int health, int damage ){
        this. health = health;
        this. damage = damage;
    }
}
