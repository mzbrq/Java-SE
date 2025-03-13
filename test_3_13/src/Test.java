public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //开机
        computer.powerOn();

        //使用鼠标设备
        computer.useUSB(new Mouse());

        //使用键盘设备
        computer.useUSB(new Keyboard());

        //关机
        computer.powerOff();
    }
}
