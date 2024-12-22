package com.chvs.habrdemo.core.model.comment;

import com.chvs.habrdemo.core.model.article.Article;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PACKAGE;

@Entity
@Table(name = "comments")

@Data
@ToString(exclude = {"parentComment", "article"})
@EqualsAndHashCode(exclude = {"parentComment", "article"})
@Setter(PACKAGE)
public class Comment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "parent_id")
    private Comment parentComment;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "article_id")
    private Article article;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "rating")
    private int rating;
    @Column(name = "text")
    private String text;
    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;

    protected Comment() {
    }

    private Comment(Comment parentComment, Article article, LocalDateTime createdAt, String text) {
        this.parentComment = parentComment;
        this.article = article;
        this.createdAt = createdAt;
        this.text = text;
    }

    @NonNull
    static Comment create(@NonNull CommentCreationOperation creationOperation, @NonNull LocalDateTime createdAt) {
        return new Comment(
                creationOperation.parentComment(),
                creationOperation.article(),
                createdAt,
                creationOperation.text());
    }
}
