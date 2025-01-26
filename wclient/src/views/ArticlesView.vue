<script setup lang="ts">

import {RouterLink} from "vue-router";
</script>

<template>
  <div class="article-list">
    <div class="article">
      <img src="https://via.placeholder.com/150" alt="Превью">
      <div class="article-content">
        <RouterLink to="/article">Article</RouterLink>
        <a href="#" class="article-title">Как я стал разработчиком</a>
        <p class="article-description">История о том, как я начал свою карьеру в IT и что мне в этом помогло.</p>
        <div class="article-meta">Автор: Иван Иванов | 24 ноября 2024</div>
      </div>
    </div>
    <div class="article">
      <img src="https://via.placeholder.com/150" alt="Превью">
      <div class="article-content">
        <a href="#" class="article-title">Лучшие инструменты для продуктивной работы</a>
        <p class="article-description">Список полезных приложений и расширений, которые помогут вам работать быстрее.</p>
        <div class="article-meta">Автор: Анна Смирнова | 23 ноября 2024</div>
      </div>
    </div>
    <div class="article">
      <img src="https://via.placeholder.com/150" alt="Превью">
      <div class="article-content">
        <a href="#" class="article-title">10 трендов в программировании 2024 года</a>
        <p class="article-description">Мы изучили, какие технологии и языки программирования станут популярны в следующем году.</p>
        <div class="article-meta">Автор: Сергей Петров | 22 ноября 2024</div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>
