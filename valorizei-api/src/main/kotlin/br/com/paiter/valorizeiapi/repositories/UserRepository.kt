package br.com.paiter.valorizeiapi.repositories

import br.com.paiter.valorizeiapi.models.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Component

@Component
interface  UserRepository : MongoRepository<User, String> {

}