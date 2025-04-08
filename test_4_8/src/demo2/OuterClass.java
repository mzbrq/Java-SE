package demo2;

public class OuterClass {
    private int a = 10;

    //外部类方法
    public void outerMethod() {
        int b = 20;


        //局部内部类
        class InnerClass {

            private int c = 200;
            public void innerMethod() {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }

        //只能在外部类方法中使用
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }

    public static void main(String[] args) {
      OuterClass outerClass = new OuterClass();
      outerClass.outerMethod();

    }
}
