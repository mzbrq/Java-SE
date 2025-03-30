package demo1;

import java.util.Scanner;

class UseNameException extends Exception {
    public UseNameException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Login {
    private static final String userName = "admin";
    private static final String password = "123456";
    public static void loginInfo(String tmp1, String tmp2)
    throws PasswordException, UseNameException{
        if (!userName.equals(tmp1)) {
            throw new UseNameException("用户名错误");
        }
        if (!password.equals(tmp2)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入用户名");
            String useName = scan.nextLine();
            System.out.println("请输入密码");
            String password = scan.nextLine();

            loginInfo(useName, password);
        } catch (UseNameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        }
    }
}