import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import router from './router'

Vue.config.productionTip = false


import { ValidationProvider, extend } from 'vee-validate';

// Add a rule.
extend('secret', {
  validate: value => value === 'example',
  message: 'This is not the magic word'
});

// Register it globally
Vue.component('ValidationProvider', ValidationProvider);

// const config = {
//     aria: true,
//     classNames: {},
//     classes: false,
//     delay: 0,
//     dictionary: null,
//     errorBagName: 'errors', // change if property conflicts
//     events: 'input|blur',
//     fieldsBagName: 'fields',
//     i18n: null, // the vue-i18n plugin instance
//     i18nRootKey: 'validations', // the nested key under which the validation messages will be located
//     inject: true,
//     locale: 'en',
//     validity: false,
//     useConstraintAttrs: true
// };


new Vue({
  vuetify,
  router,
  render: h => h(App)
}).$mount('#app')
