const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

// http://localhost:8080/api    < '/api'
/*
const target = 'http://localhost:8080'
module.exports = {
  devServer: {
    port: 8080,
    proxy: {
      '^/api': {
        target,
        changOrigin: true
      }
    }
  }
}
*/
