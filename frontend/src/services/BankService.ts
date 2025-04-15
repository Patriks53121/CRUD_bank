import axios from 'axios';

const REST_API_BASE_URL = 'http://localhost:8080/api/bank/list';

export const listComponents = () => axios.get(REST_API_BASE_URL);