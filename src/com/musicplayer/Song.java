package com.musicplayer;

public class Song {
	
	private int songId;
	private String songTitle;
	private String artist;
	private int duration;
	
	
	public Song(int id,String title,String artistName,int duration)
	{
		this.songId=id;
		this.songTitle=title;
		this.artist=artistName;
		this.duration=duration;
	}
	
	public void setSongId(int songId)
	{
		this.songId=songId;
	}
	public int getSongId()
	{
		return this.songId;
	}
	public void setSongTitle(String title)
	{
		this.songTitle=title;
	}
	public String getSongTitle()
	{
		return this.songTitle;
	}
	
	public void setArtist(String artist)
	{
		this.artist=artist;
	}
	public String getArtist()
	{
		return this.artist;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public int getDuration()
	{
		return this.duration;
	}
	public String toString()
	{
		return "Song ID : "+songId+" Title of the song : "+songTitle+" Artist of the song : "+artist+" Duration of the song : "+duration;
	}

}
