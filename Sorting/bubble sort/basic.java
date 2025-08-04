public class basic {
   
    public static void main(String[] args) {
        int [] arr = {1,7,3,8,9,12};
        for (int i = 0; i < arr.length-1; i++) {
            
        
        if (arr[i]>arr[i+1]) {
            int temp= arr[i];
            arr[i] =arr[i+1];
            arr[i+1]=  temp ;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]+ " ");
    }
}
}


