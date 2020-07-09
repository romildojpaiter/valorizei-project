<!-- ./src/views/admin/Atleta.vue -->

<template>
	<div>
		<h1> Esse é o atleta número: {{$route.params.id}} </h1>
	</div>
</template>

<script>
export default {
	name: 'Atleta',
	created() {
		console.log(this.$route.params.id);
	}
}
</script>