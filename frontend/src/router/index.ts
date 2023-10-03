import {createRouter,createWebHashHistory} from "vue-router";
import Nprogress from "../config/nprogress.ts";
//定义路由
const routes = [
    {
    path: '/',
    name: 'Login',
    meta: {
        title: '学生信息管理系统-登录'
    },
    component: import("../views/Login.vue")
}]

const router = createRouter({
    routes: routes,
    history: createWebHashHistory()
})
//路由拦截守卫
router.beforeEach(async (to, from, next) => {
    //进度条
    Nprogress.start()
    next()
})
router.afterEach(() => {
    Nprogress.done()
})
router.onError(error => {
    Nprogress.done()
    console.warn("路由错误",error.message)
})
export default router
