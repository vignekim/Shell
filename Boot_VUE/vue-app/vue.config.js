/*
const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})
*/
const target = 'http://localhost:8080'
module.exports =  {
  devServer: {
    //proxy: target
    port: 8080,
    proxy: {
      '^/api': {
        target, changeOrigin: true
      }
    }
  }
}
