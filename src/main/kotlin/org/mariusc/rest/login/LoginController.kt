package org.mariusc.rest.login

import org.mariusc.rest.model.WebUser
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Marius Constantin on 2/9/2017.
 */
@RestController
@RequestMapping("/login")
class LoginController {

    @RequestMapping(value = "", method = arrayOf(RequestMethod.POST))
    fun login(@RequestBody user: WebUser): ResponseEntity<WebUser> {
        return ResponseEntity(user, HttpStatus.CREATED);
    }

}