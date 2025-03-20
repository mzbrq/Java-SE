package user;

import operation.IOperation;

public abstract class User {
    String name;
    public IOperation[] iOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
}
