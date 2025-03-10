public class Computer{
    //开机
    public void powerOn() {
        System.out.println("开机");
    }

    //关机
    public void powerOff() {
        System.out.println("关机");
    }

    //使用USB设备
    public void useUsbDevise(IUSB iusb) {
        iusb.openDevise();

        if (iusb instanceof Mouse) {
            Mouse mouse = (Mouse) iusb;
            mouse.click();
        } else if (iusb instanceof Keyboard) {
            Keyboard kd = (Keyboard) iusb;
            kd.input();
        }

        iusb.closeDevise();
        System.out.println("=================");
    }
}
