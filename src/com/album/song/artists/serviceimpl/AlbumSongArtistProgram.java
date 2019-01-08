package com.album.song.artists.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import com.album.song.artists.model.Album;
import com.album.song.artists.model.Artist;
import com.album.song.artists.model.Song;
import com.album.song.artists.service.AlbumSongArtistService;

public class AlbumSongArtistProgram implements AlbumSongArtistService {

	public static void main(String[] args) {

		AlbumSongArtistProgram artistProgram = new AlbumSongArtistProgram();
		Set<Song> songs = artistProgram.getSongSet();
		artistProgram.PrintDetailsOfAlbum(songs);

	}

	public Set<Song> getSongSet() {
		Set<Song> songs = new HashSet<Song>();

		Song song1 = new Song();

		song1.setName("Tagaru");

		song1.setAlbum(getTagaruAlbumDetail());

		song1.setArtists(getTagaruArtistDetails());

		songs.add(song1);

		return songs;
	}

	public Set<Artist> getTagaruArtistDetails() {
		Set<Artist> tagaruArtist = new HashSet<Artist>();
		Artist artist1 = new Artist();
		artist1.setArtistName("A R Rehman");
		artist1.setType("singer");
		tagaruArtist.add(artist1);

		return tagaruArtist;
	}

	public void PrintDetailsOfAlbum(Set<Song> songs) {

		for (Song song : songs) {
			System.out.println("--------------------");
			System.out.println("song name:" + song.getName());

			Set<Artist> artists = song.getArtists();
			for (Artist ar : artists) {
				System.out.println("artist name: " + ar.getArtistName());
				System.out.println("artist type:" + ar.getType());
			}

			Album al = song.getAlbum();
			System.out.println("album name:" + al.getAlbumname());
			System.out.println("release date:" + al.getRelease_date());

			System.out.println("-----------------------");

		}

	}

	public Album getTagaruAlbumDetail() {

		Album tagaruAlbum = new Album();
		tagaruAlbum.setAlbumname("TagaruAlbum");
		tagaruAlbum.setRelease_date("12/10/2018");
		return tagaruAlbum;

	}

}
