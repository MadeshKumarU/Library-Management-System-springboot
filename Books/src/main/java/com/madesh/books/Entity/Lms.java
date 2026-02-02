package com.madesh.books.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;


@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity
@Table(name = "lms_books")
public class Lms {

    @NonNull
    @Id
    private Long id;
    @NonNull
    private String bookName;
    @NonNull
    private String author;
    @NonNull
    private Double price;
    private boolean isAvailable;
    private int quantity;
}
