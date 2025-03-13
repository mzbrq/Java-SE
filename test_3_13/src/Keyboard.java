public class Keyboard implements IUSB {

    @Override
    public void openServise() {
        System.out.println("打开键盘USB");
    }

    @Override
    public void closeServise() {
        System.out.println("关闭键盘USB");
    }

    public void input() {
        System.out.println("键盘输入");
    }
}
