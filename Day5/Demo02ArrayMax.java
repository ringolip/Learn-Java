package ringo.day05.demo03;

public class Demo02ArrayMax {
    public static void main(String[] args) {
        // 求数组中的最大值
        int[] arrayA = new int[] {10, 44, 23, 77, 55, 3};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] > max) {
                max = arrayA[i];
            }
        }
        System.out.println("数组最大值为：" + max);

        // 求数组中的最小值
        int min = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            if (arrayA[i] < min) {
                min = arrayA[i];
            }
        }
        System.out.println("数组最小值为；" + min);
    }
}
