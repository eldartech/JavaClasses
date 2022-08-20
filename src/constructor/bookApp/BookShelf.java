package constructor.bookApp;

public class BookShelf {
    public static void main(String[] args) {
        Book book1=new Book(16.99,"Java","James Gosling",500);
        Book book2=new Book(20.50,"The Lord of Rings","Tolkien",1000);
        Book book3=new Book(7.99,"Harry Potter","J. Rolling",2000);

        Book[] books={book1,book2,book3};
        System.out.println(Book.count);


        double total=0;
        for (int i=0;i<books.length;i++){

           total+=books[i].price;
            System.out.println(books[i].title+" "+books[i].author+" "+books[i].pageAmount+" "+books[i].price);
        }
        System.out.println("Total amount of books: "+book1.countBooks(books));
        System.out.println("Total price for all books: "+total);


    }
}
