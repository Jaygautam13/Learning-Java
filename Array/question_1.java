package Array;

public class question_1 {
    public static void main(String[] args) {
        int sum  = 0;
        int [] arr = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<35) {
                System.out.println("your student numbers :"+arr[i]+" and idex is :"+i);
                
                
            }
         sum = sum+arr[i];
            
        }
        System.out.println("Your sum is : "+ sum);
        

    }
    
}
