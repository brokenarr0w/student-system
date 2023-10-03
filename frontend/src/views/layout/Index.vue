<script setup lang="ts">

</script>

<template>
  <div id="ebg">

  </div>
<div class="common-layout">
  <el-container>
<!-- 左侧菜单 start  -->
    <el-aside>
    这里左边内容
    </el-aside>
<!-- 左侧菜单 end  -->
    <el-container>
<!--   顶部导航栏 start  -->
      <el-header>
      这里顶部内容
      </el-header>
<!--   顶部导航栏 end    -->
    </el-container>
<!--  主要内容  -->
    <el-main>
    <router-view>这里放主要内容</router-view>
    </el-main>
  </el-container>
</div>
</template>

<style scoped>
.el-header{
  --el-header-padding: 0px;
  --el-header-height: atuo;
  height: 80px;
  background-color: #f3f3f3;
}
.el-main{
  background-color: #f3f3f3;

}
.el-container{
  height: 100%;
}
.common-layout{
  width: 99vw;
  height: 98vh;
  position: fixed;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  margin: auto;
  background-color: white;
  border-radius: 15px;
  overflow: hidden;
}
#ebg{
  width: 100%;
  height: 100%;
  position: fixed;
  top: 0;
  left: 0;
  padding: 10px;
  background-image: url("../../assets/system-bg.jpg");
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
}
</style>