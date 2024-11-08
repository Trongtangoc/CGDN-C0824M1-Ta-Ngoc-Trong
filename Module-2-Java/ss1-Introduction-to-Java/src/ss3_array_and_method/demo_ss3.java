package ss3_array_and_method;

import java.util.Arrays;

public class demo_ss3 {
    public static boolean isPrime(int n) {
        if( n < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        demo_ss3 isPrime = new demo_ss3();
        int[] arr = {5,6};
        demo_ss3.Swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }
}
