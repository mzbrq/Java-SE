package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        System.out.println("请输入归还图书的书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        int curSize = bookCase.getUseSize();


        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);
            if (book.getName().equals(bookName)) {
                //判断是否被借出
                if (book.isBorrow()) {
                    //归还
                    book.setBorrow(false);
                    System.out.println("**** 成功归还 ****");
                    return;
                } else {
                    //未被借出
                    System.out.println("此书未被借出");
                    return;
                }
            }
        }

        System.out.println("查无此书");
    }
}
