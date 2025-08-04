public class bubblesort {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args)
    {//method 1 
        int[] arr = { 3, 1, 2, 5, 4 };
        print(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        print(arr);
        System.out.println();
        // method 2 
        int[] arr1 = { 5,8,1,3,8,10};
        print(arr1);
        for (int j = 0; j < arr1.length; j++) {
            for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;
            }
           
        }
             
        }
         print(arr1);
        
       
    }
}
