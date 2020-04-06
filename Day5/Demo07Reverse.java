package ringo.day05.demo03;

public class Demo07Reverse {
    public static void main(String[] args) {
        // 反转数组
        int[] array = new int[] {10, 20, 30, 40, 50};
        int temp; // 临时变量

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            // 交换元素位置
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
