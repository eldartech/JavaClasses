package constructor.bookApp;

public class Book {
    String title;
    String author;
    int pageAmount;
    double price;
    static int count=0;

    Book(){
    }

    Book(String title){
        this();
        this.title=title;
    }

    Book(String title,String author){
        this(title);
        this.author=author;
    }

    Book(String title, String author,int pageAmount){
        this(title,author);
        this.pageAmount=pageAmount;
    }

    Book(double price, String title,String author, int pageAmount){
        this(title,author,pageAmount);
        this.price=price;
        count++;
    }

    void printDetails(){
        System.out.println("Title: "+this.title+"\nAuthor: "+author+"\nPages Amount: "+pageAmount+"\nPrice: $"+price);
    }

    int countBooks(Book[] books){
        return books.length;
    }

    int countBooks(){
        return count;
    }


    /*

task:
class of Book
	title
	author
	pagesAmount
	price
	count

	different flavors of constuctors
	method to print book details
	method to print amount of books

class BookShelf

	different books
	call method you have created in Book class
	call method which will display amount of books


     */


}
