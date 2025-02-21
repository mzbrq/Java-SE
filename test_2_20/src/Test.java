import java.util.Scanner;


public class Test {

    private int count;

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }*/
        Test test = new Test(88);
        System.out.println(test.count);
    }

    //构造方法
    public Test(int x) {
        count = x;
    }

}

class Data {

    private int x;
    private int y;

    public Data(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
