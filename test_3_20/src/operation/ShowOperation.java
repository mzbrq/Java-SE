package operation;

import book.Book;
import book.BookCase;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        System.out.println("显示图书");
        int curSize = bookCase.getUseSize();

        if (curSize == 0) {
            System.out.println("**** 书架为空 ****");
            return;
        }

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);
            System.out.println(book);
        }
    }
}
