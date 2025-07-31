package Array;

import java.util.Scanner;

public class question_2 {
    public static void main(String[] args) {
        
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your search number : ");
        target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                System.out.println("your number is :" +arr[i] + " your search number index : " +i);
                
            }
               
}
    }
}
