<template>
  <div class="home">
    <router-link to="/user">사용자 목록</router-link>
    <br />
    <button @click="getData">데이터 호출</button>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HomeView',
  methods: {
    getData() {
      axios
        .post('http://localhost:8080/findAll')
        .then((response) => {
          console.log(response)
        })
        .catch((error) => {
          console.log(error)
        })
    }
  }
}
</script>

<style scoped>
.home {
  text-align: center;
}
a {
  color: black;
  text-decoration: none;
  font-weight: bold;
  font-size: 1.5rem;
}
</style>
