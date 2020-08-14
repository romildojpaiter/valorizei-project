<template>

    <div>
		<valorizei />
		<inscricao-form />
    </div>

</template>

<script>
	// @ is an alias to /src
	import Valorizei from '@/layout/sections/Valorizei'

	export default {
		name: 'Home',
// 	    data: function() { return {} }, below we have shorthand
		data() {
			return {

			}
		},
		components: {
			Valorizei,
			// InscricaoForm:  () => import('@/layout/sections/InscricaoForm'),
			InscricaoForm:  () => import('@/layout/sections/InscricaoFormValidation'),
		}
	}
</script>
