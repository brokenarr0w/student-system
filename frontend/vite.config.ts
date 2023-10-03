import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import {createSvgIconsPlugin} from 'vite-plugin-svg-icons'
import path from 'path'
// https://vitejs.dev/config/
function resolve(dir){
  return path.join(__dirname,'.',dir)
}
export default defineConfig({
  plugins: [vue(),
  createSvgIconsPlugin({
    iconDirs: [path.resolve(process.cwd(),'src/icons/svg')],
    symbolId: 'icon-[dir]-[name]'
  })
  ],
})
