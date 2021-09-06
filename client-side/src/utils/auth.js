import api from '@/utils/api'

async function loginRequest(login, senha, callback) {
  try {
    const response = await api.login(login, senha)
    const responseCallBack = {
      authenticated: true,
      expires: 90,
      responseData: response.data
    }
    callback(responseCallBack)
  } catch (e) {
    const responseData = {
      authenticated: false,
      erro: e.response
    }
    callback(responseData)
  }
}

const auth = {
  isLogged: false,
  login(email, pass, callback) {
    if (this.isLogged && callback) {
      let login = {
        authenticated: true
      };
      return callback(login)
    }
    loginRequest(email, pass, (res) => {
      if (res.authenticated) {
        this.isLogged = true
        localStorage.isLogged = true
        localStorage.expires = res.expires
        localStorage.user = JSON.stringify(res.responseData)
        if (callback) callback(res)
      } else {
        if (callback) callback(res)
      }
    })
  },
  getExpires() {
    return localStorage.expires
  },
  logout() {
    this.isLogged = false
    delete localStorage.isLogged
    delete localStorage.user
  },
  loggedIn() {
    return !!localStorage.isLogged
  }
}
auth.isLogged = auth.loggedIn()

window.$auth = auth

export default auth