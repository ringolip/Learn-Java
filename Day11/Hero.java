package ringo.day11.demo06;

public class Hero {
    // 成员变量
    private String name;
    private int age;
    protected Weapon weapon;


    // 构造方法
    public Hero() {
    }

    public Hero(String name, int age, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
    }


    // 使用武器攻击
    public void attack() {
        System.out.println("英雄" + this.name + "，年龄" + this.age + "\n使用武器：" + this.weapon.getCode());
    }


    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
