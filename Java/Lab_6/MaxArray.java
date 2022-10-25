package Lab_6;

import java.util.Arrays;

public class MaxArray {
    public static <T> T array_max(T data[], int n) {
        Arrays.sort(data);  
        return data[n-1];  
    }
    public static void main(String[] args) {
        Integer arr_i[] = {2,8,20,3,4};
        int arr_i_size = arr_i.length;
        int largest_int  = array_max(arr_i, arr_i_size);
        System.out.println("INT ARRAY: "+largest_int);

        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
        int arr__d_size = arr_d.length;
        double largest_double  = array_max(arr_d, arr__d_size);
        System.out.println("DOUBLE ARRAY: "+largest_double);
    }
}
