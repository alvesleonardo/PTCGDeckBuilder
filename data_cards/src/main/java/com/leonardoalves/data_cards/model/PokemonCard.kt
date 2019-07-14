package com.leonardoalves.data_cards.model


import android.os.Parcelable
import com.leonardoalves.data_cards.model.Ability
import com.leonardoalves.data_cards.model.Attack
import com.leonardoalves.data_cards.model.Effect
import com.leonardoalves.data_cards.model.Expansion
import io.pokemontcg.model.SuperType
import io.pokemontcg.model.SubType
import io.pokemontcg.model.Type
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PokemonCard(
    val id: String,
    val name: String,
    val nationalPokedexNumber: Int?,
    val imageUrl: String,
    val imageUrlHiRes: String,
    val types: List<Type>?,
    val supertype: SuperType,
    val subtype: SubType,
    val evolvesFrom: String?,
    val hp: Int?,
    val retreatCost: List<Type>?,
    val number: String,
    val artist: String,
    val rarity: String?,
    val series: String,
    val expansion: Expansion?,
    val text: List<String>?,
    val attacks: List<Attack>?,
    val weaknesses: List<Effect>?,
    val resistances: List<Effect>?,
    val ability: Ability?,
    val isCached: Boolean = false
) : Parcelable