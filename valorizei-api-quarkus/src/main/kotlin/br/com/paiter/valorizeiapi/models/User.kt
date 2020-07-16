package br.com.paiter.valorizeiapi.models

import io.quarkus.mongodb.panache.MongoEntity
import io.quarkus.mongodb.panache.PanacheMongoEntity
import org.bson.types.ObjectId

@MongoEntity(collection = "User")
data class User(val id: ObjectId,
                val name: String,
                val email: String,
                val tipoClasse: TipoClasse,
                val observacao: String) : PanacheMongoEntity()