package operation;

import book.Book;
import book.BookCase;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class FindOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        System.out.println("请输入查找的书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        int curSize = bookCase.getUseSize();

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);

            if (book.getName().equals(bookName)) {
                System.out.println(book);
                System.out.println("**** 查找成功 ****");
                return;
            }
        }

        System.out.println("查无此书");

    }
}
