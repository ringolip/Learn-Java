package ringo.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        // 将数组作为方法的参数
        int[] array = new int[]{10, 20, 30, 40, 50};
        printArray(array);
        System.out.println("========");
        printArray(array);
    }
    public static void printArray(int[] array) {
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
