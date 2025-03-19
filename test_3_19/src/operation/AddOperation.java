package operation;

import book.Book;
import book.BookCase;

import java.util.Scanner;

public class AddOperation implements IOperation{
    public void work(BookCase bookCase) {

        int curSize = bookCase.getUsedSize();
        int curCapacity = bookCase.getUsedCapacity();

        //判断书架容量是否满了
        if (curSize >= curCapacity) {
            System.out.println("书架已经满了，无法添加");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入书名：");
        String bookName = scan.nextLine();

        System.out.println("请输入作者：");
        String author = scan.nextLine();

        System.out.println("请输入价格：");
        int price = scan.nextInt();

        Book book = new Book(bookName, author, price);

        //如果书同名，不能添加
        for (int i = 0; i < curSize; i++) {
            Book book1 = bookCase.getBook(i);

            if (book1.getName().equals(bookName)) {
                System.out.println("已有此书，不能重复添加");
                return;
            }
        }
        bookCase.setBooks(curSize, book);
        bookCase.setUsedSize(curSize+1);

        System.out.println("添加成功");

    }
}
