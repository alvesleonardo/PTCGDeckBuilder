package com.leonardoalves.data_common.model

enum class CardType(internal var text: String? = null) {
    ENERGY("Energy"),
    POKEMON("Pokémon"),
    TRAINER("Trainer"),
    UNKNOWN;

    val displayName: String
        get() = text ?: name.toLowerCase().capitalize()


    companion object {
        val VALUES by lazy { values() }

        fun find(text: String): CardType {
            val supertype = VALUES.find { it.text.equals(text, true) } ?: UNKNOWN
            if (supertype == UNKNOWN) {
                supertype.text = text
            }
            return supertype
        }
    }
}