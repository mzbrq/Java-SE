package book;

public class BookCase {
    private int capacity = 10;
    private Book[] books = new Book[capacity];
    private int useSize;


    public BookCase() {
        this.useSize = 3;
        this.books[0] = new Book("三国演义", "罗贯中", 11);
        this.books[1] = new Book("西游记", "吴承恩", 22);
        this.books[2] = new Book("红楼梦", "曹雪芹", 33);
    }

    //根据下标返回元素
    public Book getBook(int pos) {
        return books[pos];
    }

    //通过下标设置元素
    public void setBook(int pos, Book book) {
        this.books[pos] = book;
    }
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getUseSize() {
        return useSize;
    }

    public void setUseSize(int useSize) {
        this.useSize = useSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
