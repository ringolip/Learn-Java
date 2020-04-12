package ringo.day11.demo07;

public class Run {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("麦迪文");
        hero.setAge(255);

        // 同时使用匿名内部类和内部对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.print("biu~biu~biu");
            }
        });

        hero.attack();
    }
}
