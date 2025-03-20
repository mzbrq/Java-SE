package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {

        System.out.println("请输入要借阅书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        //如果查无此书名，就不能借阅
        int curSize = bookCase.getUseSize();

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);

            if (book.getName().equals(bookName)) {
                //判断是否已被借阅
                if (!(book.isBorrow())) {
                    //未被借出，可以借阅
                    book.setBorrow(true);
                    System.out.println("**** 借阅成功 ****");
                    return;
                } else {
                    //不能借阅
                    System.out.println("此书已被借阅");
                    return;
                }
            }
        }

        //遍历书架，查无此书
        System.out.println("查无此书，不能借阅");
    }
}
