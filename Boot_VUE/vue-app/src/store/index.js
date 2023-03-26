import { createStore } from 'vuex'

export default createStore({
  state() {
    return {
      user: {}
    }
  },
  mutations: {
    setUser(state, value) {
      state.user = value
    }
  }
})
