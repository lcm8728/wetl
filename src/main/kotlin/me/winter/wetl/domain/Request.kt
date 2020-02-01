package me.winter.wetl.domain

interface Request {
    val properties: List<Property<out Any>>
}