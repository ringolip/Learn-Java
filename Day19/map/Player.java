package ringo.day19.map;

/**
 * @author ringo
 * @version 1.0
 * @date 2020/4/20 08:37
 */
public class Player {
    private String name;
    private int age;

    public Player() {
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
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
}
