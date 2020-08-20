package br.com.paiter.valorizeiapi.resources

import br.com.paiter.valorizeiapi.models.Atleta
import br.com.paiter.valorizeiapi.repositories.AtletaRepository
import io.quarkus.mongodb.panache.PanacheQuery
import org.bson.types.ObjectId
import org.eclipse.microprofile.graphql.GraphQLApi
import org.eclipse.microprofile.graphql.Mutation
import org.eclipse.microprofile.graphql.Name
import org.eclipse.microprofile.graphql.Query
import javax.inject.Inject


@GraphQLApi
class AtletaResourceGraphQl {

    @Inject
    lateinit var atletaRespository : AtletaRepository

    @Query
    @Name("listAtletas")
    fun listAtletas() : MutableList<Atleta>? =
            atletaRespository.listAll()

    @Query
    @Name("atletaById")
    fun findById(id: ObjectId): Atleta = atletaRespository.findById(id)


    @Mutation
    fun createAtleta(alteta: Atleta?): Atleta? {
        atletaRespository.persist(alteta)
        return alteta
    }

}