<template>
  <router-view />
</template>

<script>
export default {
  created() {
    const user = sessionStorage.getItem('setUser')
    if (user) {
      //console.log(user, this.base64(user))
      this.$store.commit('setUser', this.base64(user))
    }
  },
  methods: {
    base64(user) {
      return JSON.parse(decodeURIComponent(window.atob(user)))
    }
  }
}
</script>
