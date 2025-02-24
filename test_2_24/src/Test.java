class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

}

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat("xiaomao", 3);
        Animal dog = new Dog("xiaogou", 2);

        cat.eat();
        dog.eat();

    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + "正在吃猫粮");
    }
}

class  Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + "正在吃狗粮");
    }
}