package com.dev.mynauicons_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform