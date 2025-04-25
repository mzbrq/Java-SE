import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws NullException {
        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.isNull());

        //System.out.println(myStack.pop());

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        while (!myStack.isNull()) {
            int ret = myStack.pop();
            System.out.println(ret);
        }

    }
}
