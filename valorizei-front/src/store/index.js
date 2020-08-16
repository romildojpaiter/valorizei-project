// ./src/store/index
import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

// Import getters
import { productGetters, manufacturerGetters, atletasGetters } from './getters'
import { atletaMutations, productMutations, cartMutations, manufacturerMutations } from './mutations'
import { atletaActions, productActions, manufacturerActions } from './actions'

export default new Vuex.Store({
    strict: true,
    state: {
        // bought atleta
        atleta: {},
        // bought items
        cart: [],
        // ajax loader
        showLoader: false,
        // selected product
        product: {},
        // all products
        // all manufacturers
        manufacturers: []
    },
    // GETTERS
    getters: Object.assign({}, productGetters, manufacturerGetters, atletasGetters),
    mutations: Object.assign({}, productMutations, atletaMutations, cartMutations, manufacturerMutations),
    actions: Object.assign({}, atletaActions, productActions, manufacturerActions)
})
