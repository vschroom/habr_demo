<script setup lang="ts">
import {RouterLink, RouterView} from 'vue-router'
import HelloWorld from './components/HelloWorld.vue'
import ArticlesView from "@/views/ArticlesView.vue";
</script>

<template>

  <header>
    <div class="logo">Мой Хабр</div>
    <div class="nav-container">
      <nav>
        <a href="#">Все потоки</a>
        <a href="#">Разработка</a>
        <a href="#">Администрирование</a>
        <a href="#">Дизайн</a>
        <a href="#">Научпоп</a>
        <a href="#">Карьера</a>
      </nav>
    </div>
    <div class="header-actions">
      <div class="search-container">
        <input type="text" placeholder="Поиск...">
        <button>&#x1F50D;</button>
      </div>
      <a href="#" class="header-button publish">Написать</a>
      <a href="#" class="header-button tracker">Трекер</a>
      <!-- Иконка пользователя -->
      <div class="user-icon">
        <img src="https://via.placeholder.com/20" alt="Пользователь">
      </div>
    </div>
  </header>
  <main class="container">

    <RouterView/>

    <div class="sidebar">
      <h3>Популярное</h3>
      <div class="sidebar-item"><a href="#">Как выбрать свой первый язык программирования</a></div>
      <div class="sidebar-item"><a href="#">Преимущества использования Docker для разработчиков</a></div>
      <div class="sidebar-item"><a href="#">Почему стоит начать заниматься машинным обучением</a></div>
      <h3>Читаемые публикации</h3>
      <div class="sidebar-item"><a href="#">Как я написал свой первый большой проект</a></div>
      <div class="sidebar-item"><a href="#">Что такое agile и как его использовать в команде</a></div>
      <h3>Подписка на авторов</h3>
      <div class="sidebar-item">
        <a href="#" class="sidebar-button">Подписаться</a>
      </div>
    </div>

  </main>

  <!-- Футер -->
  <footer>
    <p>&copy; 2024 Мой Хабр. Все права защищены.</p>
    <p>
      <a href="#">Правила</a> |
      <a href="#">Контакты</a> |
      <a href="#">Реклама</a>
    </p>
  </footer>


</template>

<style scoped>


/* Шапка */
header {
  background-color: #2d2d2d;
  color: white;
  padding: 15px 20px;
  position: sticky;
  top: 0;
  z-index: 1000;
  display: flex;
  align-items: center;
  justify-content: space-between;
}

header .logo {
  font-size: 24px;
  font-weight: bold;
}

.nav-container {
  display: flex;
  align-items: center;
  gap: 20px;
}

nav {
  display: flex;
  gap: 20px;
}

nav > a {
  color: white;
  text-decoration: none;
  font-size: 14px;
  position: relative;
  padding: 5px 0;
}

nav > a:hover {
  color: #00bfff;
}

/* Поиск и кнопки */
.header-actions {
  display: flex;
  align-items: center;
  gap: 15px;
}

.search-container {
  position: relative;
}

.search-container input {
  padding: 5px 10px;
  border: none;
  border-radius: 20px;
  font-size: 14px;
}

.search-container button {
  position: absolute;
  right: 5px;
  top: 5px;
  background: none;
  border: none;
  color: #888;
  cursor: pointer;
}

.search-container button:hover {
  color: #00bfff;
}

.header-button {
  padding: 8px 15px;
  border-radius: 20px;
  font-size: 14px;
  font-weight: bold;
  text-decoration: none;
  text-align: center;
  cursor: pointer;
}

.header-button.publish {
  background-color: #00bfff;
  color: white;
  border: none;
}

.header-button.publish:hover {
  background-color: #008ecc;
}

.header-button.tracker {
  background-color: #ffffff;
  color: #333;
  border: 1px solid #ddd;
}

.header-button.tracker:hover {
  background-color: #f3f3f3;
}

/* Иконка пользователя */
.user-icon {
  width: 30px;
  height: 30px;
  border-radius: 50%;
  background-color: #ddd;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.user-icon img {
  width: 20px;
  height: 20px;
  border-radius: 50%;
}

/* Основная часть */
.container {
  max-width: 1200px;
  margin: 20px auto;
  padding: 0 20px;
  display: flex;
  gap: 20px;
  flex: 1;
}

/* Сайдбар */
.sidebar {
  width: 300px;
  background-color: #ffffff;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  padding: 15px;
  flex-shrink: 0;
}

.sidebar h3 {
  font-size: 18px;
  margin-bottom: 15px;
}

.sidebar-item {
  font-size: 14px;
  color: #333;
  margin-bottom: 10px;
}

.sidebar-item a {
  color: #007BFF;
  text-decoration: none;
}

.sidebar-item a:hover {
  text-decoration: underline;
}

.sidebar-button {
  padding: 10px;
  background-color: #00bfff;
  color: white;
  text-align: center;
  font-weight: bold;
  border-radius: 5px;
  text-decoration: none;
}

.sidebar-button:hover {
  background-color: #008ecc;
}

/* Футер */
footer {
  background-color: #2d2d2d;
  color: white;
  padding: 20px;
  text-align: center;
  margin-top: 40px;
  position: absolute;
  bottom: 0;
  width: 100%;
}

footer a {
  color: #00bfff;
  text-decoration: none;
}

footer a:hover {
  text-decoration: underline;
}

</style>
