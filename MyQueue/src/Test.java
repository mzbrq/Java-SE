public class Test {
    public static void main(String[] args) throws NullException {
        MyQueue myQueue = new MyQueue();

        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);

        System.out.println(myQueue.getUsedSize());
        System.out.println("size:" + myQueue.getUsedSize());


        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());

        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.empty());

        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());

        System.out.println(myQueue.empty());
        System.out.println("size: " + myQueue.getUsedSize());

        //System.out.println(myQueue.poll());


    }
}
