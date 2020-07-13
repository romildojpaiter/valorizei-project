package br.com.paiter.valorizeiapi.resources

import br.com.paiter.valorizeiapi.models.User
import javax.ws.rs.*
import javax.ws.rs.core.MediaType


@Path("/user")
class UserResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun add(user: User) : User {

        return user;
    }



}