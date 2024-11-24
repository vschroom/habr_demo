package com.chvs.habrdemo.core.model.article;

import com.chvs.habrdemo.AbstractIntegrationTest;
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
        var createArticleRequest = new ArticleCreationOperation("header test", "body test");

        mockMvc.perform(post("/api/v1/articles")
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
        articleRepository.save(
                Article.create(
                        new ArticleCreationOperation("header", "body"),
                        LocalDateTime.of(2024, 10, 2, 0, 0)));

        mockMvc.perform(get("/api/v1/articles/%s".formatted("1")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.header").value("header"))
                .andExpect(jsonPath("$.body").value("body"));
    }
}
