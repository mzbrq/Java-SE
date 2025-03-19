package operation;

import book.BookCase;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        System.out.println("归还图书");
    }
}
