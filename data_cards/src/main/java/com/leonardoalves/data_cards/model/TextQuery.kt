package com.leonardoalves.data_cards.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class TextQuery(val type: TextFieldType, val text: String): Parcelable {

    enum class TextFieldType {
        NAME,
        TEXT,
        ABILITY_NAME,
        ABILITY_TEXT,
        ATTACK_NAME,
        ATTACK_TEXT;

        companion object {
            val VALUES by lazy { values() }
        }
    }
}