public class Test2 {
    public void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        if (k == n) {
            return;
        }

        if (n == 1) {
            return;
        }
        //逆置后k个
        reverse(nums, n-k, n-1);

        //逆置前n-k个元素
        reverse(nums, 0, n-k-1);

        //整个数组逆置
        reverse(nums, 0, n-1);
    }
}
