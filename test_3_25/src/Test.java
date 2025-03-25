class Data {
    int year;
    int mouth;
    int day;

    Data (int year, int mouth, int day) {
        System.out.println(this.year);
        System.out.println(this.mouth);
        System.out.println(this.day);
    }
}

public class Test {
    public static void main(String[] args) {
        Data data = new Data(2004, 2, 24);
    }
}
