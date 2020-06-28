package br.com.paiter.valorizeiapi.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
        @Id var id: String,
        var name: String,
        var age: Int
)