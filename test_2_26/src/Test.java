public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Rect();
        System.out.println(shape1.i);
    }
    /*public static void main1(String[] args) {
        Shape[] shapes = {new Circle(), new Flower(), new Rect(), new Flower(), new Triangle()};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }*/
}

class Shape {
    int i = 10;
    public void draw() {
        System.out.println("图像");
    }
}

class Rect extends Shape {
    int i = 100;
    @Override
    public void draw() {
        System.out.println("■");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("▲");
    }
}
