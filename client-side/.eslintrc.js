const env = process.env.NODE_ENV === "production" ? "warn" : "off";
module.exports = {
  root: true,
  env: {
    node: true
  },
  extends: ["plugin:vue/vue3-essential", "eslint:recommended", "@vue/prettier"],
  parserOptions: {
    parser: "babel-eslint"
  },
  rules: {
    "no-console": env,
    "no-debugger": env,
    quotes: [1, "double"],
    "no-unused-expressions": env,
    "no-unused-vars": env,
    "no-extra-boolean-cast": 'off',
    "no-empty": "warn"
  }
};