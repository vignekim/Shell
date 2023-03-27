<template>
  <div class="container mt-3">
    <h1 class="display-1 text-center">사용자 정보</h1>
    <form>
      <div class="mb-3 mt-3">
        <label for="name" class="form-label">이름:</label>
        <input type="text" class="form-control" id="name" placeholder="이름을 입력하세요." name="name" readonly v-model="result.name" />
      </div>
      <div class="mb-3 mt-3">
        <label for="email" class="form-label">이메일:</label>
        <input type="email" class="form-control" id="email" placeholder="이메일를 입력하세요." name="email" readonly v-model="result.email" />
      </div>
      <div class="mb-3">
        <label for="pwd" class="form-label">비밀번호:</label>
        <input type="password" class="form-control" id="pwd" placeholder="비밀번호를 입력하세요." name="pwd" readonly v-model="result.pwd" />
      </div>
      <div class="d-flex">
        <div class="p-2 flex-fill" v-if="result.gender">
          <div class="form-check">
            <input type="radio" class="form-check-input" id="radio1" name="gender" v-bind:value="true" checked v-model="result.gender" />
            <label class="form-check-label" for="radio1">남성</label>
          </div>
        </div>

        <div class="p-2 flex-fill" v-else>
          <div class="form-check">
            <input type="radio" class="form-check-input" id="radio2" name="gender" v-bind:value="false" checked v-model="result.gender" />
            <label class="form-check-label" for="radio2">여성</label>
          </div>
        </div>
      </div>
    </form>
    <div class="d-flex">
      <div class="p-2 flex-fill d-grid">
        <button type="button" class="btn btn-primary" @click="edit">수정</button>
      </div>
      <div class="p-2 flex-fill d-grid">
        <button type="button" class="btn btn-primary" @click="del">삭제</button>
      </div>
      <div class="p-2 flex-fill d-grid">
        <button type="button" class="btn btn-primary" @click="cancel">취소</button>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'SelectView',
  data() {
    return {
      result: {}
    }
  },
  created() {
    this.result = this.$store.state.user
  },
  methods: {
    edit() {
      this.$router.push({ name: 'UpdateView' })
    },
    del() {
      const params = { params: { no: this.result.no } }
      axios
        .delete(process.env.VUE_APP_BASEURL + '/delete', params)
        .then((res) => {
          if (res.data.state) {
            this.cancel()
          } else {
            alert(res.data.message)
          }
        })
        .catch((err) => console.log(err))
    },
    cancel() {
      this.$store.commit('setUser', {})
      sessionStorage.removeItem('setUser')
      this.$router.push({ name: 'ListView' })
    }
  }
}
</script>
