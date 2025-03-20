package user;

import operation.*;

import java.util.Scanner;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new AddOperation(),
                new DelOperation(),
                new ShowOperation(),
                new FindOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=============================");
        System.out.println("hello" + name + "管理员菜单");
        System.out.println("1. 新增图书");
        System.out.println("2. 删除图书");
        System.out.println("3. 显示图书");
        System.out.println("4. 查找图书");
        System.out.println("0. 退出系统");
        System.out.println("=============================");

        System.out.println("请输入操作数：");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if (choice <= 4) {
            return choice;
        } else {
            System.out.println("无该操作数");
            System.exit(-1);
            return -1;
        }

    }
}
