package com.ua.bookstore.domain;

import java.math.BigDecimal;
import java.util.List;

/** Доменна модель книги. Без залежностей на фреймворк. */
public class Book {
    private Long id;
    private String title;
    private String author;
    private BigDecimal price;
    private int year;
    private String description;
    private List<String> genres;

    public Book(Long id, String title, String author, BigDecimal price, int year,
                String description, List<String> genres) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.description = description;
        this.genres = genres;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public BigDecimal getPrice() { return price; }
    public int getYear() { return year; }
    public String getDescription() { return description; }
    public List<String> getGenres() { return genres; }
}
