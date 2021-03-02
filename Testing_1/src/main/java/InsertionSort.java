public class InsertionSort {

    static int[] sortArray(int[] arr) {
        if(arr == null){
            return null;
        }
        int n = arr.length;
        int count = 0;
        int[] new_arr = new int[n];
        System.arraycopy(arr, 0, new_arr, 0, n);
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (new_arr[j] < new_arr[min_idx]) {
                    min_idx = j;
                    count++;
                }
            int temp = new_arr[min_idx];
            new_arr[min_idx] = new_arr[i];
            new_arr[i] = temp;
        }
        System.out.println("Count of swapping element: " + count + "\n");
        return new_arr;
    }

}