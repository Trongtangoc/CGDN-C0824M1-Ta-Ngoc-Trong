package ss1_Introduction_to_java;

import java.util.Arrays;

//access modifier public (bài 5)
public class demo_ss1 {
    //main
    public static void main(String[] args) {
        byte a = 127;
        short b = 127;
        int d = 634632784;
        long c = 127L;
        float f = 37462367F;
        double dou = 78242367d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(c);
        System.out.println(f);
        System.out.println(dou);

        int[] arr = new int[10];
        arr[4] = 5;
        arr[5] = 6;
        System.out.println(Arrays.toString(arr));
//        for (int i: arr){
//            System.out.println(i);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        Arrays.stream(arr).forEach(System.out::println);
//        Arrays.stream(arr).filter(value -> value > 0).forEach(System.out::println);
//        int present = 0;
//        for (int i : arr) {
//            present += i;
//        }
        Arrays.stream(arr).reduce((value, present) -> value + present).ifPresent(System.out::println);
        // Co che ep kieu ngam dinh cua kieu nguyen thuy ()
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }

}
