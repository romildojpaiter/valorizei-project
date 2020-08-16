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
        mounted() {
            // console.log(process.env.NODE_ENV);
            // console.log(process.env.VUE_APP_URL);
            // console.log(process.env.VUE_APP_TITLE);
            // console.log(process.env.VUE_APP_VERSION);
        },
		components: {
			Valorizei,
			// InscricaoForm:  () => import('@/layout/sections/InscricaoForm'),
			InscricaoForm:  () => import('@/layout/sections/InscricaoFormValidation'),
		}
	}
</script>
