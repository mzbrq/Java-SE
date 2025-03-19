package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class DelOperation implements IOperation{
    public void work(BookCase bookCase) {
        int curSize = bookCase.getUsedSize();

        if (curSize == 0) {
            System.out.println("书架为空，不能删除");
            return;
        }

        //输入删除的书名
        System.out.println("请输入要删除的书名：");
        Scanner scan = new Scanner(System.in);
        String bookName = scan.nextLine();

        //在书架中查找要删除的书名
        int index = -1;

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);

            if (book.getName().equals(bookName)) {
                index = i; // 为要删除书的下标
                break;
            }
        }

        if (index == -1) {
            System.out.println("查无此书，无法删除");
            return;
        } else {
            //有这本书，进行删除
            for (int i = index; i < curSize-1; i++) {
                Book book = bookCase.getBook(i+1);
                bookCase.setBooks(i, book);
            }

            bookCase.setUsedSize(curSize-1);
            System.out.println("删除成功");

        }



    }
}
