CREATE TABLE books (
    isbn VARCHAR(20) PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    description TEXT,
    author VARCHAR(255) NOT NULL
);