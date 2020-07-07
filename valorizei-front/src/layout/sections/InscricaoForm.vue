<template>
	<v-sheet
		id="contact"
		color="#333333"
		dark
		tag="section"
		tile
	>
		<div class="py-12"></div>

		<v-container>

		<h2 class="display-2 font-weight-bold mb-3 text-uppercase text-center">Contact Me</h2>

		<v-responsive
			class="mx-auto mb-12"
			width="56"
		>
			<v-divider class="mb-1"></v-divider>

			<v-divider></v-divider>
		</v-responsive>

		<ValidationProvider name="email" rules="required|email">

			<v-theme-provider light>
			<v-row>
				<v-col cols="12">
					<v-text-field
						flat
						label="Name*"
						solo
					/>
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
						{{name}}
					</v-textarea>
				</v-col>

				<v-col
					class="mx-auto"
					cols="auto"
				>
					<v-btn
						color="accent"
						x-large
						v-on:click="enrolAssinante"
					>
						Tenho Interesse
					</v-btn>
				</v-col>
			</v-row>
			</v-theme-provider>

		</ValidationProvider>

		</v-container>

		<div class="py-12"></div>
	</v-sheet>    
</template>

<script>
	// Imports
	import { ValidationProvider } from 'vee-validate';

	export default {
		name: 'IncricaoForm',
		data()  {
			return {
				name: {
					type: String,
					required: true
				}
			}
		},
		components: {
			ValidationProvider
		},
		methods: {
			enrolAssinante() {
				this.name = "Romildo Paiter" 
				alert("Fui clicado eeee");
			}
		}

	}
</script>