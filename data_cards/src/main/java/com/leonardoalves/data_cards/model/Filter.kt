package com.leonardoalves.data_cards.model


import android.os.Parcelable
import io.pokemontcg.model.SubType
import io.pokemontcg.model.SuperType
import io.pokemontcg.model.Type
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Filter(
    val textQuery: TextQuery? = null,
    val types: List<Type> = emptyList(),
    val superType: SuperType? = null,
    val subTypes: List<SubType> = emptyList(),
    val contains: List<String> = emptyList(),
    val expansions: List<Expansion> = emptyList(),
    val rarity: List<Rarity> = emptyList(),
    val retreatCost: String? = null,
    val attackCost: String? = null,
    val attackDamage: String? = null,
    val hp: String? = null,
    val evolvesFrom: String? = null,
    val weaknesses: List<Type> = emptyList(),
    val resistances: List<Type> = emptyList()
) : Parcelable {

    val isEmpty: Boolean
        get() {
            return (types.isEmpty() && subTypes.isEmpty() && contains.isEmpty() && expansions.isEmpty()
                    && rarity.isEmpty() && retreatCost.isNullOrBlank() && attackCost.isNullOrBlank()
                    && attackDamage.isNullOrBlank() && hp.isNullOrBlank() && weaknesses.isEmpty()
                    && evolvesFrom.isNullOrBlank() && resistances.isEmpty() && superType == null && textQuery == null)
        }

    companion object {
        val DEFAULT by lazy {
            Filter()
        }
    }

    override fun toString(): String {
        return "Filter(field=$textQuery, type=$types, superType=$superType, subTypes=$subTypes, " +
                "contains=$contains, rarity=$rarity, retreatCost=$retreatCost, attackCost=$attackCost, " +
                "attackDamage=$attackDamage, hp=$hp, evolvesFrom=$evolvesFrom, weaknesses=$weaknesses, " +
                "resistances=$resistances)"
    }
}