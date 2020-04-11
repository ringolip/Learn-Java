package ringo.day11.demo03;

public class Body {
    // 成员内部类
    public class Heart {
        // 内部类的方法
        public void methodHeart() {
            System.out.println("内部类的方法");
            System.out.println("我叫：" + name);
        }

    }

    // 外部类的成员变量
    private String name;

    // 外部类的方法
    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().methodHeart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
