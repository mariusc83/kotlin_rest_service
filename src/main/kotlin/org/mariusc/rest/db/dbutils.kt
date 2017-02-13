package org.mariusc.rest.db

import org.jetbrains.exposed.dao.IntIdTable

/**
 * Created by MConstantin on 2/10/2017.
 */

object Users : IntIdTable("users") {

    val name = varchar("users", 50).index()
    val password = varchar("password", 200).index()

}
