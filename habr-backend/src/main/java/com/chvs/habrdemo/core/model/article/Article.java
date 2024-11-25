package com.chvs.habrdemo.core.model.article;

import com.chvs.habrdemo.core.base.ReadonlyIdentifiable;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PACKAGE;

@Table(name = "articles", schema = "habr")
@Entity

@Data
@Setter(value = PACKAGE)
public class Article implements ReadonlyIdentifiable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "header")
    private String header;

    @Column(name = "body")
    private String body;

    protected Article() {
    }

    private Article(LocalDateTime createdAt, String header, String body) {
        this.createdAt = createdAt;
        this.header = header;
        this.body = body;
    }

    public static Article create(@NonNull ArticleCreationOperation articleCreationOperation,
                                 @NonNull LocalDateTime createdAt) {
        return new Article(
                createdAt,
                articleCreationOperation.header(),
                articleCreationOperation.body()
        );
    }
}
