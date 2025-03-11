package demo1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//比较器：按年龄比较
class Agecomparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}

//比较器：按名字比较
class  Namecomparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Test {

    public static void main(String[] args) {
        Student stu1 = new Student("zhangsan", 20);
        Student stu2 = new Student("lisi", 29);

        Comparator Agecomparator = new Agecomparator();
        System.out.println(Agecomparator.compare(stu1, stu2));
        Comparator Namecomparator = new Namecomparator();
        System.out.println(Namecomparator.compare(stu1, stu2));


    }
    public static void bubblesort(Comparable[] comparables) {
        for (int i = 0; i < comparables.length-1; i++) {
            for (int j = 0; j < comparables.length-i-1; j++) {
                if (comparables[j].compareTo(comparables[j+1]) > 0) {
                    Comparable tmp = comparables[j];
                    comparables[j] = comparables[j+1];
                    comparables[j+1] = tmp;
                }
            }
        }
    }
    public static void main1(String[] args) {
       /* Student stu1 = new Student("zhangsan", 20);
        Student stu2 = new Student("lisi", 22);

        System.out.println(stu1.compareTo(stu2));*/

        Student[] students = new Student[5];

        students[0] = new Student("zhangsna", 20);
        students[1] = new Student("lisi", 100);
        students[2] = new Student("wangwu", 10);
        students[3] = new Student("xiaoming", 90);
        students[4] = new Student("xiaohong", 80);

        bubblesort(students);

        System.out.println(Arrays.toString(students));

        //Arrays.sort(students);

        //System.out.println(Arrays.toString(students));

    }

}
