import book.Book;
import book.BookCase;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("请输入名字：");
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();

        System.out.println("1 --> 管理员, 0 --> 普通用户");
        System.out.println("请选择身份：");

        Scanner scan2 = new Scanner(System.in);
        int choice = scan2.nextInt();

        if (choice == 1) {
            return new AdminUser(name);
        } else if (choice == 0){
            return new NormalUser(name);
        } else {
            System.out.println("无该操作数");
            System.exit(-1);
            return null;

        }
    }
    public static void main(String[] args) {
        BookCase bookCase = new BookCase();

        User user = login();
        while (true) {
            int choice = user.menu();

            user.iOperations[choice].work(bookCase);
        }

    }
}
