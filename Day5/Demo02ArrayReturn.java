package ringo.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        // 将数组作为方法的返回值
        int[] array = new int[]{10, 20, 30, 40, 50};

        System.out.println("数组地址：" + array);
        int[] funcArray = calculate(array);
        System.out.println("方法的返回值：" + funcArray);
        System.out.println("数组所有元素的总和：" + funcArray[0]);
        System.out.println("数组所有元素的平均值：" + funcArray[1]);
    }

    public static int[] calculate(int[] array) {
        System.out.println("传进方法的参数：" + array);

        // 计算数组的平均数和总和
        int sum = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;

        int[] funcArray = new int[]{sum, average};
        System.out.println("方法返回的数组地址：" + funcArray);
        return funcArray;
    }
}
