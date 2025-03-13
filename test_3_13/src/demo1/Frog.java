package demo1;

public class Frog extends Animal implements IAmphibious {
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Run() {
        System.out.println(name + "青蛙在跳");
    }

    @Override
    public void swim() {
        System.out.println(name + "青蛙在用两条腿游泳");
    }
}
