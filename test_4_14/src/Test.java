public class Test {
    public static void main(String[] args) throws PosOutOfBoundsException{
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);

        myArrayList.display();

        //pos 位置处插入
        myArrayList.add(0, 100);
        myArrayList.add(4, 200);
        myArrayList.add(7, 300);
        myArrayList.add(9, 400);
        //myArrayList.add(100, 999);

        myArrayList.display();

        //查看是否包含元素
        System.out.println(myArrayList.contains(6));
        System.out.println(myArrayList.contains(90));

        //找到元素对应下标
        System.out.println(myArrayList.indexOf(100));
        System.out.println(myArrayList.indexOf(300));
        System.out.println(myArrayList.indexOf(90));

        myArrayList.display();

        //获取pos位置的元素
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.get(4));
        System.out.println(myArrayList.get(9));
        //System.out.println(myArrayList.get(10));

        //设置 pos 位置的元素
        myArrayList.set(3, 30);
        myArrayList.set(4, 40);
        myArrayList.set(9, 90);
        //myArrayList.set(10, 90);

        myArrayList.display();

        //删除
        myArrayList.remove(100);
        myArrayList.remove(300);
        myArrayList.remove(90);

        myArrayList.display();

        System.out.println(myArrayList.size());

        //清空顺序表
        myArrayList.clear();
        myArrayList.display();


     /*   myArrayList.add(1);
        myArrayList.display();*/


    }
}
