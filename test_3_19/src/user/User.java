package user;

import book.BookCase;
import operation.IOperation;

public abstract class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(int choice, BookCase bookCase) {
        iOperations[choice].work(bookCase);
    }
}
