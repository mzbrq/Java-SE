package demo3;

interface A {
    void methodA();
}

public class OuterClass{
    private static int a = 10;

    public static void main(String[] args) {
        int value = 10;
        //
        //value = 100;
        //匿名内部类
        //写法一
        A a1 = new A() {
            @Override
            public void methodA() {
                //匿名内部类中，能够访问的是，没有被修改过的数据，称为变量捕获
                System.out.println("value: " + value);
            }
        };

        a1.methodA();

        System.out.println("=========================");

        //写法二
        new A() {
            @Override
            public void methodA() {
                System.out.println("写法二");
                System.out.println("重写接口A中的方法");
            }
        }.methodA();
    }
}
