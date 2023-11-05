package com.polarbookshop.catalogservice.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotBlank; 
import javax.validation.constraints.NotNull;  
import javax.validation.constraints.Positive; 

public record Book (
    @NotBlank(message = "The book ISBN must not be blank")
    @Pattern(
        regexp = "^([0-9]{10}|[0-9]{13})$", 
        message = "The ISBN format must be valid."
    )
    String isbn,

    @NotBlank(
        message = "The book title must not be blank."
    )
    String title,

    @NotBlank(
        message = "The book author must not be blank."
    )
    String author,

    @NotNull(message = "The book price must not be blank")
    @Positive(
        message = "The book price must be positive."
    )
    Double price
){

}