package org.example.jpa.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Entity
@Table(name = "books")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_name", nullable = false, length = 100, unique = true)
    private String title;
    private String author;
}
