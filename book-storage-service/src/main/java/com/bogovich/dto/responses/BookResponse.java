package com.bogovich.dto.responses;

import io.swagger.v3.oas.annotations.media.Schema;

public record BookResponse(
        @Schema(description = "Book id in database", example = "2")
        Long id,

        @Schema(description = "Book isbn in database", example = "978-0-13-456789-0")
        String isbn,

        @Schema(description = "Book title in database", example = "1984")
        String title,

        @Schema(description = "Book genre in database", example = "Fantasy")
        String genre,

        @Schema(description = "Book description in database", example = "Great example of fantasy adventure")
        String description,

        @Schema(description = "Book author in database", example = "Rouling J.")
        String author
) {
}
