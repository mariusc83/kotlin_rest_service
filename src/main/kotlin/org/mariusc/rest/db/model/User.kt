package org.mariusc.rest.db.model

import org.jetbrains.exposed.dao.EntityID
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.mariusc.rest.db.Users

/**
 * Created by MConstantin on 2/13/2017.
 */
class User(id: EntityID<Int>) : IntEntity(id) {
    companion object : IntEntityClass<User>(Users)

    var name by Users.name
    var password by Users.password
}