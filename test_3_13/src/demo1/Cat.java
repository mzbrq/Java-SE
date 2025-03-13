package demo1;

public class Cat extends Animal implements IRunning {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void Run() {
        System.out.println(name + "小猫在跑");
    }
}
