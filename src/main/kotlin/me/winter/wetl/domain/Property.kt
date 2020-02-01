package me.winter.wetl.domain

interface Property<T: Any> {
    val path: String
    val name: String
    val value: T
}