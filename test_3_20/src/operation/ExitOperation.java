package operation;

import book.BookCase;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookCase bookCase) {
        //退出之间可以把书架清空
        int curSize = bookCase.getUseSize();

        for (int i = 0; i < curSize; i++) {
            bookCase.setBook(i, null);
        }
        System.out.println("**** 成功退出 ****");
        System.exit(0);

    }
}
