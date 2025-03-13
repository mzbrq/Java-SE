public class Mouse implements IUSB {

    @Override
    public void openServise() {
        System.out.println("打开鼠标USB");
    }

    @Override
    public void closeServise() {
        System.out.println("关闭鼠标USB");
    }

    public void click() {
        System.out.println("点击鼠标");
    }
}
