package operation;

import book.BookCase;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        System.out.println("借阅图书");
    }
}
