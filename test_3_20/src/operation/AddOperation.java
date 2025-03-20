package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookCase bookCase) {

        int curSize = bookCase.getUseSize();
        int curCapacity = bookCase.getCapacity();

        if (curSize == curCapacity) {
            System.out.println("书架空间已经满了");
            return;
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入书名：");
            String bookName = scan.nextLine();

            //如果书名重复，不能添加
            for (int i = 0; i < curSize; i++) {
                Book book = bookCase.getBook(i);

                if (book.getName().equals(bookName)) {
                    System.out.println("已有此书，不能添加");
                    return;
                }
            }

            System.out.println("请输入作者：");
            String author = scan.nextLine();

            System.out.println("请输入价格：");
            int price = scan.nextInt();

            //可以添加
            Book book = new Book(bookName, author, price);
            bookCase.setBook(curSize,book);
            bookCase.setUseSize(curSize+1);
            System.out.println("**** 添加成功 ****");
        }
    }
}
