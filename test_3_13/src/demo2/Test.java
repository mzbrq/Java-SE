package demo2;

import javax.naming.Name;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("xiaoming", 24);
        Student student2 = new Student("xiaohong", 23);

        if (student1.compareTo(student2) > 0) {
            System.out.println(">");
        } else if (student1.compareTo(student2) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }

        //使用年龄比较器
        AgeComparator ageComparator = new AgeComparator();
        if (ageComparator.compare(student1, student2) > 0) {
            System.out.println(">");
        } else if (ageComparator.compare(student1, student2) == 0) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }

        //使用名字比较器
        NameComparator nameComparator = new NameComparator();
        System.out.println(nameComparator.compare(student1, student2));


    }
}