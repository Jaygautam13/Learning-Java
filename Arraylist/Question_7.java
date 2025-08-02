package Arraylist;

public class Question_7
 {
    public static void maxsubarraysum(int arr[]) {
        int sum = 0 ;
        int cursum = 0 ;
        int maxsum = Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                cursum = 0 ;
                for (int k = i; k <= j; k++) {
                 cursum +=  arr[k];   
                }
                System.out.println(cursum);
                if (maxsum<cursum) {
                 maxsum = cursum;
                    
                }
              
            }
           
        }
        System.out.println(maxsum);
        
    }
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        maxsubarraysum(arr);
    }
}
