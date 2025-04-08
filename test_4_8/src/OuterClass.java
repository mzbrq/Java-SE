public class OuterClass {
    //外部类成员属性
    private int value = 111;
    private int outerValue1 = 10;
    private static int outerValue2 = 100;

    //成员内部类
    class InnerClass {
        private int innerValue1 = 20;
        private int value = 222;

        public void print() {
            //访问外部类成员属性
           /* System.out.println("外部类成员属性：" + outerValue1);
            System.out.println("外部类静态成员属性：" + outerValue2);
            //访问内部类成员属性
            System.out.println("============================");
            System.out.println("内部类成员属性：" + innerValue1);*/
            //就近原则：优先访问内部类
            System.out.println(value);

            //访问外部类中，同名的成员属性
            System.out.println(OuterClass.this.value);
        }
    }

    public static void main(String[] args) {
        //先实例化外部类对象
        OuterClass outerClass = new OuterClass();
        //成员内部类，依赖于外部类对象
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();
    }
}
