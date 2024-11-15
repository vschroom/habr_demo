package com.chvs.habrdemo.repository;

import com.chvs.habrdemo.model.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArticleRepository extends JpaRepository<Article, UUID> {
}
