package com.bogovich.dto.requests;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Request for actions with books")
public class BookRequest {

    @Schema(description = "Book isbn", example = "978-0-13-456789-0")
    @Size(min = 15, max = 20, message = "The isbn must be between 15 and 20 characters long!")
    @NotBlank(message = "The book isbn can't be blank!")
    private String isbn;

    @Schema(description = "Book title", example = "1984")
    @Size(min = 2, max = 50, message = "The book name must be between 2 and 50 characters long!")
    @NotBlank(message = "The book title can't be blank!")
    private String title;

    @Schema(description = "Book genre", example = "Fantasy")
    @Size(min = 3, max = 20, message = "The genre must be between 3 and 20 characters long!")
    @NotBlank(message = "The book genre can't be blank!")
    private String genre;

    @Schema(description = "Book description", example = "Great example of fantasy adventure")
    @Size(min = 40, max = 255, message = "The description must be between 40 and 255 characters long!")
    @NotBlank(message = "The book description can't be blank!")
    private String description;

    @Schema(description = "Book author", example = "Rouling J.")
    @Size(min = 5, max = 20, message = "The author name must be between 5 and 20 characters long!")
    @NotBlank(message = "The book author can't be blank!")
    private String author;

}
