public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person(123, 19);
        Person person2 = (Person) person1.clone();

        /*System.out.println(person1.id);
        System.out.println(person1.age);
        System.out.println(person2.id);
        System.out.println(person2.age);

        //修改person1中的信息
        person1.age = 100;
        person1.id = 1111;

        System.out.println(person1.id);
        System.out.println(person1.age);
        System.out.println(person2.id);
        System.out.println(person2.age);*/

        System.out.println("=====================");

        //修改Money中的信息(此时为浅拷贝)
        System.out.println(person2.money.m);
        person1.money.m = 1000;
        System.out.println(person2.money.m);

        //解决方法：重写Person中的clone方法


    }
}
