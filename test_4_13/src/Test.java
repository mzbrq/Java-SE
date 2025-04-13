public class Test {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ret.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>();

            //第一列
            curRow.add(1);
            //中间列
            for (int j = 1; j < i; j++) {
                List<Integer> prevRow = ret.get(i-1);
                int val = prevRow.get(j) + prevRow.get(j-1);
                curRow.add(val);
            }

            //最后一列
            curRow.add(1);

            ret.add(curRow);

        }

        return ret;

    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;


        while (i >= 0 && j >= 0) {
            if (nums2[j] > nums1[i]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }

            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }


    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;

        if (nums.length == 0) {
            return 0;
        }

        while (fast < nums.length) {
            if (nums[fast] != nums[fast-1]) {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            } else {
                fast++;
            }
        }

        return slow;
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;
        int len = nums.length;

        while (fast < len) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
                fast++;
            } else {
                fast++;
            }
        }

        return slow;
    }
}
