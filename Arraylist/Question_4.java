package Arraylist;

import java.util.Arrays;

public class Question_4 {
    public static void main(String[] args) {
        // method 1 
         int [] arr = {1,1,0,0,1,0,1,0,1};
         Arrays.sort(arr);
         for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i]);
         }
         
         System.out.println();
          // method 2 
          int i=0;int j=arr.length-1;
         if (arr[i]==1 && arr[j]==0) 
         {
            while (i<=j) {
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
                
            }
            
         }
         for ( i = 0; i < arr.length; i++) {
            System.out.print( arr [i]);
            
         }

         
    }
    
}
