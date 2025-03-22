public class Test {
    public static void main(String[] args) {
        String s1 = new String("abcd");
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));
        System.out.println(s1.charAt(2));
    }
    public static void main8(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("hello world");
        System.out.println(stringBuffer);
    }
    public static void main7(String[] args) {
        //trim(): 消除字符串左右两边空格
        String s1 = new String("   hello  world   ");
        String ret = s1.trim();
        System.out.println(ret);
    }
    public static void main6(String[] args) {
        //截取
        String s1 = new String("hello world");
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(0, 5));
    }
    public static void main5(String[] args) {
        //字符串分割
        String s1 = new String("name=linx&age=21");
        String[] arr = s1.split("&");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============================");

        String s2 = new String("hello world hello linx");
        String[] strings = s2.split(" ", 3);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("============================");

        //特殊分割
        String s3 = new String("192.168.110");
        String[] strings1 = s3.split("\\.");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);

        }
        System.out.println("============================");
        String s4 = new String("hello&world=HELLO");
        String[] strings2 = s4.split("&|=");
        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }

        System.out.println("============================");
        //多次拆分
        String s5 = new String("name=zhangsan&age=10");
        String[] strings3 = s5.split("&");
        for (int i = 0; i < strings3.length; i++) {
            String s6 = strings3[i];
            String[] strings4 = s6.split("=");
            for (int j = 0; j < strings4.length; j++) {
                System.out.println(strings4[j]);
            }
        }


    }
    public static void main4(String[] args) {
        //替换

        String s1 = new String("abcabcabc aabbccdd");

        String ret1 = s1.replace('a', '|');
        System.out.println(ret1);

        String ret2 = s1.replace("abc", "&");
        System.out.println(ret2);

        String ret3 = s1.replaceFirst("abc","fff");
        System.out.println(ret3);

        String ret4 = s1.replaceAll("abc", "hhh");
        System.out.println(ret4);

    }
    public static void main3(String[] args) {
        //转换

        //数字转字符串
        int a = 123;
        double b = 12.23;

        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);

        System.out.println(s1+1);
        System.out.println(a+1);
        System.out.println(s2 + 1);
        System.out.println(b+1);
        System.out.println("============================");

        //大小写转换
        String s3 = new String("hello");
        String s4 = new String("HELLO");

        String ret1 = s3.toUpperCase();
        String ret2 = s4.toLowerCase();

        System.out.println(ret1);
        System.out.println(ret2);

        System.out.println("============================");

        //字符串与数组转换
        String s5 = new String("hello world");
        char[] arr = s5.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        String s6 = new String(arr);
        System.out.println(s6);
        System.out.println("============================");

        //格式化
        String s7 = String.format("%d-%d-%d", 2004, 02, 24);
        System.out.println(s7);

    }
    public static void main2(String[] args) {
        //比较

        //1. == 比较
        int a = 1;
        int b = 2;

        System.out.println(a == b);

        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("world");
        String s4 = s1; //两个引用同时指向同一对象

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println("============================");
        //equals 比较
        String s5 = new String("Hello");//首字母大写

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s3));
        System.out.println("============================");

        //compareTo 比较
        String s6 = new String("hello world");
        String s7 = new String("Hello");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s6));
        System.out.println(s1.compareTo(s7));

    }
    public static void main1(String[] args) {
        //使用常量串构造
        String s1 = "abcd";
        //使用new String 对象构造
        String s2 = new String("hello");
        //使用字符数组构造
        char[] arr = {'a', 'b', 'c', 'd'};
        String s3 = new String(arr);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //String.length()计算字符串长度
        System.out.println(s1.length());
        System.out.println("linx".length());//""引起来的也算String类型变量
    }
}
