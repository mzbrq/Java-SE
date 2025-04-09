public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(3);


        //尾插
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //打印
        myArrayList.display();

        //在pos处插入数据
        myArrayList.add(2, 100);
        myArrayList.add(4, 200);
        myArrayList.add(0, 90);
        myArrayList.add(myArrayList.getUsedSize(), 88);
        //myArrayList.add(-1, 100);

        myArrayList.display();

        System.out.println(myArrayList.contains(200));

        System.out.println(myArrayList.indexOf(200));

        System.out.println(myArrayList.get(3));

        myArrayList.set(3, 50);

        myArrayList.display();

        myArrayList.remove(50);

        myArrayList.display();

        myArrayList.clear();

        myArrayList.display();


    }
}
