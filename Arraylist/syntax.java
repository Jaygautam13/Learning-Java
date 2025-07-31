package Arraylist;

import java.util.Arrays;

public class syntax {
    public static void main(String[] args) {
        int [] arr = {10,40,30,5,50,64,101,820,290};
        for (int ele : arr) {
            System.out.println(ele);
            
        }
        System.out.println();
        // sorting funtion in arraylist
        Arrays.sort(arr);
        for (int ele : arr) {
            System.out.println(ele);
            
        }
    }
}
