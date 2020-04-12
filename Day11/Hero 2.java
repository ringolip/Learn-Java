package ringo.day11.demo07;


// 使用接口作为成员变量
public class Hero {
    private String name;
    private int age;
    private Skill skill; // 角色技能

    // 构造方法
    public Hero() {
    }

    public Hero(String name, int age, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    // 角色攻击
    public void attack() {
        System.out.print(this.name + "使用技能");
        this.skill.use();
        System.out.println("攻击敌方");
    }
}
