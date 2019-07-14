package com.leonardoalves.data_cards

import com.leonardoalves.data_cards.mapper.CardQueryBuilderMapper
import com.leonardoalves.data_cards.model.Filter
import com.leonardoalves.data_common.model.CardType
import io.pokemontcg.Pokemon

class CardsInfrastructure(
    private val pokemonApi: Pokemon
    ) {
        fun searchCardNetwork(cardType: CardType?, query: String, filter: Filter?){
            val cardQueryBuilder = CardQueryBuilderMapper(cardType, filter)

        }
}