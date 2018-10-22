package com.sys1yagi.mastodon4j.api.entity

import com.google.gson.annotations.SerializedName

class VideoAttachment: Attachment<VideoAttachment.VideoMetadataEntry>() {

    data class VideoMetadataEntry(
            @SerializedName("width") val width: Int = 0,
            @SerializedName("height") val height: Int = 0,
            @SerializedName("framerate") val framerate: Int = 0,
            @SerializedName("duration") val duration: Float = 0F,
            @SerializedName("bitrate") val bitrate: Float = 0F
    )
}


class GifvAttachment: Attachment<GifvAttachment.VideoMetadataEntry>() {

    data class VideoMetadataEntry(
            @SerializedName("width") val width: Int = 0,
            @SerializedName("height") val height: Int = 0,
            @SerializedName("framerate") val framerate: Int = 0,
            @SerializedName("duration") val duration: Float = 0F,
            @SerializedName("bitrate") val bitrate: Float = 0F
    )
}