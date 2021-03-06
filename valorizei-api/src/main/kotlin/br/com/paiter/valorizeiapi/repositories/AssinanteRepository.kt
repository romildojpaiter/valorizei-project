package br.com.paiter.valorizeiapi.repositories

import br.com.paiter.valorizeiapi.models.Assinante
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component

@Component
interface AssinanteRepository : MongoRepository<Assinante, String> {

}