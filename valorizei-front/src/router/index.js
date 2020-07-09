import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

// Admin components
import Admin from '@/views/admin/Admin.vue'
import Atleta from '../views/admin/Atleta.vue'
import Empresa from '../views/admin/Empresa.vue'
import ListaAtletas from '../views/admin/ListaAtletas.vue'
import ListaEmpresas from '../views/admin/ListaEmpresas.vue'


Vue.use(VueRouter)

const routes = [
	{
		path: '/',
		name: 'Home',
		component: Home
	},
	{
		path: '/about',
		name: 'About',
		// route level code-splitting
		// this generates a separate chunk (about.[hash].js) for this route
		// which is lazy-loaded when the route is visited.
		component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
	},
	{
		path: '/admin',
		name: 'Admin',
		component: Admin,
		// Child routes
		children: [
			// {
			// 	path: '',
			// 	name: 'DashboardAdmin',
			// 	component: ListaAtletas
			// },
			{
				path: 'atletas',
				name: 'ListaAltetas',
				component: ListaAtletas
			},
			// Declaração de rota com passagem de parametro
			{
				path: 'atleta/:id',
				name: 'Alteta',
				component: Atleta
			},
			{
				path: 'empresas',
				name: 'ListaEmpresas',
				component: ListaEmpresas
			},
			{
				path: 'empresa/:id',
				name: 'Empresa',
				component: Empresa
			},
		]
	},

]

const router = new VueRouter({
mode: 'history',
base: process.env.BASE_URL,
routes
})

export default router
