<template>
  <div class="inp">
    <div class="form-group ">
      <label>年份</label>
      <input class="form-control" type="number" min="1965"  v-model="years" placeholder="年份" />
    </div>
    <div class="form-group ">
      <label>字长</label>
      <select v-model="bits" class="form-control">
        <option value="1">1字（16位）</option>
        <option value="2">2字（32位）</option>
        <option value="4">4字（64位）</option>
      </select>
    </div>
    <div class="form-group ">
      <label>工资</label>
      <input class="form-control" type="number" min="1"  v-model="salaries" placeholder="请输入程序员的平均工资(美元/月)" />
    </div>
    <div class="form-group ">
      <label>数量</label>
      <input class="form-control" type="number"  min="1"  v-model="sum" placeholder="请输入程序员每天的开发数量(指令/天)" />
    </div>
    <div>
      <button class="button btn  btn-primary" @click="compute" >提交</button>
    </div>
    <div class="result" v-show="res.show">
      <table class="table">
        <thead>
          <tr>
            <td>计算机存储容量估计(字)</td>
            <td>存储器价格(美元)</td>
            <td>装满程序所需成本(美元)</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td >{{result.volume}}</td>
            <td >{{result.value}}</td>
            <td >{{result.chengben}}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
  export default {
    data(){
      return {
        years : '',
        bits : '',
        salaries : '',
        sum : '',
        result :{
          volume :'',
          value:'',
          chengben :'',
          show:false
        }
      }
    },
    methods:{
      compute(){
        if(this.years.trim() == ''||this.bits.trim() == ''||this.salaries.trim() == ''||this.sum.trim() == '')
        {
          alert("输入内容不能为空！")
          return ;
        }
        if(this.years.trim()[0] == '-'||this.bits.trim()[0] == '-'||this.salaries.trim()[0] == '-'||this.sum.trim()[0] == '-')
        {
          alert("输入内容不能为负数！")
          return ;
        }
        if(this.years < 1965){
          alert("年份不能小于1965！")
          return ;
        }
        console.log(this.result)
        this.result.volume = 4080 * Math.exp(0.28*(this.years - 1960));
        this.result.value = 0.048 * Math.pow(0.72,(this.years - 1974)*1.0) * this.bits;
       // this.result.chengben = this.result.volume * this.result.value + this.result.volume* this.salaries / (this.sum*this.bits)*30;
        this.result.chengben = this.result.volume* this.salaries / (this.sum*this.bits)*30;
        this.result.show = true;
      }
    },
    computed:{
      res(){
        return this.result
      }
    }
  }
</script>

<style>
  label{
    margin: 10px;
  }
  .inp {
    padding: 30px;
  }

  .form-control {
    width: 30%;
    margin: 0 auto;
    display: inline-block;
  }

  .button {
    width: 10%;
    margin: 0 auto;
  }

  .table{
    margin:40px auto ;
    width: 30%;
  }
  .result{
  }
</style>
