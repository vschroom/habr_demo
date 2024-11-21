package com.chvs.habrdemo.core.habr.article;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.time.LocalDateTime;
import java.util.Objects;

@Table(name = "articles")
@Entity

@Getter
@Setter
public class Article {

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

    public static Article create(@NonNull ArticleRequest articleRequest,
                                 @NonNull LocalDateTime createdAt) {
        return new Article(
                createdAt,
                articleRequest.header(),
                articleRequest.body()
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        var article = (Article) o;
        return id != null && Objects.equals(id, article.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
