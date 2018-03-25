package digital.wup.superheroapp.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val id: String,
    val name: String,
    val imageUrl: String
)