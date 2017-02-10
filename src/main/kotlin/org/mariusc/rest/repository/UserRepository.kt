package org.mariusc.rest.repository

import org.mariusc.rest.model.User

/**
 * Created by MConstantin on 2/10/2017.
 */
class UserRepository {
    fun findBy(query: () -> String, consumer: (User?) -> Unit) {
    }
}