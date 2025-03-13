package demo1;

public class Fish extends Animal implements ISwimming {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println(name + "小鱼在游泳");
    }
}
