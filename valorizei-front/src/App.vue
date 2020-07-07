<template>

	<div id="app">
		<v-app>
			
			<Header />

			<v-content>
				<router-view/>
			</v-content>

			<HomeFooter />
			
		</v-app>
	</div>
	
</template>

<script>

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
