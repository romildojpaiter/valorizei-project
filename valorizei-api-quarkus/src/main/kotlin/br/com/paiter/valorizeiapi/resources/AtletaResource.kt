package br.com.paiter.valorizeiapi.resources

import br.com.paiter.valorizeiapi.models.Atleta
import br.com.paiter.valorizeiapi.repositories.AtletaRepository
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/atleta")
class AtletaResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun add(atleta : Atleta) : Atleta {
        atleta.persist()
        return atleta
    }

}