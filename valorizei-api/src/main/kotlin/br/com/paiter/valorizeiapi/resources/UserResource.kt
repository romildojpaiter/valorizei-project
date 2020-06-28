package br.com.paiter.valorizeiapi.resources

import br.com.paiter.valorizeiapi.models.User
import br.com.paiter.valorizeiapi.services.UserService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserResource(val service : UserService) {

    @GetMapping(produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun users() = service.findAll();

    @PostMapping(consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun save(@RequestBody user : User) : User {
        return service.save(user);
    }

    @GetMapping("/{id}")
    fun user(@PathVariable("id") id : String) = service.findById(id)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id : String) {
        service.delete(id)
    }

}