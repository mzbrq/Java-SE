import java.util.Arrays;

public class Test {
    public static int[] meger(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k] = nums2[j--];
            } else {
                nums1[k] = nums1[i--];
            }

            k--;
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

        return nums1;
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 7, 0, 0, 0, 0};
        int[] arr2 = new int[] {2, 4, 6, 8};

        int len1 = arr1.length;
        int len2 = arr2.length;

        int[] ret = meger(arr1, len1-len2, arr2, len2);
        System.out.println(Arrays.toString(ret));

    }
}
