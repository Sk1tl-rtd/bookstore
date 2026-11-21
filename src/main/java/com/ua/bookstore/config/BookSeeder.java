package com.ua.bookstore.config;

import com.ua.bookstore.domain.Book;
import com.ua.bookstore.repository.BookRepository;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/** Початкове наповнення сховища після запуску контексту. */
@Component
public class BookSeeder implements ApplicationRunner {

    private final BookRepository repository;

    public BookSeeder(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Book(null, "Кобзар", "Тарас Шевченко", new BigDecimal("320.00"), 1840,
                "Збірка поетичних творів Тараса Шевченка.", List.of("Поезія", "Класика")));
        repository.save(new Book(null, "Intermezzo", "Михайло Коцюбинський", new BigDecimal("180.00"), 1909,
                "Лірична новела про відпочинок і природу.", List.of("Новела", "Класика")));
        repository.save(new Book(null, "Тигролови", "Іван Багряний", new BigDecimal("290.50"), 1944,
                "Пригодницький роман про втечу з заслання.", List.of("Роман", "Пригоди")));
        repository.save(new Book(null, "Місто", "Валер'ян Підмогильний", new BigDecimal("260.00"), 1928,
                "Роман про молодого провінціала в Києві.", List.of("Роман", "Модернізм")));
        repository.save(new Book(null, "Лісова пісня", "Леся Українка", new BigDecimal("210.00"), 1911,
                "Драма-феєрія за мотивами волинських легенд.", List.of("Драма", "Класика")));
    }
}
