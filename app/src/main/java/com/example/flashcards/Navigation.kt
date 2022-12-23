package com.example.flashcards

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import java.security.InvalidParameterException


enum class Screen {
    Auth,
    Collections,
    FlashCards,
}

fun Fragment.navigate(to: Screen, from: Screen) {
    if (to == from) {
        throw InvalidParameterException("Can't navigate to $to")
    }

    when (to) {
        Screen.Auth -> {
            findNavController().navigate(R.id.auth_fragment)
        }

        Screen.Collections -> {
            findNavController().navigate(R.id.collections_fragment)
        }

        Screen.FlashCards -> {
            findNavController().navigate(R.id.flashcards_fragment)
        }
    }
}