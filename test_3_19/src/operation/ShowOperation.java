package operation;

import book.Book;
import book.BookCase;

public class ShowOperation implements IOperation{
    public void work(BookCase bookCase) {
        int curSize = bookCase.getUsedSize();

        if (curSize == 0) {
            System.out.println("书架为空");
        }

        for (int i = 0; i < curSize; i++) {
            Book book = bookCase.getBook(i);
            System.out.println(book);
        }
    }
}
