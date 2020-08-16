<!-- ./src/App.vue -->
<template>
	<v-app>
		<Header />
		<v-main>
			<router-view/>
		</v-main>
		<HomeFooter />

        <div class="overlay" v-show="showLoader">
            <div class="loading-spinner">
                <div class="dot dotOne"></div>
                <div class="dot dotTwo"></div>
                <div class="dot dotThree"></div>
            </div>
        </div>

	</v-app>
</template>

<script>
// mutations-type
import ADD_ATLETA_SUCCESS from '@/store/mutation-types'

//
import toastr from 'toastr';

// imports of components
import Header from '@/layout/Header';
import HomeFooter from '@/layout/Footer';

export default {
    name: 'App',
    components: {
        Header,
        HomeFooter
    },
    created () {
        // Subscriptions for mutation
        this.$store.subscribe((mutation) => {
            if (mutation.payload) {
                switch (mutation.type) {
                    case ADD_ATLETA_SUCCESS :
                        toastr.success('Atleta incluido com sucesso!', 'Sucesso!')
                        break
                }
            }
        })
    },
    computed: {
        showLoader () {
            // Loading spinner
            return this.$store.state.showLoader
        }
    }
}
</script>

<style>
  .overlay {
    background: rgba(255, 255, 255, 0.6);
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
  }
  .loading-spinner {
    position : absolute;
    top      : 50%;
    left     : 50%;
    -webkit-transform : translateX(-50%) translateY(-50%);
    -moz-transform : translateX(-50%) translateY(-50%);
    transform : translateX(-50%) translateY(-50%);
  }
  .dot {
    background    : black;
    border-radius : 100%;
    color         : white;
    height        : 8px;
    line-height   : 8px;
    text-align    : center;
    width         : 8px;
  }
  .dotOne {
    -webkit-animation : dotOneKeyframes 5s ease  infinite;
    background        : #F9E610;
    position          : absolute;
    top               : 0;
    left              : 0;
  }
  .dotTwo {
    -webkit-animation : dotTwoKeyframes 5s ease 0.4166666666666s infinite;
    background        : #EFDB06;
    position          : absolute;
    top               : 0;
    left              : 14px;
  }
  .dotThree {
    -webkit-animation : dotThreeKeyframes 5s ease 0.83333333333s infinite;
    background        : #DBC906;
    position          : absolute;
    top               : 14px;
    left              : 14px;
  }
</style>
