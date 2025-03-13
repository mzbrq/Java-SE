package demo3;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("小明", 22);
        Person person2 = (Person) person1.clone();

        person1.age = 111;
        person1.monney.m = 2222;
        //修改person1 m 的值，发现person2 中m的值也被修改
        System.out.println(person1.monney.m);
        System.out.println(person2.monney.m);
    }
}
