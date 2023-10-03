import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import router from "./router";
import pinia from "./store";
import elementPlus from 'element-plus'
import 'element-plus/dist/index.css'
//导入所有element-plus图标
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import 'virtual:svg-icons-register'
import SvgIcon from './components/SvgIcon/Index.vue'
const app = createApp(App)
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(elementPlus)
app.use(router)
app.use(pinia)
app.component('svg-icon',SvgIcon)
app.mount('#app')

