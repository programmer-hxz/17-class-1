<template>
  <div class="hello">
    <h4 style="color: red;">{{msg}}</h4>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Tips:输入信息，点击提交，即可查看所需信息'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
