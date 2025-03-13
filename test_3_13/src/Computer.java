public class Computer {
    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    public void useUSB(IUSB iusb) {
        iusb.openServise();

        if (iusb instanceof Mouse) {
            Mouse mouse = (Mouse) iusb;
            mouse.click();
        } else if (iusb instanceof Keyboard) {
            Keyboard kb = (Keyboard)iusb;
            kb.input();
        }

        iusb.closeServise();
    }
}
