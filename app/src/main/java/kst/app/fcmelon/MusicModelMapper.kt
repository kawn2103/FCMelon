package kst.app.fcmelon

import kst.app.fcmelon.Service.MusicDto
import kst.app.fcmelon.Service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )

fun MusicDto.mapper(): PlayerModel =
    PlayerModel(
        playMusicList = musics.mapIndexed { index, musicEntity ->
        musicEntity.mapper(index.toLong())
        }
    )