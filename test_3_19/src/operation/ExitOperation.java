package operation;

import book.BookCase;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        int curSize = bookCase.getUsedSize();
        for (int i = 0; i < curSize; i++) {
            bookCase.setBooks(i, null);
        }
        System.out.println("成功退出系统");
        System.exit(0);

    }
}
