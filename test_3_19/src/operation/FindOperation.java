package operation;

import book.BookCase;

import java.util.Scanner;

public class FindOperation implements IOperation{

    @Override
    public void work(BookCase bookCase) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入要查找的书名:");
        String bookName = scan.nextLine();

        int curSize = bookCase.getUsedSize();

        for (int i = 0; i < curSize; i++) {
            if (bookCase.getBook(i).getName().equals(bookName)) {
                System.out.println(bookCase.getBook(i));
                return;
            }
        }

        System.out.println("查无此书");

    }
}
