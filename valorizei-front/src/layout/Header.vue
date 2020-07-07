<template>

    <v-app-bar
      app
      color="white"
      height="100"
    >
        <v-avatar
            class="mr-3"
            color="grey lighten-5"
            size="70"
        >
            <v-img
                contain
                max-height="70%"
                src="https://cdn.vuetifyjs.com/images/logos/vuetify-logo-dark.png" />

        </v-avatar>

        <v-toolbar-title class="font-weight-black headline">
            Valorizei APP
        </v-toolbar-title>

        <div id="nav">
            <router-link to="/">Home</router-link> |
            <router-link to="/about">About</router-link>
        </div>

    </v-app-bar>
    
</template>

<script>
    export default {
        name: 'Header'
    }
</script>

