package com.android.hello;

import java.io.Serializable;

public class PlaySongTest implements Serializable{

	public PlaySongTest(){
		
	}
	private static final long serialVersionUID = -7091765374664622438L;

	private String songName;
	private String songArtistAlbum;
	private int songRating;
	private String songDuration;
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongArtistAlbum(String songArtistAlbum) {
		this.songArtistAlbum = songArtistAlbum;
	}
	public String getSongArtistAlbum() {
		return songArtistAlbum;
	}
	public void setSongRating(int songRating) {
		this.songRating = songRating;
	}
	public int getSongRating() {
		return songRating;
	}
	public void setSongDuration(String songDuration) {
		this.songDuration = songDuration;
	}
	public String getSongDuration() {
		return songDuration;
	}
}
