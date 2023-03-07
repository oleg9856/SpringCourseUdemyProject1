package com.gmail.library.springcourseudemyproject1.models;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;

    @NotEmpty(message = "Book name must not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Pattern(regexp = "[A-Z]\\w+\\s[A-Z]\\w+",
            message = "Your author name should be in this format: first name, last name")
    @NotEmpty(message = "Author name should not be empty")
    private String author;

    @Max( value = 2023, message = "Year of publication of the book is incorrect")
    private int year;

    @Override
    public String toString() {
        return name + ", " +author+ ", "+year;
    }
}
