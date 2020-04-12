package ringo.day11.demo06;

public class Run {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("霜之哀伤");

        Hero hero = new Hero("伊利丹", 288, weapon);

        System.out.println(hero.getWeapon().getCode());

        hero.attack();
    }
}
