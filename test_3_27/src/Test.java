import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        int len1 = s1.length();
        int len2 = s2.length();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for (int i = 0; i < len2; i++) {
            for (int j = 0; j < len1; j++) {
                if (arr1[j] == arr2[i]) {
                    //删除arr1中的元素
                    int k = i;
                    while (k < len1-1) {
                        arr1[k] = arr1[k+1];
                        k++;
                    }
                    len1--;
                }
            }
        }

        String result = new String(arr1);
        String ret = result.substring(0, len1);
        System.out.println(ret);
    }
}
