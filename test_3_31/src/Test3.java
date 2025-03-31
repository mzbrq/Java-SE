public class Test3 {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int ret = nums[0];
        for (int i = 1; i < len; i++) {
            ret ^= nums[i];
        }

        for (int j = 0; j <= len; j++) {
            ret ^= j;
        }

        return ret;

    }
}
