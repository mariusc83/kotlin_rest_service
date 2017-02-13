package org.mariusc.rest.model

import org.mariusc.rest.db.model.User

/**
 * Created by Marius Constantin on 2/9/2017.
 */
class WebUser(val user: User) {
    val name: String = user.name;
    val password: String = user.password;
    val server_id: Int = user.id.value;
}