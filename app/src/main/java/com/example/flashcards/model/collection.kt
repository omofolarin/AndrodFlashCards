package com.example.flashcards.model

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MetaData(
    val createdAt: LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC),
    val updatedAt: LocalDateTime? = null
)

@Serializable
data class Collection(
    val id: String = "",
    val title: String = "",
    val summary: String = "",
    val metaData: MetaData
)


@Serializable
data class FlashCard(
    val id: String,
    val collectionId: String,
    val collection: Collection? = null,
    val frontFace: FlashCardFront,
    val backFace: FlashCardBack,
    val color: String = Color.White.toString(),
    val stats: Stats
)

@Serializable
data class FlashCardFront(
    val question: String,
    val hint: String?
)


@Serializable
data class FlashCardBack(
    val answer: String,
    val selfAsses: SelfAsses?,
    val keywords: Set<String> = setOf(),
)


@Serializable
enum class SelfAsses {
    DoNotKnowThat,
    IKnowThat,
}

@Serializable
data class Stats(
    val noOfShuffles: Int,
    val lastShuffled: LocalDateTime,

)