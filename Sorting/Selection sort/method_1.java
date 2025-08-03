public class method_1 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 10, -4, 20, 1, -6, 8 };

        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        print(arr);

    }
}
