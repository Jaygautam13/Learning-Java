package Array;

import java.util.Scanner;

public class question_3 {

    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int maxdigit = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxdigit) {
                maxdigit=arr[i];
                
            }
            
        }
        System.out.println(maxdigit);
       
    }
}