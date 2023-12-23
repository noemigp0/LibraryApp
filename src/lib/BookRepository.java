package lib;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository(){
        books.add(new Book("83471", "The Dead of Night", "Horror", null,"S.K Eleton" , 10, 5));
        books.add(new Book("25274", "Castles and Crenellations", "Historical", null,"H.P Anderson", 3,5));
        books.add(new Book("51573", "The Knight's Sword", "Fantasy", null,"F.E Anvil", 7, 8));
        books.add(new Book("39662", "Time of Nights", "Romance", null,"A.U Ring", 9,5));
        books.add(new Book("40831", "Castle Siege", "Historical", null,"N.N Blacksmith", 10, 7));
        books.add(new Book("61552", "Night and Day", "Mystery", null,"Q.Z. Bizar", 20, 4));
        books.add(new Book("06917", "Never Time", "Thriller", null,"P.B. Jelliton", 15, 4));
    }


    public Book findByIsbn(String isbn){
       for(Book book: books){
           if (book.getIsbn().equals(isbn)){
               return book;
           }

       }
       return null;
    }

    public ArrayList<Book> findByWord(String word){
        ArrayList<Book> matchedBooks = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().toLowerCase().contains(word.toLowerCase())){
                matchedBooks.add(book);

            }

        }
        return matchedBooks;
    }

    }
