package br.com.paiter.valorizeiapi.repositories

import br.com.paiter.valorizeiapi.models.Atleta
import io.quarkus.mongodb.panache.PanacheMongoRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class AtletaRepository : PanacheMongoRepository<Atleta> {
    
}