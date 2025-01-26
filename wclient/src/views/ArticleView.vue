<script setup lang="ts">

import {ref, watchEffect} from 'vue'

const todoId = ref(1)
const todoData = ref(null)

watchEffect(async () => {
  console.log("D");
  const data = await fetchData();
  console.log(data);
});

async function fetchData() {



  const res = await fetch(
      `https://jsonplaceholder.typicode.com/todos/${todoId.value}`
  )
  return await res.json();
}

</script>

<template>
  <div>
    <div class="article-header">
      <h1>Как я стал разработчиком</h1>
      <div class="article-meta">
        <span>Автор: Иван Иванов</span>
        <span>24 ноября 2024</span>
      </div>
    </div>

    <div class="article-content">
      <p>
        В этой статье я расскажу о своем пути в разработку. Это было непросто, но невероятно интересно.
        Сначала я увлекся программированием в школе, изучая Pascal. Позже я понял, что это моя страсть.
      </p>
      <p>
        После окончания университета я начал работать в небольшой компании, где научился многому.
        Теперь я работаю в крупной компании и наслаждаюсь решением сложных задач.
      </p>
    </div>

    <div class="tags">
      <a href="#">Разработка</a>
      <a href="#">Карьера</a>
      <a href="#">Истории успеха</a>
    </div>

    <div class="author-box">
      <img src="https://via.placeholder.com/80" alt="Автор">
      <div class="author-info">
        <h3>Иван Иванов</h3>
        <p>Разработчик с 5-летним опытом. Увлекается Python, JavaScript и веб-приложениями.</p>
      </div>
    </div>

    <div class="comments-section">
      <h3>Комментарии (2)</h3>
      <div class="comment">
        <div class="author">Анна Смирнова</div>
        <div class="text">Очень вдохновляющая статья, спасибо!</div>
      </div>
      <div class="comment">
        <div class="author">Петр Петров</div>
        <div class="text">Много полезной информации, буду ждать новых публикаций.</div>
      </div>
    </div>
  </div>

</template>

<style scoped>

.article-header {
  border-bottom: 1px solid #ddd;
  padding-bottom: 15px;
  margin-bottom: 20px;
}

.article-header h1 {
  font-size: 30px;
  font-weight: bold;
  margin-bottom: 10px;
}

.article-meta {
  display: flex;
  justify-content: space-between;
  font-size: 14px;
  color: #999;
}

.article-content {
  font-size: 16px;
  line-height: 1.8;
  color: #444;
}

.article-content p {
  margin-bottom: 15px;
}

.tags {
  margin-top: 30px;
  padding-top: 15px;
  border-top: 1px solid #ddd;
}

.tags a {
  display: inline-block;
  background-color: #eef;
  padding: 5px 10px;
  border-radius: 5px;
  font-size: 14px;
  color: #007BFF;
  margin-right: 10px;
  margin-bottom: 10px;
}

.tags a:hover {
  background-color: #d7e5ff;
}

.author-box {
  margin-top: 40px;
  display: flex;
  align-items: center;
  background-color: #f9f9f9;
  border: 1px solid #ddd;
  padding: 15px;
  border-radius: 8px;
}

.author-box img {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  margin-right: 20px;
}

.author-box .author-info {
  font-size: 14px;
  color: #555;
}

.author-box .author-info h3 {
  margin-bottom: 5px;
  font-size: 18px;
}

.comments-section {
  margin-top: 40px;
  padding-top: 15px;
  border-top: 1px solid #ddd;
}

.comments-section h3 {
  font-size: 20px;
  margin-bottom: 15px;
}

.comment {
  margin-bottom: 20px;
  padding: 15px;
  background-color: #f9f9f9;
  border: 1px solid #ddd;
  border-radius: 8px;
}

.comment .author {
  font-weight: bold;
  margin-bottom: 5px;
}

.comment .text {
  font-size: 14px;
  color: #555;
}

</style>
