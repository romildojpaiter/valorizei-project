<template>
	<div>
		<div v-bind:class="{ title: isAuth }">

			<child-component :message="mgs"/>

			<!-- Outlet fora children routes -->
			<router-view></router-view>

		</div>
	</div>
</template>

<script>
    // import ChildComponent from '@/components/ChildComponent.vue'
    import Vue from 'vue/dist/vue.js';

    // Define a new component called button-counter
    var ChildComponent = Vue.component('ChildComponent', {
        // declare the props
        props: ['message'],
        created() {
            // Access props value from template
            console.log("Componente Child: " + this.message)
        },
        data: function () {
            return {
                count: 0
            }
        },
        // bind props value to template
        //template: '<div>{{ message }}</div>'
        template: '<button v-on:click="count++">You clicked me {{ count }} times.</button>'
    });

    export default {
        name: 'Admin',
        data: () => ({
            mgs: 'Texto para entrar no componente',
            isAuth: true
        }),
        components: {
            ChildComponent
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
