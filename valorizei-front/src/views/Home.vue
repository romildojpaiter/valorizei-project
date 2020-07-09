<template>

    <div>		
		<valorizei />
		<incricao-form />
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
			IncricaoForm:  () => import('@/layout/sections/InscricaoForm'),
		}
	}
</script>
