import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/Home.vue";
// import api from "@/utils/api";
// import auth from "@/utils/auth";

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },
  {
    path: "/about",
    name: "About",
    component: () =>
      import(/* webpackChunkName: "about" */ "../views/About.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

/* Interceptor de autenticacao */
router.beforeEach((to, _, next) => {
  return next();
  // return logout(to, next, true);
});

// const logout = async (to, next, redirect = false) => {
//   try {
//     await api.delete("/logout");
//     auth.logout();
//   } finally {
//     if (redirect) {
//       next({
//         path: "/login",
//         query: { redirect: to.fullPath, error: "token" },
//       });
//     } else {
//       next({
//         path: "/login",
//       });
//     }
//   }
// };

export default router;
