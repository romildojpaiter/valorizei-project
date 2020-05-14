package br.com.paiter.valorizeiapi.services

import br.com.paiter.valorizeiapi.repositories.UserRepository
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.slf4j.LoggerFactory


internal class UserServiceTest {

    @InjectMocks
    lateinit var userService: UserService;

    @Mock
    lateinit var userRepository: UserRepository;

    @Test
    fun save() {

    }

//    companion object {
//
//        val logger = LoggerFactory.getLogger(this.javaClass)
//
//        @BeforeAll
//        @JvmStatic
//        internal fun `init`() {
//            logger.info("Passei no init Primeiro")
//            MockitoAnnotations.initMocks(this);
//        }
//
//        @AfterAll
//        @JvmStatic
//        internal fun `after`() {
//            logger.info("Passei no after depois")
//        }
//
//    }
}