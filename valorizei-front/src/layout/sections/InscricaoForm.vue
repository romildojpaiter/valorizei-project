<template>
	<v-sheet
		id="contact"
		color="#333333"
		dark
		tag="section"
		tile
	>
		<div class="py-12"></div>

		<v-form @submit.prevent="handleSubmit">
			<v-container>

				<h2 class="display-2 font-weight-bold mb-3 text-uppercase text-center">Contact Me</h2>

				<v-responsive
					class="mx-auto mb-12"
					width="56">
					<v-divider class="mb-1"></v-divider>
					<v-divider></v-divider>
				</v-responsive>


				<v-theme-provider light>
					<v-row>

						<v-col cols="12">
							<ValidationProvider name="name" rules="secret" v-slot="{ errors }">
								<v-text-field
									flat
									label="Name*"
									solo
									v-model="form.name"
								/>
								<p>You type: {{ form.name }}</p>
								<span>{{errors[0]}}</span>
								<!-- <span class="small text-danger" v-show="errors.has('name')">Name is required</span> -->
							</ValidationProvider>
						</v-col>

						<v-col cols="12">
						<v-text-field
							flat
							label="Email*"
							solo
						/>
						</v-col>

						<v-col cols="12">
						<v-text-field
							flat
							label="Subject*"
							solo
						></v-text-field>
						</v-col>

						<v-col cols="12">
							<v-textarea
								flat
								label="Message*"
								solo
							>

							</v-textarea>
						</v-col>

						<v-col
							class="mx-auto"
							cols="auto"
						>
							<v-btn
								color="accent"
								x-large
								v-on:click="enrolAssinante">
								Tenho Interesse
							</v-btn>
						</v-col>
					</v-row>
				</v-theme-provider>

			</v-container>
		</v-form>

		<div class="py-12"></div>
	</v-sheet>   

</template>

<script>
	// Imports
	import { ValidationProvider } from 'vee-validate';

	export default {
		name: 'IncricaoForm',
		data: () => ({
			value: '',
			errors: [],
			form: {
				name: '',
				email: '',
				message: '',
			},
		}),
		components: {
			ValidationProvider
		},
		methods: {
			enrolAssinante() {
				console.log(this.errors);
				alert("Fui clicado eeee");
			},
			resetForm() {
				this.$set(this.form, 'name', '');
				this.$set(this.form, 'email', '');
				this.$set(this.form, 'message', '');
			},
			handleSubmit() {
				// TODO: How to send this to Netlify?
				alert("handleSubmit clicked");
				this.resetForm();
			},			
		}

	}
</script>