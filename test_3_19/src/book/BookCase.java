package book;

public class BookCase implements Cloneable{
    private int usedCapacity = 10;//书架容量
    private Book[] books = new Book[usedCapacity];
    private int usedSize = 0; //实际存放的书数量


    public BookCase() {
        this.books[0] = new Book("西游记", "吴承恩", 100);
        this.books[1] = new Book("三国演义", "罗贯中", 111);
        this.books[2] = new Book("红楼梦", "曹雪芹", 222);
        this.usedSize = 3;
    }

    //获取某个下标下的书
    public Book getBook(int pos) {
        return books[pos];
    }
    //往某个下标位置放书
    public void setBooks(int pos, Book book) {
        books[pos] = book;
    }
    public Book[] getBooks() {
        return books;
    }

    public int getUsedSize() {
        return usedSize;
    }
    public void setUsedSize(int size) {
        this.usedSize = size;
    }

    public int getUsedCapacity() {
        return usedCapacity;
    }

    public void setUsedCapacity(int usedCapacity) {
        this.usedCapacity = usedCapacity;
    }
}
