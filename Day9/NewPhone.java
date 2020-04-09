package ringo.day09.demo06;


public class NewPhone extends Phone {

    // Override父类的show()方法
    @Override
    public void show() {
        super.show(); // 调用父类已存在的功能
        System.out.println("显示来电人信息");
        System.out.println("是否接通？");
    }

}
