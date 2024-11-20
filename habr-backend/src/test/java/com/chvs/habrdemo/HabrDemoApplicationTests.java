package com.chvs.habrdemo;

import com.chvs.habrdemo.core.habr.dto.CreateArticleRequest;
import com.chvs.habrdemo.core.habr.entity.Article;
import com.chvs.habrdemo.core.habr.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class HabrDemoApplicationTests extends AbstractIntegrationTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    void shouldCreateArticle() throws Exception {
        var createArticleRequest = new CreateArticleRequest();
        createArticleRequest.setHeader("header test");
        createArticleRequest.setBody("body test");

        mockMvc.perform(post("/articles")
                .content(objectMapper.writeValueAsString(createArticleRequest))
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.header").value("header test"))
                .andExpect(jsonPath("$.body").value("body test"));
    }

    @Test
    void shouldReturnArticle() throws Exception {
        articleRepository.save(Article.builder()
                        .id(1L)
                        .header("header")
                        .body("body")
                        .createdAt(LocalDateTime.of(2024, 10, 2, 0, 0))
                .build());

        mockMvc.perform(get("/articles/%s".formatted("1")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.header").value("header"))
                .andExpect(jsonPath("$.body").value("body"));
    }
}
