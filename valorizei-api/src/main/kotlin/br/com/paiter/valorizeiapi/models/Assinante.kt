package br.com.paiter.valorizeiapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Document(collection = "assinantes")
data class Assinante(
    @Id var id: String,
    @NotNull var name: String,
    @Email var email: String
)