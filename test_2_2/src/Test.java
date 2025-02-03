public class Test {
    public static void main(String[] args) {
    //顺序结构
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");

        System.out.println("aaa");
       System.out.println("ccc");
       System.out.println("bbb");

        //分支结构

        //if语句

        //判断一个数是奇数还是偶数

        int score = 0;

        if(score % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }

        //判断一个数是正数还是负数，还是0

        int num = 0;

        if(num > 0){
            System.out.println("正数");
        }else if(num < 0){
            System.out.println("负数");
        }else{
            System.out.println("0");
        }


        //判断一年是不是闰年

        int year = 1000;

        for(year = 1000; year <= 2000; year++){
            if(year % 400 == 0){
                System.out.println(year + " is 闰年");
            }else if(year % 100 != 0 && year % 4 == 0){
                System.out.println(year + " is 闰年");
            }else{

            }
        }


        //循环结构

        //while循环

        //打印1 到 10 的数字

        int num = 1;

        while(num <= 10){
            System.out.println(num);
            num++;
        }

        //计算1 到 100 的和

        int i = 1;
        int num = 0;

        while (i <= 100) {
            num += i;
            i++;
        }

        System.out.println("num = "+ num);

        //计算 5 的阶乘

        int i = 1;
        int ret = 1;

        while (i <= 5) {
            ret *= i;
            i++;
        }

        System.out.println(ret);

        //计算 1! + 2! + 3! + 4! + 5!

        int i = 1;
        int ret = 0;

        while (i <= 5) {
            //计算阶乘
            int n = 1;
            int num = 1;

            while (n <= i) {
                num *= n;
                n++;
            }
            ret += num;
            i++;
        }

        System.out.println(ret);



    }
}
