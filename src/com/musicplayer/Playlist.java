package com.musicplayer;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Playable {

	private int playlistId;
	private String playlistName;
	
	public void setPlaylistId(int id)
	{
		this.playlistId=id;
	}
	public int getPlaylistId()
	{
		return playlistId;
	}
	public void setPlaylistName(String name)
	{
		this.playlistName=name;
	}
	public String getPlaylistName()
	{
		return playlistName;
	}
	
	public Playlist(int id,String name)
	{
		this.playlistId=id;
		this.playlistName=name;
	}
	List<Song> songList=new ArrayList<>();
	
	
	public void addSong(Song song)
	{
		songList.add(song);
	}
	
	public void removeSong(int id)
	{
		for(Song song:songList)
		{
			if(song.getSongId()==id)
			{
				songList.remove(song);
				System.out.println(song.getSongTitle()+"Song is removed");
				return;
			}
		}
		System.out.println("Song Not found in the playlist.....");
	}
	public void displaySongs()
	{
		for(Song song:songList)
		{
			System.out.println(song);
		}
	}
	
	
	
	@Override
	public void play(String title) {
		
		for(Song song:songList)
		{
			if(song.getSongTitle().equalsIgnoreCase(title))
			{
				System.out.println(song.getSongTitle()+" song is playing....");
				return;
			}
		}
		System.out.println("Song not found in playist....");
		
	}

	@Override
	public void play(int songId) {
	    for (Song song : songList) {
	        if (song.getSongId() == songId) {
	            System.out.println(song.getSongTitle() + " is playing...");
	            return;
	        }
	    }
	    System.out.println("Song not found in playist....");
	}

	@Override
public void pause(String title) {
		
		for(Song song:songList)
		{
			if(song.getSongTitle().equalsIgnoreCase(title))
			{
				System.out.println(song.getSongTitle()+" song is paused....");
				return;
			}
		}
		System.out.println("Song not found in playist....");
		
	}

	@Override
	public void pause(int songId) {
	    for (Song song : songList) {
	        if (song.getSongId() == songId) {
	            System.out.println(song.getSongTitle() + " is paused...");
	            return;
	        }
	    }
	    System.out.println("Song not found in playist....");
	}

	@Override
	public void stop(String title) {
		
		for(Song song:songList)
		{
			if(song.getSongTitle().equalsIgnoreCase(title))
			{
				System.out.println(song.getSongTitle()+" song is stopped....");
				return;
			}
		}
		System.out.println("Song not found in playist....");
		
	}
	@Override
	public void stop(int songId) {
	    for (Song song : songList) {
	        if (song.getSongId() == songId) {
	            System.out.println(song.getSongTitle() + " is stopped...");
	            return;
	        }
	    }
	    System.out.println("Song not found in playist....");
	}

}
