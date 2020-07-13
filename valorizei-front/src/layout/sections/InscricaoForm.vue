<template>
	<v-sheet
		id="contact"
		color="#333333"
		dark
		tag="section"
		tile
	>
		<div class="py-12"></div>

		<v-form ref="form" v-model="valid" :lazy-validation="lazy">
			<v-container>

				<h2 class="display-2 font-weight-bold mb-3 text-uppercase text-center">SABER MAIS</h2>

				<v-responsive
					class="mx-auto mb-12"
					width="56">
					<v-divider class="mb-1"></v-divider>
					<v-divider></v-divider>
				</v-responsive>

				<v-banner v-if="postado">Obrigado por seu interesse, logo entraremos em contato com mais informações</v-banner>

				<v-theme-provider light>
					<v-row>

						<v-col cols="12">
							<v-text-field
								flat
								label="Nome*"
								solo
								v-model="form.name"
								:counter="10"
								:rules="nameRules"
								required
							/>
						</v-col>

						<v-col cols="12">
							<v-text-field
								flat
								label="E-mail*"
								solo
								v-model="form.email"
								:rules="emailRules"
								required
							/>
							<span>{{ errors[0] }}</span>
						</v-col>

						<v-col cols="12">
							<v-select
								flat
								solo
								v-model="form.classe"
								:items="classes"
								:rules="[v => !!v || 'Informe a Classe']"
								label="Classe*"
								required
							></v-select>
						</v-col>

						<v-col cols="12">
							<v-textarea
								flat
								label="Deixe sua opnião"
								solo
								v-model="form.observacao"
							>
							</v-textarea>
						</v-col>

						<v-col
							class="mx-auto"
							cols="auto"
						>
							<v-btn
								:disabled="!valid"
								color="accent"
								x-large
								@click="enrolAssinante">
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
	export default {
		name: 'IncricaoForm',
		props:[],
		data: () => ({
			value: '',
			tituloMensagem: 'Aqui vai um texto personalizado.',
			errors: [],
			valid: true,
			lazy: false,
			postado: false,
			form: {
				name: '',
				email: '',
				tipoClasse: '',
				observacao: ''
			},
			classes: [
				'Atleta',
				'Organização',
				'Colaborador'
			],
			nameRules: [ 			// Rules to fields of form
				v => !!v || 'O campo nome é obrigátorio',
				v => (v && v.length <= 10) || 'O campo nome deve ter menos de 10 caracteres',
			],
			emailRules: [
				v => !!v || 'E-mail is required',
				v => /.+@.+\..+/.test(v) || 'E-mail must be valid',
			],

		}),
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
				this.postado = true;
				this.resetForm();
			},			
		}

	}
</script>