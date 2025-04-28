public class Test {
    public static void main(String[] args) throws StackNullException {
        MyStack myStack = new MyStack();

        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        System.out.println(myStack.empty());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        //System.out.println(myStack.pop());


        System.out.println(myStack.empty());
        //System.out.println(myStack.peek());
        System.out.println(myStack.size());

    }
}
