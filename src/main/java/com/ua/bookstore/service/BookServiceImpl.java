package com.ua.bookstore.service;

import com.ua.bookstore.exception.BookNotFoundException;
import com.ua.bookstore.repository.BookRepository;
import com.ua.bookstore.service.mapper.BookMapper;
import com.ua.bookstore.web.dto.BookCardDto;
import com.ua.bookstore.web.dto.BookDetailDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    private final BookMapper mapper;

    public BookServiceImpl(BookRepository repository, BookMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<BookCardDto> findAll() {
        return repository.findAll().stream().map(mapper::toCard).toList();
    }

    @Override
    public BookDetailDto findById(Long id) {
        return repository.findById(id)
                .map(mapper::toDetail)
                .orElseThrow(() -> new BookNotFoundException(id));
    }
}
