import api from "../utils/api";
const pathBase = "/rascunho-projeto";

export default () => {
  async function getRascunho(queryParam) {
    return await api().get(`${pathBase}/rascunho`);
  }

  return { getRascunho };
};
