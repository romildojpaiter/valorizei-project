package br.com.paiter.valorizeiapi.models

import io.quarkus.mongodb.panache.MongoEntity
import io.quarkus.mongodb.panache.PanacheMongoEntityBase
import org.bson.codecs.pojo.annotations.BsonCreator
import org.bson.codecs.pojo.annotations.BsonProperty
import org.bson.types.ObjectId

@MongoEntity(collection = "Atleta")
data class Atleta constructor(
        var id: ObjectId?,
        var name: String,
        var email: String,
        var tipoClasse: TipoClasse,
        var observacao: String?)
    : PanacheMongoEntityBase() {

    constructor() : this(
            null,
            "",
            "",
            TipoClasse.ATLETA,
            "")
}