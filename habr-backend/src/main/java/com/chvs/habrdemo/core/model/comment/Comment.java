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

    private Comment(Article article, LocalDateTime createdAt, String text) {
        this.article = article;
        this.createdAt = createdAt;
        this.text = text;
    }

    private Comment(Comment parentComment, LocalDateTime createdAt, String text) {
        this.parentComment = parentComment;
        this.article = parentComment.getArticle();
        this.createdAt = createdAt;
        this.text = text;
    }

    @NonNull
    static Comment createParent(@NonNull ParentCommentCreationOperation creationOperation, @NonNull LocalDateTime createdAt) {
        return new Comment(
                creationOperation.article(),
                createdAt,
                creationOperation.text());
    }

    @NonNull
    static Comment createChild(@NonNull Comment parentComment, @NonNull String text, @NonNull LocalDateTime createdAt) {
        return new Comment(
                parentComment,
                createdAt,
                text);
    }
}
