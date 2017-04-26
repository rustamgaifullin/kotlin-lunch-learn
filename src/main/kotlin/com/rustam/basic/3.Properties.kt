package com.rustam.basic


class Track {
    val lenght: Int = 123
    val name: String = "TrackName"
    val format: String = "mp3"

    var thumbnails: Byte = 0
}

fun main(args: Array<String>) {
    val track = Track()

//    track.name = ""
    track.thumbnails = 256.toByte()
}