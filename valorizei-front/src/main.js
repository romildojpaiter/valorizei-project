import Vue from 'vue'
import App from './App.vue'
import vuetify from './plugins/vuetify';
import router from './router'

// Incluindo vee-validate
import { ValidationObserver, ValidationProvider, extend, localize } from 'vee-validate';
// import en from 'vee-validate/dist/locale/en.json';
import pt_BR from 'vee-validate/dist/locale/pt_BR.json';
import * as rules from 'vee-validate/dist/rules';

// install rules and localization
Object.keys(rules).forEach(rule => {
  extend(rule, rules[rule]);
});

// Definindo a linguagem principal como pt_BR
localize('pt_BR', pt_BR);

// Register it globally
Vue.component('ValidationObserver', ValidationObserver);
Vue.component('ValidationProvider', ValidationProvider);


Vue.config.productionTip = false

new Vue({
  vuetify,
  router,
  render: h => h(App)
}).$mount('#app')
