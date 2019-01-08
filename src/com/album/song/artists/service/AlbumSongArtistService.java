package com.album.song.artists.service;

import java.util.Set;

import com.album.song.artists.model.Album;
import com.album.song.artists.model.Artist;
import com.album.song.artists.model.Song;

public interface AlbumSongArtistService {

	public Album getTagaruAlbumDetail();
    public void PrintDetailsOfAlbum(Set<Song> songs);
	public Set<Artist> getTagaruArtistDetails();
	public Set<Song> getSongSet();
}
