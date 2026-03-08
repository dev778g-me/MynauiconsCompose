package com.dev.mynauicons_compose

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MynauiconsCompose",
    ) {
        App()
    }
}