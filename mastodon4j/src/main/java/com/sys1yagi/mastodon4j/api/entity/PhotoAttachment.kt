package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

class PhotoAttachment: Attachment<PhotoAttachment.ImageMetadataEntry>() {

    data class ImageMetadataEntry(
            @SerializedName("width") val width: Int,
            @SerializedName("height") val height: Int,
            @SerializedName("aspect") val aspect: Float
    )
}