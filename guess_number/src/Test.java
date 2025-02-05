import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //猜数字

        //生成随机数
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int randNum = random.nextInt(101); // 左闭右开:[0,101)

        while (true) {
            //输入数据
            int num = scan.nextInt();

            if (num > randNum) {
                System.out.println("猜大了");
            }else if (num == randNum) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜小了");
            }

        }

        scan.close();
    }
}
