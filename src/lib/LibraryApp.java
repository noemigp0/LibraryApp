package lib;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
          Book book = bookRepo.findByIsbn(isbn);

            System.out.printf("Searching for books with ISBN %s.\n", isbn);
          if( book != null){
              System.out.printf("1 book found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
          } else {
              System.out.printf("0 books found.");
          }
          System.out.print("\n\n");
    }

    public void searchByWord(String word){
       ArrayList<Book> books = bookRepo.findByWord(word);
        System.out.printf("Searching for books with word %s.\n", word);
        System.out.printf("%s Books founded", books.size(), books.size() > 0 ? ":": ".");
        for (Book book: books
             ) {
            System.out.printf("\n\tTitle: %s\n\tGenre: %s\n\tAuthor: %s", book.getTitle(), book.getGenre(), book.getAuthor());
            System.out.print("\n");


        }



    }
}
