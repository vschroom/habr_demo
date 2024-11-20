package com.chvs.habrdemo.core.habr.article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleRepository extends JpaRepository<Article, Long> {
}
