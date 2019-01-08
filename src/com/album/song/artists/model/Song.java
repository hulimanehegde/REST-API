package com.album.song.artists.model;


import java.util.Set;
/**
 * 
 * @author ts-shreedhar.hegde
 *
 */
public class Song {
		
	String name;
	Set<Artist> artists;
	Album album;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Artist> getArtists() {
		return artists;
	}
	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
}
