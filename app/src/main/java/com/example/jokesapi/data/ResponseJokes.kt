package com.example.jokesapi.data

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class ResponseJokes(
    @SerializedName("category")
    val category: String?,
    @SerializedName("error")
    val error: Boolean?,
    @SerializedName("flags")
    val flags: Flags?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("joke")
    val joke: String?,
    @SerializedName("lang")
    val lang: String?,
    @SerializedName("safe")
    val safe: Boolean?,
    @SerializedName("type")
    val type: String?
) {
    @Keep
    data class Flags(
        @SerializedName("explicit")
        val explicit: Boolean?,
        @SerializedName("nsfw")
        val nsfw: Boolean?,
        @SerializedName("political")
        val political: Boolean?,
        @SerializedName("racist")
        val racist: Boolean?,
        @SerializedName("religious")
        val religious: Boolean?,
        @SerializedName("sexist")
        val sexist: Boolean?
    )
}