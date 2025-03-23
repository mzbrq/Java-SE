public class Tset {
    //判断字符是否合法
    public boolean isLegal(char ch) {
        if (ch >= 'a' && ch <= 'z' ||
                ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int left = 0;
        int right = s1.length()-1;

        while (left < right) {
            while (!(isLegal(s1.charAt(left))) && left < right) {
                left++;
            }

            while (!(isLegal(s1.charAt(right))) && left < right) {
                right--;
            }

            if (s1.charAt(left) != s1.charAt(right)) {
                return false;
            }

            left++;
            right--;

        }

        return true;

    }
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        int len = arr.length;

        return arr[len-1].length();
    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        int length = s.length();

        //遍历字符串,把每个字符出现次数记录到计数数组中
        for (int i = 0; i < length; i++) {
            arr[s.charAt(i) - 'a']++;
        }

        //遍历字符串，在计数数组中找出第一个出现一次的字符
        for (int j = 0; j < length; j++) {
            if (arr[s.charAt(j) - 'a'] == 1) {
                return j;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("1. 找到字符串中第一个出现一次的字符");
        System.out.println("2. 求最后一个单词长度");
        System.out.println("3. 判断是否为回文");
    }
}
