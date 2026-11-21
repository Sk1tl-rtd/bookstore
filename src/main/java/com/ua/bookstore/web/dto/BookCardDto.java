package com.ua.bookstore.web.dto;

import java.math.BigDecimal;

/** Короткий вигляд книги для переліку. */
public record BookCardDto(Long id, String title, String author, BigDecimal price) {}
