package com.gmail.library.springcourseudemyproject1.models;

import lombok.*;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private int id;

    @Pattern(regexp = "[A-Z]\\w+\\s[A-Z]\\w+",
            message = "Your name should be in this format: first name, last name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Min( value = 1900, message = "Year of publication of the book is incorrect")
    @Max( value = 2023, message = "Year of publication of the book is incorrect")
    private int yearOfBirth;
}
