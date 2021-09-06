import axios from "axios";

import { refreshToken, extractExpirationTimeToken } from "./tokenUtil";

let baseURL = process.env.VUE_APP_URL_BASE;

export default function () {
  const config = axios.create({
    baseURL,
    withCredentials: true,
  });

  const api = axios.create(config);
  api.interceptors.response.use(
    (config) => {
      let user = null;
      try {
        user = JSON.parse(localStorage.getItem("user"));
      } catch (e) {
        // Empty
      }
      if (user) {
        const timeExpirationToken = extractExpirationTimeToken(user);
        if (timeExpirationToken > 0 && timeExpirationToken < 30) {
          refreshToken(user);
        }
      }
      return config;
    },
    (err) => {
      throw err;
    }
  );
  return api;
}
