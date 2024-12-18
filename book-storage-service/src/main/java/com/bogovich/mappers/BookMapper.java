package com.bogovich.mappers;

import com.bogovich.dto.requests.BookRequest;
import com.bogovich.dto.responses.BookResponse;
import com.bogovich.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book RequestToEntity(BookRequest request);

    BookRequest EntityToRequest(Book book);

    Book ResponseToEntity(BookResponse response);

    BookResponse EntityToResponse(Book book);

    void updateBookFromRequest(BookRequest request, @MappingTarget Book book);
}
