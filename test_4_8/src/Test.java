public class Test {
    public static void main(String[] args) {
        //静态代码块只在类加载时被执行
        //实例代码块在对象创建时，被执行
        Student stu1 = new Student();
        System.out.println("===================");
        Student stu2 = new Student();
    }
}


