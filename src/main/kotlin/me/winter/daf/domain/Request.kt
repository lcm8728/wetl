package me.winter.daf.domain

interface Request {
    val properties: List<Property<out Any>>
}