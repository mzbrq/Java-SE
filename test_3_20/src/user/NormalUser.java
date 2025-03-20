package user;

import operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ShowOperation(),
        };
    }

    @Override
    public int menu() {

        System.out.println("=============================");
        System.out.println("hello" + name + "普通用户菜单");
        System.out.println("1. 查找图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("4. 显示图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");

        System.out.println("请输入操作数：");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if (choice <= 4 && choice >= 0) {
            return choice;
        } else {
            System.out.println("无该操作数");
            System.exit(-1);
            return -1;
        }
    }
}
