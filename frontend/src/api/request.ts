import axios from "axios";
const service = axios.create({
    baseURL: 'http://localhost:8001',
    timeout: 1000
})
export default service