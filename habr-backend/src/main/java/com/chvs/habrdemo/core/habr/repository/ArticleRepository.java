package com.chvs.habrdemo.core.habr.repository;

import com.chvs.habrdemo.core.habr.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
