import axios from "axios";

export default function() {
  const config = axios.create({
    baseURL: process.env.VUE_APP_URL,
    withCredentials: true,
  });

  const api = axios.create(config);
  return api;
}
