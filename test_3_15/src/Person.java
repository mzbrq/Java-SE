public class Person implements Cloneable{
    Money money = new Money();
   int id;
   int age;

    public Person(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person tmp = (Person) super.clone();
        tmp.money = (Money) this.money.clone();
        return tmp;
    }


}
