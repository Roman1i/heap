public class heap {
    public static void main(String[] args) {
        int[] nums = {2, 3, 7, 1, 4, 8, 5, 0, 9, 6};
        _print(nums);
        sort(nums);
        _print(nums);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;

            heapify(arr, 0, i);
        }
    }

    public static void heapify(int[] arr, int parent, int n) {
        int left = parent * 2 + 1;
        int right = parent * 2 + 2;
        int largest = parent;

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right; 

        if (largest != parent) {
            int tmp = arr[parent];
            arr[parent] = arr[largest];
            arr[largest] = tmp;

            heapify(arr, largest, n);
        }

    }


    static void _print(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
