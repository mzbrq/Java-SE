package demo1;

public class Test {
    public static void testRun(IRunning iRunning) {
        iRunning.Run();
    }
    public static void testSwim(ISwimming iSwimming) {
        iSwimming.swim();
    }
    public static void testFly(IFlying iFlying) {
        iFlying.fly();
    }
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪", 3);
        Fish fish = new Fish("鱼鱼", 2);
        Duck duck = new Duck("丫丫", 3);
        Frog frog = new Frog("小哇哇", 5);

        testRun(cat);

        testSwim(fish);

        testFly(duck);
        testSwim(duck);
        testRun(duck);

        testRun(frog);
        testSwim(frog);

    }
}
