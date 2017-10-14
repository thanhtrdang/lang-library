package io.i101.library.lang

inline val <T: Any> T.qualifiedName: String
    get() = this::class.qualifiedName!!.removeSuffix(".Companion")

inline val <T: Any> T.simpleName: String
    get() = javaClass.simpleName.removeSuffix("CompanionObject")