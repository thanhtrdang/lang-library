package io.i101.library.lang

import org.apache.commons.lang3.StringUtils as util

fun String.normalizeSpace(): String = util.normalizeSpace(this)
fun String.stripAccents(): String = util.stripAccents(this)