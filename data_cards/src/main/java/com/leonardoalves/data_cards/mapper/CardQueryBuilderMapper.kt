package com.leonardoalves.data_cards.mapper

import com.leonardoalves.data_cards.model.Filter
import com.leonardoalves.data_cards.model.TextQuery
import com.leonardoalves.data_common.model.CardType
import io.pokemontcg.requests.CardQueryBuilder

object CardQueryBuilderMapper {
    operator fun invoke(cardType: CardType?, filter: Filter?) = CardQueryBuilder(
        supertype = if (cardType != CardType.UNKNOWN) cardType?.displayName else null,
        types = filter?.types?.joinToString(separator = "|")?.ifBlank { null },
        subtype = filter?.subTypes?.joinToString(separator = "|")?.ifBlank { null },
        contains = filter?.contains?.joinToString(separator = "|") { it.toLowerCase() }?.ifBlank { null },
        setCode = filter?.expansions?.joinToString(separator ="|") { it.code }?.ifBlank { null },
        rarity = filter?.rarity?.joinToString(separator = "|") { it.key }?.ifBlank { null },
        retreatCost = filter?.retreatCost,
        attackCost = filter?.attackCost,
        attackDamage = filter?.attackDamage,
        hp = filter?.hp,
        evolvesFrom = filter?.evolvesFrom,
        weaknesses = filter?.weaknesses?.joinToString(separator = "|") { it.displayName }?.ifBlank { null },
        resistances = filter?.resistances?.joinToString(separator = "|") { it.displayName }?.ifBlank { null },
        pageSize = 100
        ).apply {
//        val regex = Regex(p.regex, RegexOption.IGNORE_CASE)
//        val newQuery = regex.replace(newQuery, p.replacement)
//        val adjustedQuery = proxies?.apply(query) ?: query
//
//        // Set search field accordingly
//        when(filter?.textQuery?.type ?: TextQuery.TextFieldType.NAME) {
//            TextQuery.TextFieldType.NAME -> request.name = adjustedQuery
//            TextQuery.TextFieldType.TEXT -> request.text = adjustedQuery
//            TextQuery.TextFieldType.ABILITY_NAME -> request.abilityName = adjustedQuery
//            TextQuery.TextFieldType.ABILITY_TEXT -> request.abilityText = adjustedQuery
//            TextQuery.TextFieldType.ATTACK_NAME -> request.attackName = adjustedQuery
//            TextQuery.TextFieldType.ATTACK_TEXT -> request.attackText = adjustedQuery
//        }
    }
}