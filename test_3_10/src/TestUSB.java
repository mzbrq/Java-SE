import java.security.Key;

public class TestUSB {

    public static void main(String[] args) {
        Computer computer = new Computer();
        //开机
        computer.powerOn();

        //使用鼠标
        computer.useUsbDevise(new Mouse());

        //使用键盘
        computer.useUsbDevise(new Keyboard());

        //关机
        computer.powerOff();
    }
}
