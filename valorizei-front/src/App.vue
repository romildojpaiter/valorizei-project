<!-- ./src/App.vue -->
<template>
	<v-app>
		<Header />
		<v-content>
			<router-view/>
		</v-content>
		<HomeFooter />
	</v-app>
</template>

<script>
	// imports of components
	import Header from '@/layout/Header';
	import HomeFooter from '@/layout/Footer';

	export default {
		name: 'App',
		components: {
			Header,
			HomeFooter
		}
	}
</script>
