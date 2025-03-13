package demo1;

public class Duck extends Animal implements IFlying, ISwimming, IRunning {

    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public void fly() {
        System.out.println(name + "鸭子飞了");
    }

    @Override
    public void Run() {
        System.out.println(name + "鸭子跑了");
    }

    @Override
    public void swim() {
        System.out.println(name + "鸭子游了");
    }
}
