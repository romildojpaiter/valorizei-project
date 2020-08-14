import Vue from 'vue/dist/vue.js';

// Define a new component called button-counter
Vue.component('ChildComponent', {
    // declare the props
    props: ['message'],
    created() {
        // Access props value from template
        console.log(this.message)
    },
    data: function () {
        return {
            count: 0
        }
    },
    // bind props value to template
    template: '<div>{{ message }}</div>'
});

