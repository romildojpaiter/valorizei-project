<template>
	<v-sheet
		id="contact"
		color="#333333"
		dark
		tag="section"
		tile
	>
		<div class="py-12"></div>

		<ValidationObserver v-slot="{ invalid }">
			<v-form @submit.prevent="addAtleta">
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

								<ValidationProvider name="nome" rules="required" v-slot="{ errors }">
									<v-text-field
										flat
										label="Nome*"
										solo
										v-model="form.name"
									/>
									<span>{{errors[0]}}</span>
								</ValidationProvider>

							</v-col>

							<v-col cols="12">
								<ValidationProvider name="email" rules="required|email" v-slot="{ errors }">
									<v-text-field
										flat
										label="E-mail*"
										solo
										v-model="form.email"
									/>
									<span>{{ errors[0] }}</span>
								</ValidationProvider>
							</v-col>

							<v-col cols="12">
								<ValidationProvider name="classe" rules="required" v-slot="{ errors }">
									<v-select
										flat
										solo
										v-model="form.classe"
										:items="classes"
										label="Classe*"
									/>
									<span>{{ errors[0] }}</span>
								</ValidationProvider>
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
									type="submit"
									:disabled="invalid"
									color="accent"
									x-large
								>
									Tenho Interesse
								</v-btn>
							</v-col>

						</v-row>
					</v-theme-provider>

				</v-container>
			</v-form>
		</ValidationObserver>

		<div class="py-12"></div>
	</v-sheet>

</template>

<script>
export default {
    name: 'IncricaoFormValidation',
    props:[],
    data: () => ({
        postado: false,
        form: {
            name: '',
            email: '',
            tipoClasse: '',
            observacao: ''
        }
    }),
    computed: {
        classes () {
            // return this.$store.getters.allProducts   // Cenário recebendo via um metódo GET
            return [
                'Atleta',
                'Organização',
                'Colaborador'
            ]
        }
    },
    methods: {
        resetForm() {
            this.$set(this.form, 'name', '');
            this.$set(this.form, 'email', '');
            this.$set(this.form, 'classe', '');
            this.$set(this.form, 'observacao', '');
        },
        addAtleta() {
            // alert(JSON.stringify(this.form));
            console.log(this.$store.state.atleta)
            this.postado = true
            this.$store.dispatch('addAtleta', this.form)
            this.resetForm();

            // chama as ações dentro da mutation, que manter o estado da aplicação
            // this.$store.commit(ADD_ATLETA, this.form);
        }
    }

}
</script>
