<template>
  <div class="hello">
    {{msg}}
  </div>
</template>

<script>
import HelloService from '@/services/HelloService'
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  async created () {
    let res = await HelloService.hello()
    console.log(res)
    this.msg = res.data
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
