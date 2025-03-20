package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookCase bookCase) {
        System.out.println("请输入需要删除的书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        int curSize = bookCase.getUseSize();
        int index = -1;

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);
            if (book.getName().equals(bookName)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("查无此书");
        } else {
            for (int i = index; i < curSize-1; i++) {
                Book book = bookCase.getBook(i+1);
                bookCase.setBook(i, book);
            }
            bookCase.setUseSize(curSize-1);
            System.out.println("**** 删除成功 ****");
        }

    }
}
