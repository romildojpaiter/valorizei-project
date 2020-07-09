<template>
	<div>
		<div v-bind:class="{ title: isAuth }">
			{{mgs}}

			<!-- Outlet fora children routes -->
			<router-view></router-view>
			
		</div>
	</div>
</template>

<script>
export default {
	name: 'Admin',
	data: () => ({
		mgs: 'Aqui vai o texto',
		isAuth: true

	}),
	components: {

	},
	methods: {

	}
}
</script>

<style scoped>
	.title{
		color: blue;	
	}
</style>