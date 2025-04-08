package dome1;

public class OuterClass {
    //外部类成员属性
    private int outerValue1 = 10;
    private static int outerValue2 = 100;

    //静态内部类
    static class InnerClass {
        //静态内部类成员属性
        private int innerValue1 = 20; //非静态成员
        private static int innerValue2 = 200; // 静态成员

        public void print() {
            //访问外部类成员属性
            /*System.out.println("外部类成员属性：" + outerValue1);
            * 静态内部类中，只能访问外部类的静态成员属性*/
            System.out.println("外部类成员属性：" + outerValue2);
            //在内部类中，访问外部类的非静态成员属性
            OuterClass outerClass = new OuterClass();
            System.out.println("外部类非静态成员属性：" + outerClass.outerValue1);

            System.out.println("====================");

            //访问静态内部类成员属性
            System.out.println("静态内部类成员属性：" + innerValue1);
            System.out.println("静态内部类成员属性：" + innerValue2);
        }
    }

    public static void main(String[] args) {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.print();
       /* //通过静态内部类对象，访问里面的非静态成员变量
        System.out.println(innerClass.innerValue1);
        //通过静态内部类名 . 静态成员变量名 访问静态成员变量
        System.out.println(InnerClass.innerValue2);
        //innerClass.print();*/
    }
}
