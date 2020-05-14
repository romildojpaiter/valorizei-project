package br.com.paiter.valorizeiapi.services

import br.com.paiter.valorizeiapi.models.User
import br.com.paiter.valorizeiapi.repositories.UserRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class UserService(val repository : UserRepository) {

    fun save(user : User) = repository.save(user)

    fun findAll() = repository.findAll()

    fun findById(id: String) = repository.findById(id)

    fun delete(id: String) {
        val user = findById(id)
        repository.delete(user.get());
    }

}