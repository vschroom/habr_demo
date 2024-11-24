package com.chvs.habrdemo.core.model.article;

import org.springframework.data.jpa.repository.JpaRepository;

interface ArticleRepository extends JpaRepository<Article, Long> {
}
