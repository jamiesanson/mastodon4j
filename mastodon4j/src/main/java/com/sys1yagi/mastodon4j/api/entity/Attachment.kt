package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

/**
 * see more https://github.com/tootsuite/documentation/blob/master/Using-the-API/API.md#attachment
 */
open class Attachment<T>(
        @SerializedName("id") val id: Long = 0L,
        @SerializedName("type") val type: String = Type.Image.value,
        @SerializedName("url") val url: String = "",
        @SerializedName("remote_url") val remoteUrl: String? = null,
        @SerializedName("preview_url") val previewUrl: String = "",
        @SerializedName("text_url") val textUrl: String? = null,
        @SerializedName("meta") val metadata: Metadata<T>? = null) {

    enum class Type(val value: String) {
        Image("image"),
        Video("video"),
        Gifv("gifv")
    }

    data class Metadata<Entry>(
            @SerializedName("small") val small: Entry,
            @SerializedName("original") val original: Entry
    )

}
