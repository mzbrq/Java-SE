package demo3;

class Monney {
    int m = 100;

}
public class Person implements Cloneable{
    String name;
    public Monney monney  = new Monney();
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.monney = (Monney) this.monney.clone();
        return tmp;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", monney=" + monney +
                ", age=" + age +
                '}';
    }
}
