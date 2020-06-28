package br.com.paiter.valorizeiapi.response

data class Response<T>(
        val errors: List<String> = arrayListOf(),
        var data: T? = null
)