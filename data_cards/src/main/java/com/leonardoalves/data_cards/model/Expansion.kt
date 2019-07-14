package com.leonardoalves.data_cards.model


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Expansion(
        val code: String,
        val ptcgoCode: String?,
        val name: String,
        val series: String,
        val totalCards: Int,
        val standardLegal: Boolean,
        val expandedLegal: Boolean,
        val releaseDate: String,
        val symbolUrl: String,
        val logoUrl: String?
) : Parcelable