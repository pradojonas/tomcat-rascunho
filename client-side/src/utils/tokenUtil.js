import api from "./api";

export const refreshToken = user => {
  api.post(process.env.VUE_APP_URL_BASE + "/refresh").then(response => {
    user.timeExpirantionToken = response.data;
    localStorage.setItem("user", JSON.stringify(user));
  });
};

export const extractExpirationTimeToken = ({ timeExpirantionToken }) => {
  const dateExpirationToken = new Date(timeExpirantionToken).getTime();
  const dateNow = new Date().getTime();
  return (dateExpirationToken - dateNow) / (1000 * 60);
};
