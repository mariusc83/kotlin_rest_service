package org.mariusc.rest.repository

import org.mariusc.rest.model.WebUser

/**
 * Created by MConstantin on 2/10/2017.
 */
class UserRepository {
    fun findBy(query: () -> String, consumer: (WebUser?) -> Unit) {
    }
}