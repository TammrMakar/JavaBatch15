package Class19;

public class Book {

    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String author;
    String title;
    int year;

    Book(String author,String title){
    this.author=author;
    this.title=title;
}
    Book(String auther,String title,int year) {
        this(auther, title);
        this.year=year;
    }
        void inf(){
    System.out.println("auther: "+author+" title: "+title+" puplished: "+year);
}

    public static void main(String[] args) {
     Book book=new Book("Judy kerolus","java Priciples",2023);
    book.inf();

    }
    }