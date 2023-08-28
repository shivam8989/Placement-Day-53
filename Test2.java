import java.util.*;
public class Test2 {


    public static void main(String[] args) {
       int arr [] = {1,2,3,4,5};
       int aa [] = {6,7,8};
       int sum = arr.length+aa.length;
       int hh [] = new int[sum];
        System.arraycopy(arr, 0, hh, 0, arr.length);
        System.arraycopy(aa, 0, hh, arr.length, aa.length);

        System.out.println(Arrays.toString(hh));

        }
}
