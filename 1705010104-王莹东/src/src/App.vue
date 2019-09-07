<template>
  <div id="app">
    <HelloWorld/>
    <Table />
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld'
import Table from './components/Table'

export default {
  name: 'App',
  components: {
    HelloWorld,
    Table
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
