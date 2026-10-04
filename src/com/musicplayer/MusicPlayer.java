package com.musicplayer;

import java.util.*;

public class MusicPlayer {
	
	List<Song> allSongs=new ArrayList<>();
	List<Playlist> playlists=new ArrayList<>();
	
	public void addSongs(Song songs)
	{
		
		
		allSongs.add(songs);
	}
	public void updateSong(String songName,Song song)
	{
		for(int i=0;i<allSongs.size();i++)
		{
			if(allSongs.get(i).getSongTitle().equalsIgnoreCase(songName))
			{
				allSongs.set(i, song);
				System.out.println("Song Updated Sucessfully...........");
				return;
			}
		}
		System.out.println("Song not found.....");
	}
	public void deleteSong(String songName)
	{
		for(int i=0;i<allSongs.size();i++)
		{
			if(allSongs.get(i).getSongTitle().equalsIgnoreCase(songName))
			{
				allSongs.remove(i);
				System.out.println("Song seleted Sucessfully..........");
				return;
			}
		}
		System.out.println("Song not found..............");
		
	}
	public void displayAllSongs()
	{
		
		for(Song songs:allSongs)
		{
			System.out.println(songs);
		}
		
	}
	public void createPlayList(String playListName)
	{
		for(Playlist p:playlists)
		{
			if(p.getPlaylistName().equalsIgnoreCase(playListName)) 
			{
				System.out.println("Playlist already exixts.............");
				return;
			}
		}
		int playListId=1;
		Playlist pl=new Playlist(playListId++,playListName);
		playlists.add(pl);
		System.out.println("Playlist created sucessfully.........");
	}
	public void deletePlayList(String playListName)
	{
		for(int i=0;i<playlists.size();i++)
		{
			if(playlists.get(i).getPlaylistName().equalsIgnoreCase(playListName))
			{
				playlists.remove(i);
				System.out.println("Playlist deleted sucessfully.........");
				return;
			}
		}
		System.out.println("Playlist not found.......");
	}
	public void playPlayList(String playListName)
	{
		for(int i=0;i<playlists.size();i++)
		{
			if(playlists.get(i).getPlaylistName().equalsIgnoreCase(playListName))
			{
				System.out.println(playlists.get(i));
				System.out.println("Playlist is playing.....");
				return;
			}
		}
		System.out.println("Playlsit not found.....");
	}
	public Playlist getPlayList(String name)
	{
	    for (Playlist p : playlists)
	    {
	        if (p.getPlaylistName().equalsIgnoreCase(name))
	        {
	            return p;
	        }
	    }
	    return null;
	}
	public void displayAllPlayList()
	{
		for(Playlist pl:playlists)
		{
			System.out.println(pl.getPlaylistId()+" "+pl.getPlaylistName());
		}
	}
	public void addSongToPlaylist(String playListName, int songId)
	{
	    Playlist pl = getPlayList(playListName);

	    if (pl == null)
	    {
	        System.out.println("Playlist not found");
	        return;
	    }

	    for (Song song : allSongs)
	    {
	        if (song.getSongId() == songId)
	        {
	            pl.addSong(song);
	            System.out.println("Song added to playlist");
	            return;
	        }
	    }

	    System.out.println("Song not found");
	}
}
