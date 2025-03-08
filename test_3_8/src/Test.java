public class Test {

    public static void eat(Animal animal) {
        animal.eat();
    }
    public static void main(String[] args) {
        //向上转移
        Animal animal1 = new Cat("小猫", 1);
        Animal animal2 = new Dog("小狗", 2);

        eat(animal1); //
        eat(animal2);
        //animal1.miaomiao(); //无法调用子类特用的方法

        //向下转型

        /*Cat cat = (Cat)animal1;
        cat.miaomiao();*/
    }
}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat() {
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃猫粮");
    }

    public void miaomiao() {
        System.out.println("猫猫叫");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃狗粮");
    }
}
