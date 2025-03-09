public class Test {
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape1  = new B();
        shape1.draw();

        if (shape1 instanceof B) {
            ((B) shape1).test();
        }

    }
}

abstract class Shape {
    public abstract void draw();
}

abstract class A extends Shape {
    public abstract void test();
}

class B extends A {
    @Override
    public void draw() {
        System.out.println("B");
    }

    @Override
    public void test() {
        System.out.println("test");
    }
}

