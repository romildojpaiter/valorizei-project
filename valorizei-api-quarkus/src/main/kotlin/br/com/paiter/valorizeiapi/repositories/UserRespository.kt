package br.com.paiter.valorizeiapi.repositories

import br.com.paiter.valorizeiapi.models.User
import io.quarkus.mongodb.panache.PanacheMongoRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheMongoRepository<User> {
    
}