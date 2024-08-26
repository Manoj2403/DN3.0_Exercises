package com.example.bookstoreapi.mapper;

import com.example.bookstoreapi.dto.BookDTO;
import com.example.bookstoreapi.model.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-08-26T10:08:40+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDTO bookToBookDTO(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDTO bookDTO = new BookDTO();

        bookDTO.setId( book.getId() );
        bookDTO.setTitle( book.getTitle() );
        bookDTO.setAuthor( book.getAuthor() );
        bookDTO.setPrice( book.getPrice() );
        bookDTO.setIsbn( book.getIsbn() );

        return bookDTO;
    }

    @Override
    public Book bookDTOToBook(BookDTO bookDTO) {
        if ( bookDTO == null ) {
            return null;
        }

        Long id = null;
        String title = null;
        String author = null;
        double price = 0.0d;
        String isbn = null;

        id = bookDTO.getId();
        title = bookDTO.getTitle();
        author = bookDTO.getAuthor();
        if ( bookDTO.getPrice() != null ) {
            price = bookDTO.getPrice();
        }
        isbn = bookDTO.getIsbn();

        Book book = new Book( id, title, author, price, isbn );

        return book;
    }
}
