import book.BookCase;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    //返回值使用父类，发生向上转型
    public static User login() {
        System.out.println("请输入名字");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();

        System.out.println("请选择身份");
        System.out.println("1 --> 管理员");
        System.out.println("0 --> 普通用户");

        Scanner scan2 = new Scanner(System.in);
        int option = scan2.nextInt();
        if (option == 1) {
            //管理者
            return new AdminUser(name);
        } else{
            //普通用户
            return new NormalUser(name);
        }

    }
    public static void main(String[] args) {
        BookCase bookCase = new BookCase();

        // user + ret = 知道调用哪个用户的哪个方法
        User user = login(); // 使用父类接收，向上转型，
        while (true) {
            int choice = user.menu(); //向上转型：不能调用子类特有的方法，所以在父类中定义menu方法，子类重写
            user.doOperation(choice, bookCase);
        }
    }
}
