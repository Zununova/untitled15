import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(80);
        boss.setType("Barrier");
        System.out.println(boss.getHealth() +" "+ boss.getDamage() +" "+ boss.getType());

        for (int i = 0; i < 1; i++) {
            System.out.println(Arrays.asList(createHeroes()));
        }


    }
    public static String[] createHeroes (){

        Hero hero1 = new Hero(200, 34);
        Hero hero2 = new Hero(300, "Sword", 50);
        Hero hero3 = new Hero(250, 30);
        int heroesHealth[] = {hero1.getHealth(), hero2.getHealth(),hero3.getHealth()};
        int heroesDamage[] ={hero1.getDamage(), hero2.getDamage(), hero3.getDamage()};
        String heroesPowers[] ={hero1.getPower(),hero2.getPower(),hero3.getPower()};
        String heroes [] ={Arrays.toString(heroesHealth), Arrays.toString(heroesDamage), Arrays.toString(heroesPowers)};

        return  heroes;

    }

}