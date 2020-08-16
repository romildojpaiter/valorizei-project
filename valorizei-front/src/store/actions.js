/* eslint-disable */

// ./src/store/actions
import axios from 'axios'
const API_BASE = `${process.env.VUE_APP_URL}/api`

// console.log(`Your App URL is ${process.env.VUE_APP_URL}`); // undefined
// const dotenv = require('dotenv');
// dotenv.config();
// console.log(dotenv); // 8626

import {
  ADD_ATLETA,
  ADD_ATLETA_SUCCESS,
  ADD_PRODUCT,
  ADD_PRODUCT_SUCCESS,
  PRODUCT_BY_ID,
  PRODUCT_BY_ID_SUCCESS,
  UPDATE_PRODUCT,
  UPDATE_PRODUCT_SUCCESS,
  REMOVE_PRODUCT,
  REMOVE_PRODUCT_SUCCESS,
  ALL_PRODUCTS,
  ALL_PRODUCTS_SUCCESS,
  ALL_MANUFACTURERS,
  ALL_MANUFACTURERS_SUCCESS
} from './mutation-types'

export const atletaActions = {
    addAtleta ({commit}, payload) {
        commit(ADD_ATLETA);

        setTimeout(() => {
            commit(ADD_ATLETA_SUCCESS, {"mensagem":"Inserido com sucesso"})
        }, 1000);

        // axios.post(`${API_BASE}/atletas`, payload).then(response => {
        //     commit(ADD_ATLETA_SUCCESS, response.data)
        // })
    }
}

export const productActions = {
  allProducts ({commit}) {
    commit(ALL_PRODUCTS)
    axios.get(`${API_BASE}/products`).then(response => {
      commit(ALL_PRODUCTS_SUCCESS, response.data)
    })
  },
  productById ({commit}, payload) {
    commit(PRODUCT_BY_ID)
    axios.get(`${API_BASE}/products/${payload}`).then(response => {
      console.log(payload, response.data)
      commit(PRODUCT_BY_ID_SUCCESS, response.data)
    })
  },
  addProduct ({commit}, payload) {
    commit(ADD_PRODUCT)
    axios.post(`${API_BASE}/products`, payload).then(response => {
      commit(ADD_PRODUCT_SUCCESS, response.data)
    })
  },
  updateProduct ({commit}, payload) {
    commit(UPDATE_PRODUCT)
    axios.put(`${API_BASE}/products/${payload._id}`, payload).then(response => {
      commit(UPDATE_PRODUCT_SUCCESS, response.data)
    })
  },
  removeProduct ({commit}, payload) {
    commit(REMOVE_PRODUCT)
    axios.delete(`${API_BASE}/products/${payload}`, payload).then(response => {
      console.debug('response', response.data)
      commit(REMOVE_PRODUCT_SUCCESS, response.data)
    })
  }
}

export const manufacturerActions = {
  allManufacturers ({commit}) {
    commit(ALL_MANUFACTURERS)
    axios.get(`${API_BASE}/manufacturers`).then(response => {
      commit(ALL_MANUFACTURERS_SUCCESS, response.data)
    })
  }
}


