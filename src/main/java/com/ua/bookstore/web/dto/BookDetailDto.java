package com.ua.bookstore.web.dto;

import java.math.BigDecimal;
import java.util.List;

/** Повний вигляд однієї книги. */
public record BookDetailDto(Long id, String title, String author, BigDecimal price,
                            int year, String description, List<String> genres) {}
