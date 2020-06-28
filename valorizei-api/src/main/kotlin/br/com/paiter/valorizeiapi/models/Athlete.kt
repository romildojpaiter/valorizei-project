package br.com.paiter.valorizeiapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.LocalDateTime
import javax.validation.constraints.Email
import javax.validation.constraints.NotNull

@Document(collection = "athletes")
data class Athlete (
        @Id var id: String,
        @NotNull var name: String,
        @Email var email: String,
        val dtRegister: LocalDateTime = LocalDateTime.now()
)