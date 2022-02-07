package com.example.restfulwebservice.user

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.NOT_FOUND)
class UserNotFoundExceptIon(override val message: String?) : RuntimeException() {

}