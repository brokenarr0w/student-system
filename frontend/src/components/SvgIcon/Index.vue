<script lang="ts">
 import {computed} from "vue";
 export default {
   name: 'baseSvgIcon',
   props: {
     iconClass: {type:String},
     className: {type:String},
   },
   setup(props){
     const iconName = computed(() => {
       return props.iconClass ? `#icon-${props.iconClass}` : '#icon'
     })
     const className = computed(() => {
       return props.className ? `svg-icon${props.className}` : 'svg-icon'
     })
     return {iconName,className}
   }
 }
</script>

<template>
<svg :class="svgClass" aria-hidden="true">
  <use :xlink:href="iconName"></use>
</svg>
</template>

<style scoped>
.svg-icon{
  width: 1em;
  height: 1em;
  vertical-align: -0.15em;
  fill: currentColor;
  overflow: hidden;
}
</style>