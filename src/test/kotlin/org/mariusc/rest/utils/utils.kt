package org.mariusc.rest.utils

import org.mockito.Mockito

/**
 * Created by Marius Constantin on 2/8/2017.
 */

inline fun <reified T : Any> mock()=Mockito.mock(T::class.java)