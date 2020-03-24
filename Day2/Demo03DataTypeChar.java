public class Demo03DataTypeChar{
    public static void main(String[] args) {
        char zifu1 = '1';
        System.out.println(zifu1+0); // '1'-->49

        char zifu3 = 'c';
        int num =zifu3; // char-->int
        System.out.println(num); // 'c'-->99

        char zifu4 = '中'; // 正确写法
        System.out.println(zifu4 + 0); // '中'-->20013
    }
}